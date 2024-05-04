package edu.pedro.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatos;

    public AgendaContatos() {
        this.contatos = new HashMap<>();
    }

    public void addContato(String nome, int telefone){
        contatos.put(nome,telefone);
        exibirContatos();
    }

    public void removerContato(String nome){
        if(!contatos.isEmpty()){
            contatos.remove(nome);
        }
        exibirContatos();
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Integer buscarNumeroPeloNome(String nome){
        Integer numeroSelecionado = null;
        if(!contatos.isEmpty()){
            numeroSelecionado = contatos.get(nome);
        }
        return numeroSelecionado;
    }

    public static void main(String[] args) {
        AgendaContatos a = new AgendaContatos();

        a.addContato("Pedro", 9910);
        a.addContato("Lais", 9911);
        a.addContato("Cristina", 9913);

        a.removerContato("Cristina");
        System.out.println(a.buscarNumeroPeloNome("Lais"));

    }
}
