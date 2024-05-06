package edu.pedro.streamapi.funcionalinterface;

import java.sql.Struct;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateFuncionalInterface {
    public static void main(String[] args) {

        List<String> palavras = Arrays.asList("Java", "Python", "C#", "javascript");

        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(maisDeCincoCaracteres)
                .forEach(System.out::println);
    }
}
