package com.tppoo.dtos;
import java.util.Calendar;
import java.util.List;

public class RecorridoDto {
    public PuntoDelMapa Destino;
    public PuntoDelMapa Partida;
    public List<PuntoDelMapa> Recorrido;
    public Calendar HorarioLlegada;

    public RecorridoDto(PuntoDelMapa Destino,PuntoDelMapa Partida, List<PuntoDelMapa> Recorrido, Calendar HorarioLlegada){
        this.Destino = Destino;
        this.Partida = Partida;
        this.Recorrido = Recorrido;
        this.HorarioLlegada = HorarioLlegada;
    }
}
