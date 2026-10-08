package br.com.fiap.domain;

public class Produto {

    // todos os produtos devem ter
    private String nome;
    private double preco;
    private int qtd;
    private int idItem;

    public Produto(){
        // construtor vazio
    }

    public Produto(String nome, double preco, int qtd, int idItem){
        this.nome = nome;
        this.preco = preco;
        this.qtd = qtd;
        this.idItem = idItem;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nPreco: " + preco +
                "\nQuantidade: " + qtd +
                "\nId do Item: " + idItem;
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

}
