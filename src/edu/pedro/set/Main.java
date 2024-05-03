package edu.pedro.set;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados convidados = new ConjuntoConvidados();
        convidados.addConvidado("Pedro", 1);
        convidados.addConvidado("Lais", 2);
        convidados.addConvidado("SDA", 2);

        System.out.println(convidados.contarConvidados());
        convidados.exibirConvidados();
        convidados.removerCondidado(2);
        convidados.exibirConvidados();
    }
}
