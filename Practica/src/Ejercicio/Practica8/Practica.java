package Ejercicio.Practica8;

public class Practica {

    private int[] array = new int[3];
    private int aux;

    public Practica() {

        aux = 0;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public void setRellenoArray() {

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) Math.round(Math.random()*100);
        }

    }

    public void setImprimirArray() {

        for (int i = 0; i < array.length; i++) {

            System.out.println("[" + (i + 1) + "]" + array[i]);

        }

    }

    public void setNumeroMayor() {

        for (int i = 0; i < array.length; i++) {
            if (array[i] > aux) {

                aux = array[i];

            }

        }
    }

    public static void main(String[] args) {
///////////////////////////////////////EJEFERCICIO////////////////////////////////
/*Dada tres numeros calcular el mayor*/
////////////////////////////////////////////////////////////////////////////////////

        Practica array = new Practica();

        array.setRellenoArray();
        array.setNumeroMayor();
        array.setImprimirArray();
        System.out.println("Numer mayoro " + array.getAux());

    }

}
