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


    //Métodos principais

    public boolean depositar (double valor){
            this.saldo += valor;

            return true;
    }

    public boolean sacar (double valor){

        if(this.saldo >= valor){
            this.saldo -= valor;
        }
        else{
            return false;
        }

        return true;
    }

    public boolean transferencia(Conta destino, double valor){

        if(valor <= 0){
            System.out.println("Digite um valor maior que zero");
            return false;
        }

        if(this.saldo < valor){
            System.out.println("Saldo insulficiente para transferência");
            return false;
        }

        this.saldo -= valor;
        System.out.println(" Transferência de R$ %.2f realizada com sucesso para a conta %d\n");

        return true;

    }

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

    //Compusição
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