package com.tppoo;
import com.tppoo.Entidades.Ubicacion;
import com.tppoo.Gestores.LugaresParaEstacionarGestor;
import com.tppoo.Gestores.GoogleGestor;
import com.tppoo.dtos.ResultDto;
import com.tppoo.Entidades.lugarDisponible;

import java.util.ArrayList;
import java.util.List;
public class BuscadorDeRuta {
    private LugaresParaEstacionarGestor GestorEstacionamiento;
    private GoogleGestor GestorGoogle;

    public BuscadorDeRuta(){
        this.GestorEstacionamiento = new LugaresParaEstacionarGestor();
        this.GestorGoogle = new GoogleGestor();
    }

    private ResultDto ObtenerRecorridoGoogle(Ubicacion partida, lugarDisponible lugar){
        return new ResultDto(lugar, GestorGoogle.ObtenerRecorrido(partida, lugar.Ubicacion) );
    }

    public List<ResultDto> BuscarRecorrido(String Desde, String Hasta){

        //primero obtengo la ubicacion del punto de partida
        Ubicacion partida = GestorGoogle.BuscarDireccion(Desde);

        //primero obtengo los estacionamientos disponibles
        List<lugarDisponible> estacionamientos = this.GestorEstacionamiento.ObtenerLugaresParaEstacionarCercanos(Hasta);

        //despues por cada uno busco el recorrido en google
        List<ResultDto> resultados = new ArrayList<ResultDto>();
        estacionamientos.stream().forEach(lugar -> resultados.add(ObtenerRecorridoGoogle(partida, lugar)));

        return resultados;
    }
}