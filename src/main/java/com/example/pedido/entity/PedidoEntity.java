package com.example.pedido.entity;

import com.example.pedido.domain.Pedido;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class PedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(name = "NM_CLIENTE")
    private String cliente;

    private String uf;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "pedido_id")
    private List<ItemEntity> itens;

    public PedidoEntity() {
    }

    public PedidoEntity(Pedido pedido) {
        this.cliente = pedido.getCliente();
        this.uf = pedido.getUf();
        List<ItemEntity> listaEntity = new ArrayList<>();
        for (int i = 0; i < pedido.getItens().size(); i++){
            ItemEntity entity = new ItemEntity(pedido.getItens().get(i));
            listaEntity.add(entity);
        }
        this.itens = listaEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public List<ItemEntity> getItens() {
        return itens;
    }

    public void setItens(List<ItemEntity> itens) {
        this.itens = itens;
    }
}
