
package removendoelementosrepetidos;

import java.util.ArrayList;
import java.util.HashSet;

public class RemovendoElementosRepetidos {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(20);
        numeros.add(40);
        numeros.add(10);
        numeros.add(50);
        numeros.add(30);

        System.out.println("Lista original com duplicatas: " + numeros);

        HashSet<Integer> numerosUnicos = new HashSet<>(numeros);

        ArrayList<Integer> numerosSemDuplicatas = new ArrayList<>(numerosUnicos);

        System.out.println("Lista sem duplicatas: " + numerosSemDuplicatas);
    }
}

