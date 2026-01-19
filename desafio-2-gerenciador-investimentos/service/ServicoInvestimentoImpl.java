package br.com.bytebank.desafio1.service;

import br.com.bytebank.desafio1.model.Conta;

public class ServicoInvestimentoImpl implements ServicoInvestimento {


    public void aplicar(Conta conta, double valor) {

        double  saldo ;

        saldo = conta.getSaldo();
        saldo += valor;
        conta.setSaldo(saldo);

    }

    public double resgatar(Conta conta, double valor) {
        double  saldo ;

        saldo = conta.getSaldo() - valor;
        conta.setSaldo(saldo);

        return saldo;
    }
}
