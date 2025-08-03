package br.com.bytebank.desafio1.model;

import br.com.bytebank.desafio1.utils.TipoConta;

public class Conta {

    private  long numeroDaConta;
    private double saldo;
    private Cliente titular;
    private TipoConta tipoConta;


    public Conta (long numeroDaConta, double saldo, Cliente titular, TipoConta tipoConta){

      this.numeroDaConta = numeroDaConta;
      this.saldo = saldo;
      this.titular = titular;
      this.tipoConta = tipoConta;
    }

    public Conta(){}

    //geters e setters
    public long getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(long numeroDaConta){
        this.numeroDaConta = numeroDaConta;
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
        String info = "========== CONTA BANCÁRIA ==========\n";
        info += "Número da Conta: " + numeroDaConta + "\n";
        info += "Tipo de Conta: " + tipoConta + "\n";
        info += "----- Titular da Conta -----\n";
        info += "Nome: " + titular.getNomeCompleto() + "\n";
        info += "CPF: " + titular.getCpf() + "\n";
        info += "Email: " + titular.getEmail() + "\n";
        info += "Tipo de Cliente: " + titular.getTipoCliente() + "\n";
        info += "====================================\n";
        return info;
    }



}