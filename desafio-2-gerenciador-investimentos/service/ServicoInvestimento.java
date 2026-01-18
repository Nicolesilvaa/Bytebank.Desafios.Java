package br.com.bytebank.desafio1.service;

import br.com.bytebank.desafio1.model.Cliente;
import br.com.bytebank.desafio1.model.Conta;
import br.com.bytebank.desafio1.utils.TipoInvestimento;

public interface ServicoInvestimento {

    void aplicar(Conta conta, double valor);
    double resgatar(Conta conta, double valor);
}
