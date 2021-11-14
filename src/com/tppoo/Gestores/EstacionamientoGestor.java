package com.tppoo.Gestores;
import com.tppoo.APIs.EstacionamientoApi;
import com.tppoo.APIs.ParquimetroApi;
import com.tppoo.dtos.EstacionamientoDto;
import com.tppoo.dtos.ParquimetroDto;
import com.tppoo.dtos.lugarDisponibleDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EstacionamientoGestor {
    private EstacionamientoApi _estacionamientoApi;
    private ParquimetroApi _parquimetroApi;

    public EstacionamientoGestor(){
        this._estacionamientoApi = new EstacionamientoApi();
        this._parquimetroApi = new ParquimetroApi();
    }

    public List<lugarDisponibleDto> ObtenerEstacionamientosCercanos(String direccion){
        //obtengo estacionamientos disponibles cercanos
        List<EstacionamientoDto> estacionamientosEncontrados = this._estacionamientoApi.LugaresDisponiblesCercanos(direccion);
        List<ParquimetroDto> parquimetrosEncontrados = this._parquimetroApi.LugaresDisponiblesCercanos(direccion);

        //filtro por coincidencia de direccion
        List<lugarDisponibleDto> lugares = new ArrayList<lugarDisponibleDto>();
        for(EstacionamientoDto estacionamiento : estacionamientosEncontrados){
            Optional<ParquimetroDto> encontrado = parquimetrosEncontrados.stream().filter(x-> x.direccion.equals(estacionamiento.direccion)).findFirst();
            lugarDisponibleDto lugar = new lugarDisponibleDto(estacionamiento.direccion, estacionamiento, encontrado.isPresent() ? encontrado.get() : null);
            lugares.add(lugar);
        }

        for(ParquimetroDto parquimetro : parquimetrosEncontrados){
            if(!lugares.stream().anyMatch(x -> x.Direccion.equals(parquimetro.direccion))){
                lugarDisponibleDto lugar = new lugarDisponibleDto(parquimetro.direccion, null, parquimetro);
                lugares.add(lugar);
            }
        }

        return lugares;
    }
}
