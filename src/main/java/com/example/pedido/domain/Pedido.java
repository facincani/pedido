package com.example.pedido.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Pedido {

    private String cliente;
    @JsonProperty("uf")
    private String uf;
    private List<Item> itens;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(List<Item> itens) {
        this.itens = itens;
    }
}
