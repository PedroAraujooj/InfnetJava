package com.banco.pedroVieira.client;

import com.banco.pedroVieira.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws", name = "enderecoClient")
public interface EnderecoClient {
    @GetMapping(value = "/{cep}/json")
    Endereco getByCep(@PathVariable String cep);
}
