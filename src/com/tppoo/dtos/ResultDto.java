package com.tppoo.dtos;

import com.tppoo.Entidades.lugarDisponible;

import java.util.List;

public class ResultDto {
    public lugarDisponible LugaresParaEstacionar;
    public List<RecorridoDto> Recorrido;

    public  ResultDto(lugarDisponible _LugaresParaEstacionar, List<RecorridoDto> _Recorrido){
        this.LugaresParaEstacionar = _LugaresParaEstacionar;
        this.Recorrido = _Recorrido;
    }
}
