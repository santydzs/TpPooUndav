package com.tppoo.APIs;
import com.tppoo.dtos.EstacionamientoBaseDto;
import java.util.List;

public interface ILugarParaEstacionar<T extends EstacionamientoBaseDto> {
    List<T> LugaresDisponiblesCercanos(String direccion);
}
