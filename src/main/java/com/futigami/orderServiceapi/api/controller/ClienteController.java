package com.futigami.orderServiceapi.api.controller;

import com.futigami.orderServiceapi.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar(){
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("João");
        cliente1.setTelefone("19 9982667378");
        cliente1.setEmail("joao@hotmail.com");
        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("Maria");
        cliente2.setTelefone("19 922222222");
        cliente2.setEmail("maria@hotmail.com");
        return Arrays.asList(cliente1, cliente2);
    }
}
