package edu.pedro.map;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> produtos;

    public EstoqueProduto() {
        this.produtos = new HashMap<>();
    }

    public void addProduto(long id, String nome, double preco, int quantidade){
        produtos.put(id,new Produto(nome, preco, quantidade));
        System.out.println(produtos);
    }

    public void exibirProduto(){
        System.out.println(produtos);
    }

    public void calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(!produtos.isEmpty()){
            for(Produto p : produtos.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        System.out.println(valorTotalEstoque);
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        for (Produto p : produtos.values()){
            if(p.getPreco() >  maiorPreco){
                produtoMaisCaro = p;
                maiorPreco = p.getPreco();
            }
        }
        return  produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        for (Produto p : produtos.values()){
            if(p.getPreco() <  menorPreco){
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        return  produtoMaisBarato;
    }

    public Produto obterProdutoComMaisQuantidadeNoEstoque(){
        Produto produtoMaisQuantidade = null;
        int maiorQuantidade = Integer.MIN_VALUE;

        for (Produto p : produtos.values()){
            if(p.getQuantidade() > maiorQuantidade){
                produtoMaisQuantidade = p;
                maiorQuantidade = p.getQuantidade();
            }
        }
        return  produtoMaisQuantidade;
    }



    public static void main(String[] args) {
        EstoqueProduto e = new EstoqueProduto();

        e.addProduto(1, "A", 10, 2);
        e.addProduto(2, "B", 5, 1);
        e.addProduto(3, "C", 4, 3);

        e.calcularValorTotalEstoque();
        System.out.println(e.obterProdutoMaisCaro());
        System.out.println(e.obterProdutoComMaisQuantidadeNoEstoque());
    }
}
