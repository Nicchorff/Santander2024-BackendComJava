package edu.pedro.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtos;

    public CadastroProduto() {
        this.produtos = new HashSet<>();
    }

    public void addProtudo(String nome, long codigo, double preco, int quantidade) {
        produtos.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosOrganizados = new TreeSet<>(produtos);
        return produtosOrganizados;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosOrganizados = new TreeSet<>(new ComparetorPorPreco());
        produtosOrganizados.addAll(produtos);
        return produtosOrganizados;
    }
}
