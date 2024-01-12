package br.com.alura.screenmatch.modelos.calculos;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() == 5) {
            System.out.println("Está entre os melhores do momento");
            } else if (classificavel.getClassificacao() == 4) {
            System.out.println("Está entre os bons do momento");
            } else if (classificavel.getClassificacao() == 3) {
            System.out.println("Está entre os rasoaveis do momento");
            } else if (classificavel.getClassificacao() == 2) {
            System.out.println("Está entre os não vistos do momento");
            } else {
            System.out.println("Coloque na sua lista para assistir depois");
            }
        }
    }