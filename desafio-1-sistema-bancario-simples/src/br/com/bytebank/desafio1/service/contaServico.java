package br.com.bytebank.desafio1.service;

import br.com.bytebank.desafio1.model.Conta;

public class contaServico {





    //Métodos principais

    public boolean criarConta(Cliente titualr,){

    }

    public boolean buscarConta(){

    }

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
