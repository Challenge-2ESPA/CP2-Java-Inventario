package br.com.fiap.test;

import br.com.fiap.domain.Produto;

public class ProductTester {
    public static void main(String[] args){

        // 10 a. Dois produtos com o construtor padrão (vazio)
        Produto p1 = new Produto();
        
        Produto p2 = new Produto();

        // 10 b. Quatro produtos com o construtor com parâmetros
        Produto p3 = new Produto("Teclado", 149.90, 10, 3);

        Produto p4 = new Produto("Mouse", 79.90, 15, 4);

        Produto p5 = new Produto("Mousepad", 39.90, 5, 5);

        Produto p6 = new Produto("Monitor", 359.90, 3, 6);

        // Tópico 11 para executar os prints
        System.out.println("Começando os prints dos produtos:");
        System.out.println("Produto 1");
        System.out.println(p1);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Produto 2");
        System.out.println(p2);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Produto 3");
        System.out.println(p3);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Produto 4");
        System.out.println(p4);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Produto 5");
        System.out.println(p5);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.println("Produto 6");
        System.out.println(p6);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
