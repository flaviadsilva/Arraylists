
package contandoocorrencias;

import java.util.ArrayList;
import java.util.Scanner;

public class ContandoOcorrencias {

    public static void main(String[] args) {
        
        ArrayList<String> palavras = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas palavras você deseja inserir? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite as palavras:");

        for (int i = 0; i < quantidade; i++) {
            String palavra = scanner.nextLine();
            palavras.add(palavra);
        }

        System.out.print("Digite a palavra para contar as ocorrências: ");
        String palavraPesquisa = scanner.nextLine();

        int count = 0;
        for (String palavra : palavras) {
            if (palavra.equals(palavraPesquisa)) {
                count++;
            }
        }

        System.out.println("A palavra \"" + palavraPesquisa + "\" aparece " + count + " vez(es) na lista.");

        scanner.close();
    }
}

