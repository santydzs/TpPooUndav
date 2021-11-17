package com.tppoo.APIs;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.tppoo.Entidades.PuntoDelMapa;
import com.tppoo.Entidades.Ubicacion;
import com.tppoo.dtos.RecorridoDto;

public class GoogleApi {
    //metodos privados solo de mock
    private List<PuntoDelMapa> MockPuntosDelRecorrido(){
        PuntoDelMapa punto1 = new PuntoDelMapa(54.2f, 6.2f);
        PuntoDelMapa punto2 = new PuntoDelMapa(23.4f, 21f);
        PuntoDelMapa punto3 = new PuntoDelMapa(23.4f, 21f);
        PuntoDelMapa punto4 = new PuntoDelMapa(77f, 21.33f);
        List<PuntoDelMapa> recorrido = new ArrayList<PuntoDelMapa>();
        recorrido.add(punto1);
        recorrido.add(punto2);
        recorrido.add(punto3);
        recorrido.add(punto4);
        return recorrido;
    }

    private Calendar ObtenerCalendar(){
        Calendar c1 = Calendar.getInstance();
        c1.setTime(new Date());
        c1.add(Calendar.HOUR, 1);
        return c1;
    }

    //Busca las coordenadas de una direccion, generando una ubicacion
    public Ubicacion BuscarDireccion(String direccion){
        return new Ubicacion(direccion, new PuntoDelMapa(12.45f, 8.5f));
    }

    //API para obtener el recorrido
    public List<RecorridoDto> obtenerRecorrido(Ubicacion partida, Ubicacion llegada){

        //mocks, aca se consultaria a la api de google maps, ahora solo son mocks
        List<PuntoDelMapa> recorrido = MockPuntosDelRecorrido();

        Calendar c1 = ObtenerCalendar();
        Calendar c2 = ObtenerCalendar();
        c2.add(Calendar.MINUTE, 20);

        RecorridoDto recorridoTotal1 = new RecorridoDto(llegada, partida, recorrido.subList(0,1), c1);
        RecorridoDto recorridoTotal2 = new RecorridoDto(llegada, partida, recorrido.subList(0,2), c2);
        List<RecorridoDto> opcionesDeRecorridos = new ArrayList<RecorridoDto>();
        opcionesDeRecorridos.add(recorridoTotal1);
        opcionesDeRecorridos.add(recorridoTotal2);

        if(llegada.Direccion.equals("mitre 2204")){
            Calendar c = ObtenerCalendar();
            c.add(Calendar.MINUTE, 30);
            RecorridoDto nuevoRecorridoTotal = new RecorridoDto(llegada, partida, recorrido.subList(1,3), c);
            opcionesDeRecorridos.add(nuevoRecorridoTotal);
        }

        return opcionesDeRecorridos;
    }

}
