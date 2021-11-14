package com.tppoo.APIs;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.tppoo.dtos.PuntoDelMapa;
import com.tppoo.dtos.RecorridoDto;

public class GoogleApi {
    public PuntoDelMapa obtenerLatitudLongitud(String Direccion) {
        return new PuntoDelMapa(34.7845f, 78.123f);
    }

    public RecorridoDto obtenerRecorrido(PuntoDelMapa partida, PuntoDelMapa llegada){
        PuntoDelMapa punto1 = new PuntoDelMapa(54.2f, 6.2f);
        PuntoDelMapa punto2 = new PuntoDelMapa(23.4f, 21f);
        List<PuntoDelMapa> recorrido = new ArrayList<PuntoDelMapa>();
        recorrido.add(punto1);
        recorrido.add(punto2);

        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.HOUR, 1);
        return new RecorridoDto(llegada, partida, recorrido, c);
    }

}
