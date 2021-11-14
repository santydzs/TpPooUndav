package com.tppoo.APIs;
import com.tppoo.dtos.EstacionamientoDto;
import com.tppoo.Entidades.TipoEstacionamientoEnum;

import java.util.ArrayList;
import java.util.List;

public class EstacionamientoApi implements ILugarParaEstacionar<EstacionamientoDto> {
    public List<EstacionamientoDto> LugaresDisponiblesCercanos(String direccion){
        EstacionamientoDto esta1 = new EstacionamientoDto(TipoEstacionamientoEnum.privado, direccion);
        EstacionamientoDto esta3 = new EstacionamientoDto(TipoEstacionamientoEnum.publico, "laprida 1204");
        List<EstacionamientoDto> estacionamientos = new ArrayList<EstacionamientoDto>();
        estacionamientos.add(esta1);
        estacionamientos.add(esta3);
        return estacionamientos;
    }
}
