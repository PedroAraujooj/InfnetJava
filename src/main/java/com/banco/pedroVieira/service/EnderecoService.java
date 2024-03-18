package com.banco.pedroVieira.service;

import com.banco.pedroVieira.client.EnderecoClient;
import com.banco.pedroVieira.model.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@EnableFeignClients(basePackageClasses = com.banco.pedroVieira.client.EnderecoClient.class)
@Service
public class EnderecoService {
    @Autowired
    private EnderecoClient enderecoClient;
    @GetMapping(value = "/{cep}/json/")
    public Endereco getByCep(@PathVariable String cep){
        return enderecoClient.getByCep(cep);
    }

}
