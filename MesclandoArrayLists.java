
package mesclandoarraylists;

import java.util.ArrayList;

public class MesclandoArrayLists {
 static void main(String[] args) {

        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(10);
        lista1.add(20);
        lista1.add(30);
        lista1.add(40);
        lista1.add(50);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(60);
        lista2.add(70);
        lista2.add(80);
        lista2.add(90);
        lista2.add(100);

        ArrayList<Integer> listaMesclada = new ArrayList<>(lista1);  

        System.out.println("ArrayList 1: " + lista1);
        System.out.println("ArrayList 2: " + lista2);
        System.out.println("Lista mesclada: " + listaMesclada);
    }
}

