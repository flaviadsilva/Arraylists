
package invertendoordemelementos;

import java.util.ArrayList;
import java.util.Collections;

public class InvertendoOrdemElementos {

    public static void main(String[] args) {

        ArrayList<String> elementos = new ArrayList<>();
        elementos.add("Uva");
        elementos.add("Manga");
        elementos.add("Maçã");
        elementos.add("Laranja");
        elementos.add("Banana");
        elementos.add("Abacaxi");

        System.out.println("Ordem original: " + elementos);

        Collections.reverse(elementos);

        System.out.println("Ordem inversa: " + elementos);
    }
}

