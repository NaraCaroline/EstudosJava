package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoMinutos;

    //GETTERS

    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public double getSomaAvaliacoes() {
        return somaAvaliacoes;
    }

    //SETTTERS

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    // METODOS

    public void exibeFichaTecnica() {
        System.out.println("------------ Ficha Tecnica ------------");
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Duração: " + duracaoMinutos + " minutos");
        System.out.println("Nota: " + pegaMediaAvaliacoes() + "(" + totalAvaliacoes+ ")");
    }

    public void avalia(double nota) {
        somaAvaliacoes += nota;
        totalAvaliacoes ++;
    }

    public double pegaMediaAvaliacoes() {
        return somaAvaliacoes / totalAvaliacoes;
    }
}
