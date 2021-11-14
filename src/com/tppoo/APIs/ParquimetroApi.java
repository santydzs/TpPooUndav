package com.tppoo.APIs;
import com.tppoo.dtos.ParquimetroDto;

import java.util.ArrayList;
import java.util.List;

public class ParquimetroApi implements ILugarParaEstacionar<ParquimetroDto> {
    public List<ParquimetroDto> LugaresDisponiblesCercanos(String direccion){
        ParquimetroDto parq = new ParquimetroDto(3, direccion);
        ParquimetroDto parq2 = new ParquimetroDto(5, "la luna");
        List<ParquimetroDto> parquimetros = new ArrayList<>();
        parquimetros.add(parq);
        parquimetros.add(parq2);
        return parquimetros;
    }
}
