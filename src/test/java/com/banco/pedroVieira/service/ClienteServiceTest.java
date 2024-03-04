package com.banco.pedroVieira.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClienteServiceTest {
    @Autowired
    private ClienteService clienteService;

    @Test
    void cadastroCliente(){
        Assertions.assertDoesNotThrow(() -> clienteService.cadastrarCliente("jooj", "111.111.111-11", 2500.00));
        Assertions.assertDoesNotThrow(() -> clienteService.getCliente("111.111.111-11"));
    }


}
