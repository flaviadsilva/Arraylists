package buscandoelemento;

import java.util.ArrayList;
import java.util.Scanner;

public class BuscandoElemento {

    public static void main(String[] args) {

        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Arroz");
        produtos.add("Feijão");
        produtos.add("Macarrão");
        produtos.add("Óleo");
        produtos.add("Açúcar");

        System.out.println("Lista de produtos disponíveis: " + produtos);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto que você deseja buscar: ");
        String produtoPesquisa = scanner.nextLine();

        if (produtos.contains(produtoPesquisa)) {
            System.out.println("Produto encontrado: " + produtoPesquisa);
        } else {
            System.out.println("Produto não encontrado.");
        }

        scanner.close();
    }
}

