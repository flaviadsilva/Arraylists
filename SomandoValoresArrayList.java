
package somandovaloresarraylist;

import java.util.ArrayList;

public class SomandoValoresArrayList {

    public static void main(String[] args) {

        ArrayList<Double> numeros = new ArrayList<>();
        numeros.add(10.5);
        numeros.add(20.5);
        numeros.add(30.5);
        numeros.add(40.5);
        numeros.add(50.5);

        double soma = 0;

        for (Double numero : numeros) {
            soma += numero;
        }

        System.out.println("A soma de todos os valores é: " + soma);
    }
}

