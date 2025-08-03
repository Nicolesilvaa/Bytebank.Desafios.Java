package br.com.bytebank.desafio1.model;

import br.com.bytebank.desafio1.utils.TipoConta;

import java.util.Random;

public class Conta {

    private  long numeroDaConta;
    private double saldo;
    private Cliente titular;
    private TipoConta tipoConta;


    public Conta (double saldo, Cliente titular, TipoConta tipoConta){

        Random random = new Random();
        numeroDaConta = random.nextLong(1000);

        this.saldo = saldo;
        this.titular = titular;
        this.tipoConta = tipoConta;
    }

    public Conta(){}

    //geters e setters
    public long getNumeroDaConta() {
        return numeroDaConta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Composição
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        String dadosConta = "--------------  Extrato ------------------\n";
        dadosConta += "Número da Conta: " + numeroDaConta + "\n";
        dadosConta += "Titular: " + titular.getNomeCompleto() + "\n";
        dadosConta += "Tipo de Conta: " + tipoConta + "\n";
        dadosConta += String.format("Saldo: R$ %.2f\n", saldo);
        dadosConta += "---------------------------------------------------------\n";

        return dadosConta;
    }



}