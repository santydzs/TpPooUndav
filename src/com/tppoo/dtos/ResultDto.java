package com.tppoo.dtos;

import com.tppoo.Entidades.lugarDisponible;

import java.util.List;

public class ResultDto {
    public lugarDisponible LugaresParaEstacionar;
    public List<RecorridoDto> Recorridos;

    public  ResultDto(lugarDisponible _LugaresParaEstacionar, List<RecorridoDto> _Recorridos){
        this.LugaresParaEstacionar = _LugaresParaEstacionar;
        this.Recorridos = _Recorridos;
    }
}
