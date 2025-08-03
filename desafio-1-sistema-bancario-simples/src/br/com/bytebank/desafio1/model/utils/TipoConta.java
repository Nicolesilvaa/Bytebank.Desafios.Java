package br.com.bytebank.desafio1.model.utils;

public enum TipoConta {
    CORRENTE("Corrente"),
    POUPANCA("Poupança"),
    SALARIO("Salário"),
    INVESTIMENTO("Investimento");

    private final String tipo;

    TipoConta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

}