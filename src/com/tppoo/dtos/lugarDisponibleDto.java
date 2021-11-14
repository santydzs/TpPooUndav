package com.tppoo.dtos;

public class lugarDisponibleDto {
    public String Direccion;
    public EstacionamientoDto Estacionamiento;
    public ParquimetroDto Parquimetro;

    public lugarDisponibleDto(String Direccion, EstacionamientoDto Estacionamiento, ParquimetroDto Parquimetro){
        this.Estacionamiento = Estacionamiento;
        this.Parquimetro = Parquimetro;
        this.Direccion = Direccion;
    }
}
