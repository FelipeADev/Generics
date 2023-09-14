package br.com.faguirre;

import br.com.faguirre.Car;
import br.com.faguirre.GolfGTI;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add(String.valueOf(new GolfGTI(230,"Cheio",250)));
        lista.add(String.valueOf(new Brasília(54,"Cheio", 138)));
        imprimir(lista);
    }

    public static <T> void imprimir (List<T> lista){
        for(T st : lista){
            System.out.println(st);
        }
    }
}