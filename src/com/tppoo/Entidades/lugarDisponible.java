package com.tppoo.Entidades;

//representa un lugar disponible para estacionar
// si no hay estacionamiento, TipoEstacionamiento == null
// si no hay parquimetros. CantidadParquimetros == 0
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
