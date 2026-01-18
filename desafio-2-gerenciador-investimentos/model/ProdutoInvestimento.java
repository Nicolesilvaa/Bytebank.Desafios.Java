package br.com.bytebank.desafio1.model;

import br.com.bytebank.desafio1.utils.TipoInvestimento;

public abstract class ProdutoInvestimento {

    private String codigo;
    private String nome;
    private double valorAtual;
    private TipoInvestimento tipoInvestimento;

    public ProdutoInvestimento(String codigo, String nome, double valorAtual, TipoInvestimento tipoInvestimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.valorAtual = valorAtual;
        this.tipoInvestimento = tipoInvestimento;
    }

    abstract double calcularRendimentoMensal();

    abstract double calcularRendimentoAcumulado(int meses);

    public void atualizarValor() {
        double rendimento = calcularRendimentoMensal();
        this.valorAtual += rendimento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(double valorAtual) {
        this.valorAtual = valorAtual;
    }

    public TipoInvestimento getTipoInvestimento() {
        return tipoInvestimento;
    }

    public void setTipoInvestimento(TipoInvestimento tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    @Override
    public String toString() {
        return "ProdutoInvestimento{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", valorAtual=" + valorAtual +
                ", tipoInvestimento=" + tipoInvestimento +
                '}';
    }
}