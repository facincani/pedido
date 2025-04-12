package com.example.pedido.entity;

import com.example.pedido.domain.Item;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private Integer quantidade;
    private Long precounitario;

    public ItemEntity() {
    }

    public ItemEntity(Item i) {
        this.descricao = i.getDescricao();
        this.precounitario = i.getPrecoUnitario();
        this.quantidade = i.getQuantidade();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Long getPrecounitario() {
        return precounitario;
    }

    public void setPrecounitario(Long precounitario) {
        this.precounitario = precounitario;
    }
}
