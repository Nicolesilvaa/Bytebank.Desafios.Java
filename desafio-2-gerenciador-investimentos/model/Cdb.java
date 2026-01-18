package br.com.bytebank.desafio1.model;


import br.com.bytebank.desafio1.utils.TipoInvestimento;

public class Cdb extends ProdutoInvestimento {

    private static final int PRAZO_MESES = 36;
    private double cdiAnual;


    public Cdb(String codigo, String nome, double valorInicial,double cdi) {
        super(codigo, nome, valorInicial, TipoInvestimento.CDB);
        this.cdiAnual = (cdi/100.0);
    }

    @Override
    public double calcularRendimentoMensal() {
        double taxaMensal = calcularTaxaMensal();
        return getValorAtual() * taxaMensal;
    }

    @Override
    public double calcularRendimentoAcumulado(int meses) {
        double taxaMensal = Math.pow(1 + cdiAnual, 1.0/12.0) - 1;
        double valorFinal = getValorAtual() * Math.pow(1 + taxaMensal, meses);
        return valorFinal - getValorAtual();
    }

    private double calcularTaxaMensal() {
        return Math.pow(1 + cdiAnual, 1.0/12.0) - 1;
    }


}
