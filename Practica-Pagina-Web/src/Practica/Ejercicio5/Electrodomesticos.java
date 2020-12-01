package Practica.Ejercicio5;

import com.sun.org.apache.xpath.internal.operations.Equals;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Electrodomesticos {

    private List<String> listString = new LinkedList<>();
    private List<String> listLetra = new LinkedList<>();

    private int precio;
    private String color;
    private String consumoEnergetico;
    private int peso;
    private int tamaño;
    private boolean vali;

    public Electrodomesticos() {
    }

    public Electrodomesticos(int precio, int peso) {
        this.precio = precio;
        this.peso = peso;
    }

    public Electrodomesticos(int precio, String color, String consumoEnergetico, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumeEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumeEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void validarColor() {

        listString.add("blanco");
        listString.add("negro");
        listString.add("azul");
        listString.add("gris");
        listString.add("rojo");

    }

    public void validarColorList() {
        System.out.println("COLORES VALIDOS");

        Iterator<String> colores = listString.iterator();
        Iterator<String> colors = listString.iterator();

        while (colors.hasNext()) {
            String next = colors.next();

            System.out.println("[" + next + "]");
        }

        System.out.println("");

        while (colores.hasNext()) {

            if (this.color.equalsIgnoreCase(colores.next())) {

                System.out.println("[Color valido]");

            } else {
                System.out.println("[Color invalido]");
            }
        }

    }

    public void comprobarConsumoEnergetico() {

        System.out.println("");
        System.out.println("CONSUMO ENERGETICO");

        if (this.consumoEnergetico.equalsIgnoreCase("A") || this.consumoEnergetico.equalsIgnoreCase("f")) {

            System.out.println("valido");
        } else {

            System.out.println("Invalido");
        }

    }

    public void addLetras() {

        listLetra.add("a");
        listLetra.add("b");
        listLetra.add("c");
        listLetra.add("d");
        listLetra.add("e");

    }

    public void precioFinal(int tamaño) {

        Iterator<String> iterLetras = listLetra.iterator();

        while (iterLetras.hasNext()) {

        }

    }

}
