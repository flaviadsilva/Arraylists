
package copiandoarraylist;

import java.util.ArrayList;

public class CopiandoArrayList {

    public static void main(String[] args) {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruna");
        nomes.add("Carlos");
        nomes.add("Daniel");
        nomes.add("Eduardo");

        System.out.println("ArrayList original: " + nomes);

        ArrayList<String> nomesCopia = new ArrayList<>(nomes);

        System.out.println("ArrayList copiado: " + nomesCopia);
    }
}

