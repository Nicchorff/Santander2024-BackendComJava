package edu.pedro.streamapi.funcionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFuncionalInterface {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1,2,3,4,5);

        Consumer<Integer> imprimirNumerosPares = numero -> {
            if(numero % 2 == 0){
                System.out.println(numero);
            }
        };

        lista.forEach(imprimirNumerosPares);
        lista.forEach(integer -> {
                if(integer % 2 ==0){
                    System.out.println(integer);
                }
        });
    }
}
