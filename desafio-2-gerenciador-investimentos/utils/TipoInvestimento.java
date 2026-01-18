package br.com.bytebank.desafio1.utils;

public enum TipoInvestimento {
    CDB("CDB"),
    ACOES("Ações"),
    FI("Fundo de investimento"),
    LCI("LCI");

    private final String tipo;

    TipoInvestimento(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return tipo; 
    }

}