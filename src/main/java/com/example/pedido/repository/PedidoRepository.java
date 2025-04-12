package com.example.pedido.repository;

import com.example.pedido.entity.PedidoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<PedidoEntity, Long> {

    public List<PedidoEntity> findByUfAndCliente(String uf, String cliente);
    public List<PedidoEntity> findByCliente(String uf);

}
