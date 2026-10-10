
package br.com.fiap.test;

import br.com.fiap.domain.Produto;
import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {

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

        // 12 b. Variáveis locais para armazenar dados temporários
        String tempName;
        int tempNumber;
        int tempQty;
        double tempPrice;

        // 20. Verificar se o usuário deseja cadastrar produtos
        if (maxSize == 0) {

            System.out.println("Não há produtos!");

        } else {

            // 20. Criar um array com a quantidade informada
            Produto[] Produtos = new Produto[maxSize];

            // 21. Cadastrar os produtos utilizando um loop for
            for (int i = 0; i < maxSize; i++) {

                // Limpar o buffer antes de ler o nome
                sc.nextLine();

                System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Cadastro do Produto " + (i + 1));
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

                // 21. Solicitar os dados de cada produto
                System.out.print("Digite o nome do produto: ");
                tempName = sc.nextLine();

                System.out.print("Digite a quantidade em estoque: ");
                tempQty = sc.nextInt();

                System.out.print("Digite o preço: ");
                tempPrice = sc.nextDouble();

                System.out.print("Digite o número do item: ");
                tempNumber = sc.nextInt();

                // 21. Criar o objeto e armazenar no array
                Produtos[i] = new Produto(
                        tempName,
                        tempPrice,
                        tempQty,
                        tempNumber
                );
            }

            // 22. Exibir todos os produtos utilizando for each
            System.out.println("\nComeçando os prints dos produtos:");

            int contador = 1;

            for (Produto produto : Produtos) {

                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Produto " + contador);
                System.out.println(produto);
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

                contador++;
            }
        }

        // Fechar o Scanner após finalizar sua utilização
        sc.close();
    }
}
