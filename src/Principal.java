import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.calculos.QuantidadeAcessoTodosOsTitulos;

import java.util.ArrayList;
import java.util.Objects;

public class Principal {
    public static void main(String[] args){

        Filme meuFilme = new Filme("O Poderoso chefão",1970);
        //meuFilme.setNome("O Poderoso chefão");
       // meuFilme.setAnoDeLancamento(1970); ;
        meuFilme.setDuracaoEmMinutos(180);  ;
        meuFilme.setQuantidadeAcessoTodosOsTitulos(300);
        meuFilme.avalia(3);
        System.out.println("Duração de minutos: " + meuFilme.getDuracaoEmMinutos());

        Filme adan = new Filme("Amizade",1970);
       // adan.setNome("Amizade");
        adan.setDuracaoEmMinutos(180);
       // adan.setAnoDeLancamento(1970);
        adan.setQuantidadeAcessoTodosOsTitulos(300);
        adan.avalia(5);

        Filme filmeDoRenan =  new Filme("Renanzin",1970);
       // filmeDoRenan.setNome("Renanzin");
       // filmeDoRenan.setDuracaoEmMinutos(300);
        filmeDoRenan.setAnoDeLancamento(1970);
        filmeDoRenan.setQuantidadeAcessoTodosOsTitulos(400);
        filmeDoRenan.avalia(10);


        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(adan);
        listaDeFilmes.add(filmeDoRenan);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size()); //size tamanho da lista
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome()); // pegando o primeiro item da posição
        System.out.println("Segundo Filme: " + listaDeFilmes.get(1).getNome()); // pegando o segundo item da posição
        System.out.println("Terceiro Filme: " + listaDeFilmes.get(2).getNome()); // pegando o segundo item da posição
        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.get(0).toString());




        Serie serie = new Serie("Pequenino",1977);
        // serie.setNome("Pequenino");
        //serie.setAnoDeLancamento(1977);
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporadas(10);
        serie.setMinutosPorEpisodios(50);
        serie.setDuracaoEmMinutos(2000);
        serie.setQuantidadeAcessoTodosOsTitulos(1000);

        System.out.println("Serie: " + serie.getNome());
        System.out.println("Ano de lançamento: " + serie.getAnoDeLancamento());
        System.out.println("Temporadas: " + serie.getTemporadas());
        System.out.println("Episódios por temporadas: " + serie.getEpisodiosPorTemporadas());
        System.out.println("Minutos por eposódio" + serie.getMinutosPorEpisodios());
        System.out.println("Duração de minutos: " + serie.getDuracaoEmMinutos());
        System.out.println("Duração para maratonar a serie :" + serie.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(4);
        System.out.println("Total de avaliações " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(adan);
        calculadora.inclui(filmeDoRenan);
        calculadora.inclui(serie);

        QuantidadeAcessoTodosOsTitulos quantidadeAcessoPorTitulo = new QuantidadeAcessoTodosOsTitulos();
        quantidadeAcessoPorTitulo.somaQuantidadeDeAcessoPorTitulo(meuFilme);
        quantidadeAcessoPorTitulo.somaQuantidadeDeAcessoPorTitulo(serie);
        quantidadeAcessoPorTitulo.somaQuantidadeDeAcessoPorTitulo(filmeDoRenan);

        System.out.println("Total de tempo é: " + calculadora.getTempoTotal());
        System.out.println("Quantidade total de acesso por titulo :" + quantidadeAcessoPorTitulo.getQuantidadeAcessoTodosOsTitulos());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(adan);
        episodio.setTotalVisualizacoes(45);
        filtroRecomendacao.filtra(episodio);
    }


}
