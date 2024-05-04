package edu.pedro.map;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarios;

    public Dicionario() {
        this.dicionarios = new HashMap<>();
    }

    public void addDicionario(String palavra, String desc){
        dicionarios.put(palavra,desc);
        exibirPalavra();
    }

    public void removerPalavra(String palavra){
        if(!dicionarios.isEmpty()){
            dicionarios.remove(palavra);
        }
        exibirPalavra();
    }

    public void exibirPalavra(){
        System.out.println(dicionarios);
    }

    public String pesquisarDescricaoPorPalavra(String palavra){
        String palavraSelecionada = null;
        if(!dicionarios.isEmpty()){
            palavraSelecionada = dicionarios.get(palavra);
        }
        return palavraSelecionada;
    }

    public static void main(String[] args) {
        Dicionario d = new Dicionario();

        d.addDicionario("A" , "AA");
        d.addDicionario("B" , "BB");

        System.out.println(d.pesquisarDescricaoPorPalavra("A"));

    }
}
