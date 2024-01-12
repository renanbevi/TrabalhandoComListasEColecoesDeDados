package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.modelos.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Filme serie;
    private int totalVisualizacoes;

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Filme getSerie() {
        return serie;
    }

    public void setSerie(Filme serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualizacoes > 100){
            return 5;
        }else if (totalVisualizacoes < 60 && totalVisualizacoes < 100){
            return 4;
        }else if(totalVisualizacoes < 40 && totalVisualizacoes < 60){
            return 3;
        }else if(totalVisualizacoes < 10 && totalVisualizacoes < 40){
            return 3;
        }else{
            return 2;
        }
    }
}
