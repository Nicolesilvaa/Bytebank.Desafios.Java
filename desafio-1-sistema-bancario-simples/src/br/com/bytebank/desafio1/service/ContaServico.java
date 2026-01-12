package br.com.bytebank.desafio1.service;

import br.com.bytebank.desafio1.exceptions.SaldoInsuficienteException;
import br.com.bytebank.desafio1.exceptions.ValorInvalidoException;
import br.com.bytebank.desafio1.model.Conta;
import java.util.ArrayList;
import java.util.List;

public class ContaServico {

    private List<Conta> contas = new ArrayList<>();

    public boolean criarConta(Conta conta){

        for (Conta c : contas) {
            if (c.getTitular().getCpf().equals(conta.getTitular().getCpf())) {
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
        return null;
    }


    public boolean depositar(long numeroConta, double valor)  throws  ValorInvalidoException{

        Conta conta = buscarConta(numeroConta);

        if (conta == null || valor <= 0){
            throw  new ValorInvalidoException( "Valor inválido. Não foi possível depositar");
        }

        conta.setSaldo(conta.getSaldo() + valor);

        return true;
    }

    public boolean sacar(long numeroConta, double valor) throws SaldoInsuficienteException {

        Conta conta = buscarConta(numeroConta);

        if (conta == null || valor <= 0 || conta.getSaldo() < valor) {
            throw  new SaldoInsuficienteException("Saldo insuficiente. Não foi possível realizar o saque");
        }
        conta.setSaldo(conta.getSaldo() - valor);

        return true;
    }

    public boolean transferir(long origemNumero, long destinoNumero, double valor)  throws  SaldoInsuficienteException{

        Conta origem = buscarConta(origemNumero);
        Conta destino = buscarConta(destinoNumero);

        if (origem == null || destino == null || valor <= 0 || origem.getSaldo() < valor){
            throw  new SaldoInsuficienteException("Saldo insuficiente. Não foi possível realizar a transferência");
        }
        origem.setSaldo(origem.getSaldo() - valor);
        destino.setSaldo(destino.getSaldo() + valor);

        return true;
    }

}
