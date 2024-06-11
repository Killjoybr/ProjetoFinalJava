package br.com.killjoybr.dao;

import br.com.killjoybr.models.Produtos;
import java.sql.SQLException;

public interface ProdutosDao {
    //Metodo p/ cadastrar produto
    public Produtos cadastrarProduto(Produtos produto) throws SQLException;

    //Metodo p/ listar produto(id)
    public Produtos getProdutoId(int id) throws SQLException;

    //Metodo p/ buscar todos produtos
    public Produtos getProdutos() throws SQLException;

    //Metodo p/ atualizar produto
    public Produtos atualizarProduto(Produtos produto) throws SQLException;

    //Metodo p/ deletar produto
    public Produtos deletarProduto(int id) throws SQLException;
}