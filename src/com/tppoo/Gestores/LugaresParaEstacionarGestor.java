package com.tppoo.Gestores;
import com.tppoo.APIs.EstacionamientoApi;
import com.tppoo.APIs.ILugarParaEstacionar;
import com.tppoo.APIs.ParquimetroApi;
import com.tppoo.dtos.EstacionamientoDto;
import com.tppoo.dtos.ParquimetroDto;
import com.tppoo.Entidades.lugarDisponible;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LugaresParaEstacionarGestor {
    private ILugarParaEstacionar<EstacionamientoDto> _estacionamientoApi;
    private ILugarParaEstacionar<ParquimetroDto> _parquimetroApi;

    public LugaresParaEstacionarGestor(){
        this._estacionamientoApi = new EstacionamientoApi();
        this._parquimetroApi = new ParquimetroApi();
    }

    public List<lugarDisponible> ObtenerLugaresParaEstacionarCercanos(String direccion){

        //obtengo estacionamientos y parquimetros disponibles cercanos
        List<EstacionamientoDto> estacionamientosEncontrados = this._estacionamientoApi.LugaresDisponiblesCercanos(direccion);
        List<ParquimetroDto> parquimetrosEncontrados = this._parquimetroApi.LugaresDisponiblesCercanos(direccion);

        List<lugarDisponible> lugares = new ArrayList<lugarDisponible>();
        for(EstacionamientoDto estacionamiento : estacionamientosEncontrados){

            //busco si hay algun parquimetro esta en la misma ubicacion que el estacionamiento
            Optional<ParquimetroDto> encontrado = parquimetrosEncontrados.stream().filter(x-> x.Ubicacion.equals(estacionamiento.Ubicacion)).findFirst();

            //si encuentro, me quedo con la cantidad de parquimetros y elimino el parquimetro de la lista para no iterarlo nuevamente
            //si no, la cantidad es 0
            lugarDisponible lugar;
            lugar = new lugarDisponible(estacionamiento.Ubicacion, estacionamiento.Tipo, encontrado.isPresent() ? encontrado.get().Cantidad : 0);
            if(encontrado.isPresent()) parquimetrosEncontrados.remove(encontrado.get());
            lugares.add(lugar);
        }

        //itero por los parquimetros que no coincidieron con los estacionamientos
        for(ParquimetroDto parquimetro : parquimetrosEncontrados){
            lugarDisponible lugar = new lugarDisponible(parquimetro.Ubicacion, null, parquimetro.Cantidad);
            lugares.add(lugar);
        }

        return lugares;
    }
}
