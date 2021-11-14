package com.tppoo.dtos;

public class ParquimetroDto extends EstacionamientoBaseDto {
    public int Cantidad;

    public ParquimetroDto(int _Cantidad, String _direccion){
        super(_direccion);
        this.Cantidad = _Cantidad;
    }
}
