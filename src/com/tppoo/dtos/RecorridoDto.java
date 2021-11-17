package com.tppoo.dtos;
import com.tppoo.Entidades.PuntoDelMapa;
import com.tppoo.Entidades.Ubicacion;

import java.util.Calendar;
import java.util.List;

//representa un recorrido en un mapa
//Destino ubicacion de llegada, Partida ubicacion de salida
//Recorrido representa puntos del mapa por donde se tiene que pasar
//HorarioLlegada, fehca y hora de llegada a destino
public class RecorridoDto {
    public Ubicacion Destino;
    public Ubicacion Partida;
    public List<PuntoDelMapa> Recorrido;
    public Calendar HorarioLlegada;

    public RecorridoDto(Ubicacion _Destino,Ubicacion _Partida, List<PuntoDelMapa> _Recorrido, Calendar _HorarioLlegada){
        this.Destino = _Destino;
        this.Partida = _Partida;
        this.Recorrido = _Recorrido;
        this.HorarioLlegada = _HorarioLlegada;
    }
}
