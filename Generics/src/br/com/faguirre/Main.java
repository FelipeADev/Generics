package br.com.faguirre;

import br.com.faguirre.Car;
import br.com.faguirre.GolfGTI;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static Car Brasília = new GolfGTI(230,"Cheio",250);
    private static Car GolfGTI = new Brasília(54,"Cheio", 138);

    public static void main(String[] args) {
        List<Car> lista = new ArrayList<>();
        new GolfGTI(230,"Cheio",250);
        new Brasília(54,"Cheio", 138);

        lista.add(Brasília);
        lista.add(GolfGTI);
        imprimir(lista);
    }

    public static <T> void imprimir (List<T> lista){
        for(T st : lista){
            System.out.println(st);
        }
    }


}