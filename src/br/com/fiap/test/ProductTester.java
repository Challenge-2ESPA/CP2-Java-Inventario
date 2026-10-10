package br.com.fiap.test;

import br.com.fiap.domain.Produto;

import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args){

        // 12 a. Scanner criado no início do main
        Scanner sc = new Scanner(System.in);

        // 19. Solicitar a quantidade de produtos.
        int maxSize;

        do {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("Insira o número de produtos que gostaria de adicionar:");
            System.out.println("Insira 0 (zero) se não quiser adicionar mais produtos:");
            System.out.print("Quantidade: ");

            maxSize = sc.nextInt();

            if (maxSize < 0) {
                System.out.println("Valor incorreto inserido");
            }

        } while (maxSize < 0);

        sc.nextLine();

        // 12 b. Variáveis locais para armazenar dados temporários
        String tempName;
        int tempNumber;
        int tempQty;
        double tempPrice;

        // 12 c. Solicitar valores ao usuário
        System.out.println("Cadastro de Produto:");
        System.out.print("Digite o nome do produto: ");
        tempName = sc.nextLine();

        System.out.print("Digite a quantidade em estoque: ");
        tempQty = sc.nextInt();

        System.out.print("Digite o preço: ");
        tempPrice = sc.nextDouble();

        System.out.print("Digite o número do item: ");
        tempNumber = sc.nextInt();

        // 12 d. Criar objeto p1 com os valores inseridos pelo usuário
        Produto p1 = new Produto(tempName, tempPrice, tempQty, tempNumber);

        // 16. Marcar o primeiro produto como descontinuado.
        p1.setAtivo(false);

        // 13. Consumir a quebra de linha antes de ler o nome de p2.
        sc.nextLine();

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Cadastro do Produto 2");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        System.out.print("Digite o nome do produto: ");
        tempName = sc.nextLine();

        System.out.print("Digite a quantidade em estoque: ");
        tempQty = sc.nextInt();

        System.out.print("Digite o preço: ");
        tempPrice = sc.nextDouble();

        System.out.print("Digite o número do item: ");
        tempNumber = sc.nextInt();

        Produto p2 = new Produto(tempName, tempPrice, tempQty, tempNumber);

        sc.close();

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
