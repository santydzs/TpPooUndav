package com.tppoo.Entidades;

//clase utilizada para representar una ubicacion en el mapa, consta de direccion y coordenadas
public class Ubicacion {
    public String Direccion;
    public PuntoDelMapa PuntoDelMapa;

    public Ubicacion(String _Direccion, PuntoDelMapa _PuntoDelMapa){
        this.Direccion = _Direccion;
        this.PuntoDelMapa = _PuntoDelMapa;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Ubicacion) {
            Ubicacion ubi = (Ubicacion) o;

            return ubi.PuntoDelMapa.equals(this.PuntoDelMapa) && ubi.Direccion == this.Direccion;
        } else return false;
    }
}
