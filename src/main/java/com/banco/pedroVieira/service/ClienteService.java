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

    public Cliente cadastrarCliente(String nome, String cpf, Double salario){
        clientes.put(cpf,new Cliente(nome, cpf, salario));
        return clientes.get(cpf);
    }

    public Cliente cadastrarCliente(String cpf){
        clientes.put(cpf, new Cliente(cpf));
        return clientes.get(cpf);
    }
    public Cliente cadastrarCliente(Cliente cliente){
        clientes.put(cliente.getCpf(), cliente);
        return cliente;
    }
    public Cliente getCliente( String cpf){
        return clientes.get(cpf);
    }

    public void deleteCliente(String cpf){
        clientes.remove(cpf);
    }


}
