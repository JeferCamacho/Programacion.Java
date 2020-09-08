package Practica.Array;

import javax.swing.JOptionPane;

public class ArrayParalelo {

    private String[] nombre = new String[3];
    private int[] telefono = new int[3];
    private int posicion;
    private int posicionActual = telefono[0];

    public void ingresarElementos() {

        for (int i = 0; i < 3; i++) {

            nombre[i] = JOptionPane.showInputDialog("Ingrese nombre");
            telefono[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
        }

    }

    public void imprimirVector() {

        for (int i = 0; i < 3; i++) {

            System.out.println("[" + nombre[i] + "]" + "  " + "[" + telefono[i] + "]");

        }

    }

    public void validarMayor() {

        for (int i = 0; i < 3; i++) {

            if (telefono[i] > posicionActual) {

                posicionActual = telefono[i];
                posicion = i;

            }

        }

    }

    public void imprimirNumeroMayor() {

        System.out.println("[" + nombre[posicion] + "]" + "  " + "[" + posicionActual + "]");;

    }

    public static void main(String[] args) {

        ArrayParalelo vector = new ArrayParalelo();

        vector.ingresarElementos();
        vector.imprimirVector();
        vector.validarMayor();
        vector.imprimirNumeroMayor();
    }

}
