
package maiormenor;

import java.util.ArrayList;
import java.util.Collections;

public class MaiorMenor {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);
        
        System.out.println("Lista de números: " + numeros);

        int maiorValor = Collections.max(numeros);
        
        int menorValor = Collections.min(numeros);
        
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Menor valor: " + menorValor);
    }
}

