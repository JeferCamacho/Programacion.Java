package Practica.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class pruba {

    private List<String> nombres = new ArrayList();

    public void incorporarElementos() {

        nombres.add("Katerin");
        nombres.add("Omar");
        nombres.add("Salome");
        nombres.add("Leonardo");
        nombres.add("Gabriela");

    }

    public void primeraForma() {

        for (int i = 0; i < nombres.size() - 1; i++) {

            System.out.println(nombres.equals("Katerin"));

        }

    }

    public void segundaForma() {

        Iterator<String> iterator = nombres.iterator();

        while (iterator.hasNext()) {

            if (iterator.next().equals("Salome")) {

                System.out.println("[" + "Encontrado" + "]");
            }
        }

    }

    public static void main(String[] args) {

        pruba list = new pruba();

        list.incorporarElementos();
        list.primeraForma();
        list.segundaForma();

    }

}
