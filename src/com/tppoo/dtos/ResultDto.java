package com.tppoo.dtos;

public class ResultDto {
    public EstacionamientoDto Estacionamiento;
    public ParquimetroDto Parquimetro;
    public RecorridoDto Recorrido;

    public  ResultDto(EstacionamientoDto Estacionamiento, ParquimetroDto Parquimetro, RecorridoDto Recorrido){
        this.Estacionamiento = Estacionamiento;
        this.Parquimetro = Parquimetro;
        this.Recorrido = Recorrido;
    }
}
