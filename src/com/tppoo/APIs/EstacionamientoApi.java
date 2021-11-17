package com.tppoo.APIs;
import com.tppoo.Entidades.PuntoDelMapa;
import com.tppoo.Entidades.Ubicacion;
import com.tppoo.dtos.EstacionamientoDto;

import java.util.ArrayList;
import java.util.List;

public class EstacionamientoApi implements ILugarParaEstacionar<EstacionamientoDto> {
    public List<EstacionamientoDto> LugaresDisponiblesCercanos(String direccion){

        //mocks, aca se consultaria a la api de estacionamientos
        EstacionamientoDto esta1 = new EstacionamientoDto("Privado", new Ubicacion(direccion, new PuntoDelMapa(21.1f, 56.67f)));
        EstacionamientoDto esta3 = new EstacionamientoDto("Publico", new Ubicacion("laprida 1204", new PuntoDelMapa(34.7845f, 78.123f)));
        List<EstacionamientoDto> estacionamientos = new ArrayList<EstacionamientoDto>();
        estacionamientos.add(esta1);
        estacionamientos.add(esta3);
        return estacionamientos;
    }
}
