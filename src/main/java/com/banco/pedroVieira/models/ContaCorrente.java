package com.banco.pedroVieira.models;

public class ContaCorrente {
    public static final Double SALARIOMIN = 1412.0;
    private Cliente cliente;
    private Double limite = 0.0;
    private Double saldo = 0.0;
    private Integer numeroConta;

    public ContaCorrente(Cliente cliente, Integer numeroConta) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
    }

    public void sacar(Double valor){
        if(saldo >= valor && valor > 0){
            saldo -= valor;
        }
    }
    public void depositar(Double valor){
        saldo += valor;
    }

    private Double calcularLimite(){
        Double salarioMensal = cliente.getSalarioMensal();
        if(salarioMensal < 2*SALARIOMIN){
            return salarioMensal;
        }
        else if(salarioMensal >= 2*SALARIOMIN &&  salarioMensal < 5*SALARIOMIN){
            return salarioMensal*2;
        }
        else {
            return salarioMensal*5;
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Double getLimite() {
        limite = calcularLimite();
        return limite;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }
}
