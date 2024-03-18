package com.banco.pedroVieira.contoller;

import com.banco.pedroVieira.DTO.ClienteDTO;
import com.banco.pedroVieira.model.Cliente;
import com.banco.pedroVieira.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping(value = "/{cpf}")
    public Cliente getCliente(@PathVariable String cpf){
        return service.getCliente(cpf);
    }
    @DeleteMapping(value = "/{cpf}")
    public void deleteCliente(@PathVariable String cpf){
        service.deleteCliente(cpf);
    }

    @PostMapping
    public Cliente cadastraCliente(@RequestBody ClienteDTO dto){
        return service.cadastrarCliente(dto.nome(), dto.cpf(), dto.salarioMensal());
    }

}
