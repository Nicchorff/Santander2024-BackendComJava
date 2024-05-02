package edu.pedro.collectionsex.catalagolivro;

import java.util.ArrayList;
import java.util.List;

public class CatalagoLivro {
    private List<Livro> livros;

    public CatalagoLivro() {
        this.livros = new ArrayList<>();
    }

    public void addLivros(String nome, String autor, int anoPublicacao){
        livros.add(new Livro(nome, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livros.isEmpty()){
            for (Livro l : livros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro>  pesquisarPorAnos(int anoInicial, int anoFinal){
        List<Livro> livroPorAnos = new ArrayList<>();
        if(!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livroPorAnos.add(l);
                }
            }
        }
        return livroPorAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livro = null;
        if(!livros.isEmpty()){
            for(Livro l : livros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livro = l;
                    break;
                }
            }
        }
        return livro;
    }


}
