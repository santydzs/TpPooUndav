package com.tppoo;

import com.tppoo.dtos.ResultDto;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BuscadorDeRuta g = new BuscadorDeRuta();
        List<ResultDto> aa = g.BuscarRecorrido("cangallo 23", "otro lugar");
    }
}
