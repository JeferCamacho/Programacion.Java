package Practica.ArrayList;

import java.util.ArrayList;

public class Practica {

    private ArrayList<String> nombres = new ArrayList();

    public void ingresarNombres() {

        nombres.ensureCapacity(11);

        nombres.add("Jefersson");
        nombres.add("Camacho");
        nombres.add("Rodriguez");

    }

    public void visulizarElementos() {

        for (int i = 0; i <= (nombres.size() - 1); i++) {

            System.out.println(nombres.get(i));

        }

    }

    public static void main(String[] args) {

        Practica personas = new Practica();

        personas.ingresarNombres();
        personas.visulizarElementos();

    }

}
