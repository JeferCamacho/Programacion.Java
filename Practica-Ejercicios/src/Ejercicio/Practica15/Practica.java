package Ejercicio.Practica15;

public class Practica {

    private int[] array = new int[20];
    private double sueldo;

    public void salarioEmpleados() {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);

        }

    }

    public void imprimirSalario() {

        for (int i = 0; i < array.length; i++) {

System.out.println("["+(i+1)+"]  "+"Empleado sueldo   " + "[" + array[i] + "]  "+(sueldo =array[i]*50000) );

        }

    }
    
    
    

    public static void main(String[] args) {

        ///////////////////////////////EJERCICIO///////////////////////////////
        /*Dada las horas de trabajas de 20 personasy la tarifa de pago calcular el salario*/
        //////////////////////////////////////////////////////////////////////
        Practica salarios = new Practica();

        salarios.salarioEmpleados();
        salarios.imprimirSalario();

    }

}
