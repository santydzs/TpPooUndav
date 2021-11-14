package com.tppoo.Gestores;

import com.tppoo.APIs.GoogleApi;
import com.tppoo.dtos.PuntoDelMapa;
import com.tppoo.dtos.RecorridoDto;

public class GoogleGestor {
    public GoogleApi api;

    public GoogleGestor(){
        this.api = new GoogleApi();
    }

    public RecorridoDto ObtenerRecorrido(String partida, String llegada){
        PuntoDelMapa coordenadasPartida = api.obtenerLatitudLongitud(partida);
        PuntoDelMapa coordenadasLlegada = api.obtenerLatitudLongitud(llegada);
        return api.obtenerRecorrido(coordenadasPartida, coordenadasLlegada);
    }
}
