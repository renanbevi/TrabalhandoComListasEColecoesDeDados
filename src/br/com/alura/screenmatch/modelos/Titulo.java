package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    private int quantidadeAcessoTodosOsTitulos;


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica(){

        System.out.println("nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);

    }

    public int getQuantidadeAcessoTodosOsTitulos() {
        return quantidadeAcessoTodosOsTitulos;
    }

    public void setQuantidadeAcessoTodosOsTitulos(int quantidadeAcessoTodosOsTitulos) {
        this.quantidadeAcessoTodosOsTitulos = quantidadeAcessoTodosOsTitulos;
    }

    public void avalia(double nota){
        somaAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public void qtdAcesso(int qtdAcessoTodosTitulos){
        quantidadeAcessoTodosOsTitulos += qtdAcessoTodosTitulos;
        quantidadeAcessoTodosOsTitulos++;
    }

    public double pegaMedia(){
        return somaAvaliacoes / totalDeAvaliacoes;
    }
}
