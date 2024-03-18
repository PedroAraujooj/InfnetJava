package com.banco.pedroVieira.service;

import com.banco.pedroVieira.model.Cliente;
import com.banco.pedroVieira.model.ContaCorrente;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class ContaCorrenteService {
    private static Map<Integer, ContaCorrente> contas = new HashMap();

    public ContaCorrente cadastrarConta(Cliente cliente, Integer num){
        contas.put(num, new ContaCorrente(cliente, num));
        return contas.get(num);
    }
    public ContaCorrente getConta(Integer num){
        return contas.get(num);
    }
    public ContaCorrente deleteConta(Integer num){
        return contas.remove(num);
    }
    public void fazerTransferencia(ContaCorrente cedende, ContaCorrente recebedor, Double valor){
        cedende.sacar(valor);
        recebedor.depositar(valor);
    }


}
