package com.tppoo;

import com.tppoo.dtos.ResultDto;

import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BuscadorDeRuta g = new BuscadorDeRuta();

        //casos de test
        List<ResultDto> test1 = g.BuscarRecorridos("cangallo 23", "otro lugar");
        List<ResultDto> test2 = g.BuscarRecorridos("condarco 2233", "la luna");
        List<ResultDto> test3 = g.BuscarRecorridos("paysandu 2233", "cotagaita 456");
    }
}
