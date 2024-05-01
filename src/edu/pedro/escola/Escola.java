package edu.pedro.escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno("Felipe", 8);
        felipe.setCorCabelo("Preto");


        System.out.println("Nome: " + felipe.getNome() +"\nIdade: " + felipe.getIdade());
    }
}
