package Ejercicio.Practica2;

public class EJercicio {

    private int[] array = new int[2];

    public EJercicio() {

    }

    public void setIngresarNumeros() {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random() * 100);

        }
    }

    public void setImprimirArray() {

        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + (i + 1) + "] " + "Numeros" + array[i]);

            if (array[0] > array[1]) {

                System.out.println("Decreciente");

            } else {

                System.out.println("Creciente");
            }

        }

    }
    
    public void validar(){
        
        for (int i = 0; i < array.length; i++) {
            

            
        }
        
    }

    public static void main(String[] args) {

        /////////////////////////////EJERCICIO//////////1///////////////////
        /*Hacer un programa que lea 2 numeros y deducir si estan en orden creciente o
          decreciente*/
        ///////////////////////////////////////////////////////////////////
        EJercicio numeros = new EJercicio();

        numeros.setIngresarNumeros();
        numeros.setImprimirArray();

    }

}
