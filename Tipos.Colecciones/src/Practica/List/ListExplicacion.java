package Practica.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExplicacion {

    private List<String> nombre = new ArrayList();

    public void ingresarInformacion() {

        nombre.add("jefersson");
        nombre.add("jefersson camacho cumple 27 años ");
        nombre.add("Angel Maria");
        nombre.add("Rodriguez");

    }

    public void visulizarInformacionFor() {

        for (int i = 0; i <= nombre.size() - 1; i++) {

            System.out.println(nombre.get(i));

        }

        System.out.println("////////////////////////////////////////////");

    }

    public void eliminarElemento() {

        nombre.clear();

    }

    public void imprimirPosicion() {

        System.out.println(nombre.get(0));

    }

    public void visulizarInformacionIterator() {
        System.out.println("///////////////////////////////////////////////");

        Iterator<String> nombres = nombre.iterator();
        while (nombres.hasNext()) {

            System.out.println(nombres.next());

        }

    }

    public static void main(String[] args) {
        ListExplicacion arrayList = new ListExplicacion();

        arrayList.ingresarInformacion();
        arrayList.visulizarInformacionFor();
        arrayList.imprimirPosicion();
        arrayList.eliminarElemento();
        arrayList.visulizarInformacionIterator();
    }

}
