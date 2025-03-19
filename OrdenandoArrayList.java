package ordenandoarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class OrdenandoArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int numeroAleatorio = random.nextInt(100) + 1;
            numeros.add(numeroAleatorio);
        }

        System.out.println("Lista de números antes da ordenação: " + numeros);

        Collections.sort(numeros);

        System.out.println("Lista de números ordenada: " + numeros);
    }
}
