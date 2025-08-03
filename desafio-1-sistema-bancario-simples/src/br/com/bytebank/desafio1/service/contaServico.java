package br.com.bytebank.desafio1.service;

import br.com.bytebank.desafio1.model.Conta;
import java.util.ArrayList;
import java.util.List;

public class contaServico {

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

    public Conta buscarConta(String cpf) {

        for (Conta c : contas) {
            if (c.getTitular().getCpf().equals(cpf)) {
                return c;
            }
        }

        return null;
    }

    public boolean depositar(long numeroConta, double valor) {

        Conta conta = buscarConta(numeroConta);

        if (conta == null || valor <= 0) return false;
        conta.setSaldo(conta.getSaldo() + valor);

        return true;
    }

    public boolean sacar(long numeroConta, double valor) {

        Conta conta = buscarConta(numeroConta);

        if (conta == null || valor <= 0 || conta.getSaldo() < valor) return false;
        conta.setSaldo(conta.getSaldo() - valor);

        return true;
    }

    public boolean transferir(long origemNumero, long destinoNumero, double valor) {

        Conta origem = buscarConta(origemNumero);
        Conta destino = buscarConta(destinoNumero);

        if (origem == null || destino == null || valor <= 0 || origem.getSaldo() < valor) return false;
        origem.setSaldo(origem.getSaldo() - valor);
        destino.setSaldo(destino.getSaldo() + valor);

        return true;
    }

}
