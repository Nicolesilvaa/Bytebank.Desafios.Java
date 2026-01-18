package br.com.bytebank.desafio1.service;

import br.com.bytebank.desafio1.model.Cliente;
import br.com.bytebank.desafio1.model.Conta;
import br.com.bytebank.desafio1.utils.TipoInvestimento;

public interface ServicoInvestimento {

    void aplicar(Conta conta, TipoInvestimento tipoInvestimento, double valor);
    double resgatar(Cliente cliente, TipoInvestimento tipoInvestimento, double valor);
}
