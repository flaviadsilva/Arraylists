package removendoelementos;

import java.util.ArrayList;
import java.util.Scanner;

public class RemovendoElementos {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruna");
        nomes.add("Daniel");
        nomes.add("Eduardo");

        System.out.println("Lista inicial de nomes: " + nomes);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome para remover: ");
        String nomeRemover = scanner.nextLine();

        if (nomes.contains(nomeRemover)) {
            nomes.remove(nomeRemover);
            System.out.println("Nome removido com sucesso.");
        } else {
            System.out.println("O nome não foi encontrado na lista.");
        }

        System.out.println("Lista atualizada de nomes: " + nomes);

        scanner.close();
    }
}
