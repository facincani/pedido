package com.example.pedido.controller;

import com.example.pedido.domain.Comprovante;
import com.example.pedido.domain.Pedido;
import com.example.pedido.entity.PedidoEntity;
import com.example.pedido.service.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class PedidoController {

    PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }


    @PostMapping
    public Comprovante criaPedido(@RequestBody Pedido pedido){
        return service.criaPedido(pedido);
    }

    @GetMapping
    public List<PedidoEntity> consultaPedidos(){
        return service.consultaPorEstado("SP");
    }



}
