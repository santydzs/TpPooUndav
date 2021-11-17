package com.tppoo.Entidades;

public class lugarDisponible {
    public Ubicacion Ubicacion;
    public String TipoEstacionamiento;
    public int CantidadParquimetros;

    public lugarDisponible(Ubicacion _Ubicacion, String _TipoEstacionamiento, int _CantidadParquimetros){
        this.TipoEstacionamiento = _TipoEstacionamiento;
        this.CantidadParquimetros = _CantidadParquimetros;
        this.Ubicacion = _Ubicacion;
    }
}
