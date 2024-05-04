package edu.pedro.map;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String,Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void addPalavra(String palavra, int contagem){
        palavras.put(palavra,contagem);
        System.out.println(palavras);
    }

    public void removerPalavra(String palavra) {
        if(!palavras.isEmpty()){
            palavras.remove(palavra);
        }
        System.out.println(palavras);
    }

    public void exibirPalavras(){
        System.out.println(palavras);
    }
}
