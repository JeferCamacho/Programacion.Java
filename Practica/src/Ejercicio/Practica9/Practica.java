
package Ejercicio.Practica9;

import javax.swing.JOptionPane;

public class Practica {

    private double[] array = new double[4];

    private int contAprovada;
    private int contDesaprobada;
    private double nota;
    private int cont1;
    private int cont2;
    private double div1;
    private double div2;
    private double notaMinima;

    public Practica() {

        contAprovada = 0;
        contDesaprobada = 0;
        nota = 0;
        cont1 = 0;
        cont2 = 0;
        div1 = 0;
        div2 = 0;
        notaMinima = 3.0;

    }

    public int getContAprovada() {
        return contAprovada;
    }

    public void setContAprovada(int contAprovada) {
        this.contAprovada = contAprovada;
    }

    public int getContDesaprobada() {
        return contDesaprobada;
    }

    public void setContDesaprobada(int contDesaprobada) {
        this.contDesaprobada = contDesaprobada;
    }

    public double getDiv1() {
        return div1;
    }

    public void setDiv1(double div1) {
        this.div1 = div1;
    }

    public double getDiv2() {
        return div2;
    }

    public void setDiv2(double div2) {
        this.div2 = div2;
    }

    public int getCont1() {
        return cont1;
    }

    public void setCont1(int cont1) {
        this.cont1 = cont1;
    }

    public int getCont2() {
        return cont2;
    }

    public void setCont2(int cont2) {
        this.cont2 = cont2;
    }

    public void setIngresarNotas() {

        for (int i = 0; i < array.length; i++) {
            array[i] = nota = Double.parseDouble(JOptionPane.showInputDialog("[" + (i + 1) + "]" + "Ingrese nota"));

        }

    }

    public void setImprimirArray() {

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "]  " + array[i]);

        }
    }

    public void setValidar() {

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 2.99) {

                cont1++;
                contDesaprobada += nota;
                div1 = (contDesaprobada / cont1);

            } else if (array[i] >= 3.0) {

                cont2++;
                contAprovada += nota;
                div2 = (contAprovada / cont2);
            }

        }
    }

    public static void main(String[] args) {
        //////////////////////////////////EJECICIO//////////////////////////////
        /*Dada N notas calcular el promedio de las notas aprobadas y el promedio 
     de las notas desapravadas
         */
        /////////////////////////////////////////////////////////////////////////

        Practica practica = new Practica();

        practica.setIngresarNotas();
        practica.setImprimirArray();
        practica.setValidar();
        System.out.println("Notas aprovadas  " + "[" + practica.getCont2() + "]");
        System.out.println("Notas desaprovadas  " + "[" + practica.getCont1() + "]");
        System.out.println("Promedio notas desaprovadas  " + "[" + practica.getDiv1() + "]");
        System.out.println("Promedio notas aprovadas  " + "[" + practica.getDiv2() + "]");

    }

}
