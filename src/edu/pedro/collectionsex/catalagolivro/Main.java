package edu.pedro.collectionsex.catalagolivro;

public class Main {
    public static void main(String[] args) {
        CatalagoLivro catalagoLivro = new CatalagoLivro();
        catalagoLivro.addLivros("L1","A1", 2020);
        catalagoLivro.addLivros("L1","A2", 2021);
        catalagoLivro.addLivros("L2","A2", 2022);
        catalagoLivro.addLivros("L3","A3", 2023);

        System.out.println(catalagoLivro.pesquisarPorAutor("A2"));
        System.out.println(catalagoLivro.pesquisarPorAnos(2020,2022));

    }
}
