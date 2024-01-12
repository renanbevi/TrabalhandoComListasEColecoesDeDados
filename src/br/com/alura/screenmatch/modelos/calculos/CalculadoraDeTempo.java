package br.com.alura.screenmatch.modelos.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    public void inclui(Titulo titulo){  //como titulo é pai de filme e serie podemos criar somente esse metodo herança resolve
    System.out.println("Mostrando a duração de: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }

}



//    public void inclui(Filme filme){
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie serie){
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }

