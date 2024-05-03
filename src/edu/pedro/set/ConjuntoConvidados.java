package edu.pedro.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidados;

    public ConjuntoConvidados() {
        this.convidados = new HashSet<>();
    }

    public void addConvidado(String nome, int convite){
        convidados.add(new Convidado(nome, convite));
    }

    public void removerCondidado(int convite){
        Convidado convidado = null;
        for(Convidado c : convidados){
            if(c.getConvite() == convite){
                convidado = c;
                break;
            }
        }
        convidados.remove(convidado);
    }

    public int contarConvidados(){
        return convidados.size();
    }

    public void exibirConvidados(){
        System.out.println(convidados);
    }
}
