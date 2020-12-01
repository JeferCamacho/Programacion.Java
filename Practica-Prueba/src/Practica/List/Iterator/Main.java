package Practica.List.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Persona empleado1 = new Persona(0, "Jefersson", "Desarrollador");
        Persona empleado2 = new Persona(0, "Jefersson", "Desarrollador");
        Persona empleado3 = new Persona(0, "Jefersson", "Desarrollador");
        Persona empleado4 = new Persona(0, "Jefersson", "Desarrollador");
        Persona empleado5 = new Persona(0, "Jefersson", "Desarrollador");
        Persona empleado6 = new Persona(0, "Jefersson", "Desarrollador");

        List<Persona> empleado = new LinkedList();

        empleado.add(empleado1);
        empleado.add(empleado2);
        empleado.add(empleado3);
        empleado.add(empleado4);
        empleado.add(empleado5);
        empleado.add(empleado6);

        Iterator<Persona> personas = empleado.iterator();

        while (personas.hasNext()) {
            Persona next = personas.next();

            System.out.println(next);

        }

    }

}
