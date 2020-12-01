package Ejercicio.Practica31;

import javax.swing.JOptionPane;

public class Practica {

    private int telefono[] = new int[3];
    private String[] nombres = new String[3];

    public void ingresarElementos() {

        for (int i = 0; i < 3; i++) {

            nombres[i] = JOptionPane.showInputDialog("Ingrese nombre");
            telefono[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese telefono"));

        }

    }

    public void imprimirVector() {

        for (int i = 0; i < 3; i++) {

            System.out.println("[" + nombres[i] + "]" + " " + "[" + telefono[i] + "]");
        }

    }

    public static void main(String[] args) {

        /*
        
        Hacer un programa que permita ingresar nombre[x], Telefono[x] , donde x va desde uno a  10 luego mostrar la
        lista de los usurio inversamente como fueron ingresados;
        
         */
        Practica vector = new Practica();

        vector.ingresarElementos();
        vector.imprimirVector();

    }

}
