package com.tppoo.Entidades;

public class PuntoDelMapa {
    public float latitud;
    public float longitud;

    public PuntoDelMapa(float latitud, float longitud){
        this.latitud = latitud;
        this.longitud = longitud;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof PuntoDelMapa) {
            PuntoDelMapa punto = (PuntoDelMapa) o;

            return punto.latitud == this.latitud && punto.longitud == punto.longitud;
        } else return false;
    }
}
