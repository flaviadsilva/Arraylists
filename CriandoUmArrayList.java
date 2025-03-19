package criandoumarraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class CriandoUmArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }

        System.out.println("\nOs números armazenados são:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }

}
