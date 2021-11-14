package com.tppoo.dtos;
import com.tppoo.Entidades.TipoEstacionamientoEnum;

public class EstacionamientoDto extends EstacionamientoBaseDto {
    public TipoEstacionamientoEnum Tipo;

    public EstacionamientoDto(TipoEstacionamientoEnum _Tipo, String _direccion){
        super(_direccion);
        this.Tipo = _Tipo;
    }
}
