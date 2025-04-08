package com.example.pedido.controller;

import com.example.pedido.domain.Comprovante;
import com.example.pedido.domain.Pedido;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@RestController
public class PedidoController {

    List<Pedido> pedidos = new ArrayList<>();

    @PostMapping
    public Comprovante criaPedido(@RequestBody Pedido pedido){
        pedidos.add(pedido);
        return calcularImposto(pedido);
    }

    private Comprovante calcularImposto(Pedido pedido) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Pedido> req = new HttpEntity<>(pedido, headers);
        String url = "http://localhost:8081";
        ResponseEntity<Comprovante> resp = restTemplate.postForEntity(url, req, Comprovante.class);

        return resp.getBody();
    }

}
