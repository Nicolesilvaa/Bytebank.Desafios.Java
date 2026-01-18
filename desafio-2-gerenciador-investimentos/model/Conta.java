package br.com.bytebank.desafio1.model;

import br.com.bytebank.desafio1.utils.TipoInvestimento;

import java.util.Random;

public class Conta {

    private  long numeroDaConta;
    private double saldo;
    private Cliente titular;
    private TipoInvestimento tipoInvestimento;


    public Conta (double saldo, Cliente titular, TipoInvestimento tipoInvestimento){

        Random random = new Random();
        numeroDaConta = random.nextLong(100_000);

        this.saldo = saldo;
        this.titular = titular;
        this.tipoInvestimento = tipoInvestimento;
    }

    public Conta(){}

    public long getNumeroDaConta() {
        return numeroDaConta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public TipoInvestimento getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(TipoInvestimento tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    @Override
    public String toString() {
        String dadosConta = "--------------  Extrato ------------------\n";
        dadosConta += "Número da Conta: " + numeroDaConta + "\n";
        dadosConta += "Titular: " + titular.getNomeCompleto() + "\n";
        dadosConta += "Tipo de Investimento: " + tipoInvestimento + "\n";
        dadosConta += String.format("Saldo: R$ %.2f\n", saldo);
        dadosConta += "---------------------------------------------------------\n";

        return dadosConta;
    }

}