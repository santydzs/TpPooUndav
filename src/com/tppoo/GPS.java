package com.tppoo;
import com.tppoo.Gestores.EstacionamientoGestor;
import com.tppoo.Gestores.GoogleGestor;
import com.tppoo.dtos.EstacionamientoDto;
import com.tppoo.dtos.RecorridoDto;
import com.tppoo.dtos.ResultDto;
import com.tppoo.dtos.lugarDisponibleDto;

import java.util.ArrayList;
import java.util.List;
public class GPS {
    private EstacionamientoGestor GestorEstacionamiento;
    private GoogleGestor GestorGoogle;

    public GPS(){
        this.GestorEstacionamiento = new EstacionamientoGestor();
        this.GestorGoogle = new GoogleGestor();
    }

    public List<ResultDto> BuscarRecorrido(String Desde, String Hasta){
        //primero obtengo los estacionamientos disponibles
        List<lugarDisponibleDto> estacionamientos = this.GestorEstacionamiento.ObtenerEstacionamientosCercanos(Hasta);

        //despues por cada uno busco el recorrido en google
        List<ResultDto> resultados = new ArrayList<ResultDto>();
        if(!estacionamientos.isEmpty()){
            for (lugarDisponibleDto lugar : estacionamientos) {
                RecorridoDto recorrido = GestorGoogle.ObtenerRecorrido(Desde, lugar.Direccion);
                ResultDto nuevoResultado = new ResultDto(lugar.Estacionamiento, lugar.Parquimetro, recorrido);
                resultados.add(nuevoResultado);
            }
        }

        return resultados;
    }
}
