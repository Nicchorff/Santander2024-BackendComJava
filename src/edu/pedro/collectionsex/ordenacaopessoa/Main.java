package edu.pedro.collectionsex.ordenacaopessoa;

public class Main {
    public static void main(String[] args) {
        OrdenacaoPessoa ordp = new OrdenacaoPessoa();
        ordp.addPessoa("n1",20,1.50);
        ordp.addPessoa("n2",21,1.51);
        ordp.addPessoa("n3",10,1.90);
        ordp.addPessoa("n4",90,1.20);

        System.out.println(ordp.ordenarPorAltura());
        System.out.println(ordp.ordernarPorIdade());
    }
}
