package com.banco.pedroVieira.service;

import com.banco.pedroVieira.model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClienteService {
    private static Map<String, Cliente> clientes = new HashMap<>();

    public void cadastrarCliente(String nome, String cpf, Double salario){
        clientes.put(cpf,new Cliente(nome, cpf, salario));
    }
    public void getCliente( String cpf){
        clientes.get(cpf);
    }


}
