package br.com.alura.screenmatch.modelos.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class QuantidadeAcessoTodosOsTitulos {
    int quantidadeAcessoTodosOsTitulos;

    public int getQuantidadeAcessoTodosOsTitulos() {
        return quantidadeAcessoTodosOsTitulos;
    }

    public void setQuantidadeAcessoPorTitulo(int quantidadeAcessoTodosOsTitulos) {
        this.quantidadeAcessoTodosOsTitulos = quantidadeAcessoTodosOsTitulos;
    }

    public void somaQuantidadeDeAcessoPorTitulo(Titulo titulo){
        this.quantidadeAcessoTodosOsTitulos += titulo.getQuantidadeAcessoTodosOsTitulos();
    }
}
