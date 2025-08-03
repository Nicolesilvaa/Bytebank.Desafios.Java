package br.com.bytebank.desafio1.model.utils;

public enum TipoConta {
    CORRENTE("Conta corrente"),
    POUPANCA("Conta poupança"),
    SALARIO("Conta salário"),
    INVESTIMENTO("Conta de investimento");

    private final String tipo;

    TipoConta(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

}