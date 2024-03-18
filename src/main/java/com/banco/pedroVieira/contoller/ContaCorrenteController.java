package com.banco.pedroVieira.contoller;

import com.banco.pedroVieira.model.Cliente;
import com.banco.pedroVieira.model.ContaCorrente;
import com.banco.pedroVieira.service.ClienteService;
import com.banco.pedroVieira.service.ContaCorrenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/conta-corrente")
public class ContaCorrenteController {
    @Autowired
    private ContaCorrenteService service;
    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/{num}")
    public ContaCorrente getConta(@PathVariable Integer num){
        return service.getConta(num);
    }
    @DeleteMapping(value = "/{num}")
    public void deleteConta(@PathVariable Integer num){
        service.deleteConta(num);
    }

    @PostMapping(value = "/{num}/{cpfCliente}")
    public ContaCorrente cadastrarConta(
            @PathVariable Integer num,
            @PathVariable String  cpfCliente){

        return service.cadastrarConta(clienteService.getCliente(cpfCliente), num);
    }

}
