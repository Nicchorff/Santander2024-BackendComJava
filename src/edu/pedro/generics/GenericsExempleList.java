package edu.pedro.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {
        List listaSemgenerics = new ArrayList();
        listaSemgenerics.add("Elemento 1");
        listaSemgenerics.add(10);

        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("String aqui");
        listaGenerics.add("String aqui 2");

    }
}
