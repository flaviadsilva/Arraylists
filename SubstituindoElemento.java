package substituindoelemento;

import java.util.ArrayList;
import java.util.Scanner;

public class SubstituindoElemento {

    public static void main(String[] args) {
        ArrayList<String> cidades = new ArrayList<>();
        cidades.add("São Paulo");
        cidades.add("Rio de Janeiro");
        cidades.add("Belo Horizonte");
        cidades.add("Salvador");
        cidades.add("Curitiba");

        System.out.println("Lista de cidades antes da substituição: " + cidades);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da cidade a ser substituída: ");
        String cidadeAntiga = scanner.nextLine();

        if (cidades.contains(cidadeAntiga)) {

            System.out.print("Digite o nome da nova cidade para substituir: ");
            String cidadeNova = scanner.nextLine();

            int indice = cidades.indexOf(cidadeAntiga);
            cidades.set(indice, cidadeNova);

            System.out.println("Lista de cidades após a substituição: " + cidades);
        } else {

            System.out.println("Cidade não encontrada na lista.");
        }

        scanner.close();
    }
}
