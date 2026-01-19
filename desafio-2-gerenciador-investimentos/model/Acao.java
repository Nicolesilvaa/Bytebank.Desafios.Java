package br.com.bytebank.desafio1.model;

import br.com.bytebank.desafio1.utils.TipoInvestimento;

public class Acao extends ProdutoInvestimento{




    public Acao(String codigo, String nome, double valorAtual, TipoInvestimento tipoInvestimento) {
        super(codigo, nome, valorAtual, tipoInvestimento);
    }

    @Override
    double calcularRendimentoMensal() {
        return 0;
    }

    @Override
    double calcularRendimentoAcumulado(int meses) {
        return 0;
    }
}
