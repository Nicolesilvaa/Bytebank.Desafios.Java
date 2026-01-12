package br.com.bytebank.desafio1.exceptions;

public class SaldoInsuficienteException extends IllegalStateException {
    public SaldoInsuficienteException(String message) {

        super(message);
    }
}
