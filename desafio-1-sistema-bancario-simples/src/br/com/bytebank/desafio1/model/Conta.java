package br.com.bytebank.desafio1.model;

public class Conta {

    private  long numeroDaConta;
    private double saldo;
    private Cliente titular;
    private String tipoConta;


    public Conta (long numeroDaConta, double saldo, Cliente titular, String tipoConta){

      this.numeroDaConta = numeroDaConta;
      this.saldo = saldo;
      this.titular = titular;
      this.tipoConta = tipoConta;
    }

    public Conta(){}

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

    //Compusição
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        String dadosConta = "-------------- Dados da Conta Bancária ------------------\n";
        dadosConta += "Número da Conta: " + numeroDaConta + "\n";
        dadosConta += "Titular: " + titular + "\n";
        dadosConta += "Tipo de Conta: " + tipoConta + "\n";
        dadosConta += String.format("Saldo: R$ %.2f\n", saldo);
        dadosConta += "---------------------------------------------------------\n";

        return dadosConta;
    }



}