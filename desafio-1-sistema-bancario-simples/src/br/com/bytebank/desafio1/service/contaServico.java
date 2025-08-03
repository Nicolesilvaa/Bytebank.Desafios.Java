package br.com.bytebank.desafio1.service;

import br.com.bytebank.desafio1.model.Cliente;
import br.com.bytebank.desafio1.model.Conta;
import java.util.ArrayList;
import java.util.List;

public class contaServico {

    private List<Conta> contas = new ArrayList<>();

    //Métodos principais

    public boolean criarConta(Conta conta){
        for(Conta c : contas){
            if(c.getNumeroDaConta() == conta.getNumeroDaConta()){
                System.out.println("Conta com esse número já existe!");
                return false;
            }
        }
        contas.add(conta);
        return true;
    }

    public Conta buscarConta(long numeroConta) {
        for (Conta c : contas) {
            if (c.getNumeroDaConta() == numeroConta) {
                return c;
            }
        }
        return null; // não achou
    }

    public boolean depositar(long numeroConta, double valor) {
        Conta conta = buscarConta(numeroConta);
        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return false;
        }
        if (valor <= 0) {
            System.out.println("Valor de depósito inválido.");
            return false;
        }
        conta.setSaldo(conta.getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso.");
        return true;
    }

    public boolean sacar(long numeroConta, double valor) {
        Conta conta = buscarConta(numeroConta);
        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return false;
        }
        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return false;
        }
        if (conta.getSaldo() < valor) {
            System.out.println("Saldo insuficiente.");
            return false;
        }
        conta.setSaldo(conta.getSaldo() - valor);
        System.out.println("Saque realizado com sucesso.");
        return true;
    }

    public boolean transferir(long numeroContaOrigem, long numeroContaDestino, double valor) {
        Conta origem = buscarConta(numeroContaOrigem);
        Conta destino = buscarConta(numeroContaDestino);

        if (origem == null || destino == null) {
            System.out.println("Conta origem ou destino não encontrada.");
            return false;
        }
        if (valor <= 0) {
            System.out.println("Valor inválido para transferência.");
            return false;
        }
        if (origem.getSaldo() < valor) {
            System.out.println("Saldo insuficiente na conta origem.");
            return false;
        }

        origem.setSaldo(origem.getSaldo() - valor);
        destino.setSaldo(destino.getSaldo() + valor);
        System.out.println(String.format("Transferência de R$ %.2f realizada com sucesso.", valor));
        return true;
    }



}
