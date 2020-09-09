package Practica.ArrayList.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Practica {

    private ArrayList<Integer> numero = new ArrayList();

    public void agregarInformacion() {

        numero.add(110);
        numero.add(3);
        numero.add(5);

    }

    public void metodoSort() {

        Collections.sort(numero);

    }

    public void visulizarElemetosOrgnizados() {

        Iterator<Integer> numeros = numero.iterator();

        while (numeros.hasNext()) {

            System.out.println(numeros.next());

        }

    }

    public static void main(String[] args) {

        Practica sort = new Practica();

        sort.agregarInformacion();
        sort.metodoSort();
        sort.visulizarElemetosOrgnizados();

    }

}
