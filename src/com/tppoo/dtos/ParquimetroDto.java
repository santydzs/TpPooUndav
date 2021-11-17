package com.tppoo.dtos;

import com.tppoo.Entidades.Ubicacion;

public class ParquimetroDto extends EstacionamientoBaseDto {
    public int Cantidad;

    public ParquimetroDto(int _Cantidad, Ubicacion _Ubicacion){
        super(_Ubicacion);
        this.Cantidad = _Cantidad;
    }
}
