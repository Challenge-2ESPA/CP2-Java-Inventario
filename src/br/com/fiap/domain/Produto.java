package br.com.fiap.domain;

public class Produto {

    // todos os produtos devem ter
    private String nome;
    private double preco;
    private int qtd;
    private int idItem;
    private boolean ativo = true;

    public Produto(){
        // construtor vazio
    }

    public Produto(String nome, double preco, int qtd, int idItem){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
        this.idItem = idItem;
    }

    // 17. Calcular o valor total do estoque deste produto.
    public double calcularValorInventario() {
        return preco * qtd;
    }

    @Override
    public String toString() {
        return "Número do Item           : " + idItem +
                "\nNome                  : " + nome +
                "\nQuantidade em Estoque : " + qtd +
                "\nPreço                 : R$ " + String.format("%.2f", preco) +
                "\nValor do Estoque      : R$ " + String.format("%.2f", calcularValorInventario()) +
                "\nStatus do Produto     : " + (ativo ? "Ativo" : "Descontinuado");
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

}
