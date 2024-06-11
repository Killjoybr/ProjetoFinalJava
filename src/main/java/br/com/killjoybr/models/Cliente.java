package br.com.killjoybr.models;

public class Cliente {
    private int id;
    private String nome;
    private String telefone;
    private Pagamentos[] comprasEfeutadas;
    
    public Cliente(int id, String nome, String telefone) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pagamentos[] getComprasEfeutadas() {
        return comprasEfeutadas;
    }

    public void setComprasEfeutadas(Pagamentos[] comprasEfeutadas) {
        this.comprasEfeutadas = comprasEfeutadas;
    }

    
}