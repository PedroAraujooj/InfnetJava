package com.banco.pedroVieira.models;

import com.banco.pedroVieira.model.Cliente;
import com.banco.pedroVieira.model.ContaCorrente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static  org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class ContaCorrenteTest {
    final Double SALARIOMIN = 1412.0;
    ContaCorrente cc;
    Cliente cliente;

    @BeforeEach
    void setUp(){
        cliente = new Cliente("Pedro", "111.111.111-11");
        cc = new ContaCorrente(cliente, 111);
    }

    @Test
    void contaMenos2salarios(){
        cliente.setSalarioMensal(1000.0);
        assertEquals(cc.getLimite(), 1000.0);
    }
    @Test
    void conta2salarios(){
        cliente.setSalarioMensal(2*SALARIOMIN);
        assertEquals(cc.getLimite(), cliente.getSalarioMensal()*2);
    }
    @Test
    void conta5salarios(){
        cliente.setSalarioMensal(5*SALARIOMIN);
        assertEquals(cc.getLimite(), cliente.getSalarioMensal()*5);
    }
    @Test
    void getAndSet(){
        Cliente cliente1 = new Cliente("cliente1", "222.222.222-22", 1000.0);
        assertEquals("cliente1", cliente1.getNome());
        assertEquals(0.0, cc.getLimite());
        assertEquals(0.0, cc.getSaldo());
        assertEquals(111, cc.getNumeroConta());
        assertEquals(cliente.getCpf(), cc.getCliente().getCpf());
    }
    @Test
    void sacarDepositar(){
        cc.depositar(200.0);
        cc.sacar(50.0);
        assertEquals(cc.getSaldo(), 150.0);
    }
}
