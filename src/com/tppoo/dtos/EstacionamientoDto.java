package com.tppoo.dtos;
import com.tppoo.Entidades.Ubicacion;

public class EstacionamientoDto extends EstacionamientoBaseDto {
    public String Tipo;

    public EstacionamientoDto(String _Tipo, Ubicacion _Ubicacion){
        super(_Ubicacion);
        this.Tipo = _Tipo;
    }
}
