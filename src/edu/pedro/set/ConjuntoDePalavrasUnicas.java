package edu.pedro.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoDePalavrasUnicas {
    private Set<String> palavras;

    public ConjuntoDePalavrasUnicas() {
        this.palavras = new HashSet<>();
    }

    public void addPalavra(String palavra){
        palavras.add(palavra);
    }

    public void removerPalavra(String palavra){
        String palavraVazia = null;
        for(String s : palavras){
            if(s == palavra){
                palavraVazia = s;
                break;
            }
        }
        palavras.remove(palavraVazia);
    }

    public void exibirPalavrasUnicas(){
        System.out.println(palavras);
    }

    public static void main(String[] args) {
        ConjuntoDePalavrasUnicas c = new ConjuntoDePalavrasUnicas();

        c.addPalavra("Ola");
        c.addPalavra("Oi");
        c.addPalavra("PEPE");
        c.exibirPalavrasUnicas();
        c.removerPalavra("PEPE");
        c.exibirPalavrasUnicas();


    }
}


