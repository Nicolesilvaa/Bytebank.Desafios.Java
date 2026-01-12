package br.com.bytebank.desafio1.exceptions;

public class ContaInexistenteException extends RuntimeException {
    public ContaInexistenteException(String message) {
        super(message);
    }
}
