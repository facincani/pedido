package com.example.pedido.service;

import com.example.pedido.domain.Comprovante;
import com.example.pedido.domain.Pedido;
import com.example.pedido.entity.PedidoEntity;
import com.example.pedido.repository.PedidoRepository;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class PedidoService {

    private PedidoRepository repository;


    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public Comprovante criaPedido(Pedido pedido){

        repository.save(new PedidoEntity(pedido));

        return calcularImposto(pedido);
    }

    public List<PedidoEntity> consultaPedidos(){
        return repository.findAll();
    }

    public List<PedidoEntity> consultaPorEstado(String uf){
        return repository.findByUfAndCliente(uf, "Jose da Silva");
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
