package edu.pedro.escola;

public class Aluno {
    private String nome;
    private int idade;
    private String corCabelo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCorCabelo() {
        return corCabelo;
    }

    public void setCorCabelo(String corCabelo) {
        this.corCabelo = corCabelo;
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
