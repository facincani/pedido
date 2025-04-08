package com.example.pedido.domain;

import java.util.List;

public class Comprovante {

    private String cliente;
    private String uf;
    private String regiao;
    private List<Item> items;
    private Double subtotal;
    private Double imposto;
    private Double total;
    private Integer aliquota_aplicada;

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

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getAliquota_aplicada() {
        return aliquota_aplicada;
    }

    public void setAliquota_aplicada(Integer aliquota_aplicada) {
        this.aliquota_aplicada = aliquota_aplicada;
    }
}
