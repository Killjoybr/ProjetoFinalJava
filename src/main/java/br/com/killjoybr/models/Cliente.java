package br.com.killjoybr.models;

import java.sql.Array;

public class Cliente {
    private int id;
    private String nome;
    private String telefone;
    private Array pagamentos;
    
    public Cliente(int id, String nome, String telefone, Array pagamentos) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.pagamentos = pagamentos;
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

    public Array getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(Array pagamentos) {
        this.pagamentos = pagamentos;
    }

    
}