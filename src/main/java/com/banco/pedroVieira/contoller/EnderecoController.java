package com.banco.pedroVieira.contoller;

import com.banco.pedroVieira.model.Cliente;
import com.banco.pedroVieira.model.Endereco;
import com.banco.pedroVieira.service.ClienteService;
import com.banco.pedroVieira.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/endereco")
@EnableFeignClients(basePackageClasses = com.banco.pedroVieira.client.EnderecoClient.class)
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;
    @Autowired
    private ClienteService clienteService;

    @PostMapping("/{cpf}/{cep}")
    public Cliente setEndrecoCliente(@PathVariable String cpf, @PathVariable String cep){
        Endereco endereco = enderecoService.getByCep(cep);
        Cliente cliente = clienteService.getCliente(cpf);
        cliente.setEndereco(endereco);
        return  cliente;

    }
    @GetMapping(value = "/{cep}")
    public Endereco getEnderecoByCep(@PathVariable String cep){
        return enderecoService.getByCep(cep);
    }

}
