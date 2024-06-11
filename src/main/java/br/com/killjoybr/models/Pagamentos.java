package br.com.killjoybr.models;

import java.sql.Date;

public class Pagamentos {
    private int id;
    private Date data;
    private double valorTotal;
    private Produtos[] produtosComprados;

    public Pagamentos(int id, Date data, double valorTotal, Produtos[] produtosComprados) {
        this.id = id;
        this.data = data;
        this.valorTotal = valorTotal;
        this.produtosComprados = produtosComprados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produtos[] getProdutosComprados() {
        return produtosComprados;
    }

    public void setProdutosComprados(Produtos[] produtosComprados) {
        this.produtosComprados = produtosComprados;
    }
    
}
