package com.tppoo.APIs;
import com.tppoo.Entidades.PuntoDelMapa;
import com.tppoo.Entidades.Ubicacion;
import com.tppoo.dtos.ParquimetroDto;

import java.util.ArrayList;
import java.util.List;

public class ParquimetroApi implements ILugarParaEstacionar<ParquimetroDto> {
    public List<ParquimetroDto> LugaresDisponiblesCercanos(String direccion){

        //mocks, aca se consultaria la api de parquimetros
        ParquimetroDto parq = new ParquimetroDto(3, new Ubicacion(direccion, new PuntoDelMapa(21.1f, 56.67f)));
        ParquimetroDto parq2 = new ParquimetroDto(5, new Ubicacion("av belgrano 265", new PuntoDelMapa(56.7845f, 3.22f)));
        List<ParquimetroDto> parquimetros = new ArrayList<>();
        parquimetros.add(parq);
        parquimetros.add(parq2);
        return parquimetros;
    }
}
