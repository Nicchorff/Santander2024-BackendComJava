package edu.pedro.set;

import java.util.HashSet;
import  java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatos;

    public AgendaContatos() {
        this.contatos = new HashSet<>();
    }

    public void addContato(String nome, int numero){
        contatos.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatos);
    }

    public Set<Contato> buscarContatoPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatos){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public void atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatos){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos a = new AgendaContatos();

        a.addContato("Pedro", 123);
        a.addContato("Lais", 124);
        a.addContato("Lais Linda", 125);

        System.out.println(a.buscarContatoPorNome("Lais"));
        a.exibirContatos();
        a.atualizarNumeroContato("Lais", 2141242);
        a.exibirContatos();
    }
}
