package com.tppoo.Gestores;

import com.tppoo.APIs.GoogleApi;
import com.tppoo.Entidades.Ubicacion;
import com.tppoo.dtos.RecorridoDto;

import java.util.List;

public class GoogleGestor {
    public GoogleApi api;

    public GoogleGestor(){
        this.api = new GoogleApi();
    }

    public Ubicacion ObtenerUbicacion(String direccion){
        return api.BuscarDireccion(direccion);
    }

    public List<RecorridoDto> ObtenerRecorrido(Ubicacion Partida, Ubicacion Llegada){
        return api.obtenerRecorrido(Partida, Llegada);
    }
}
