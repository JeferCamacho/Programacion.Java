package Ejercicio.Practica34;

public class Practica {

    private int[] encuesta = new int[10];
    private int contador;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public void incoporarEdades() {

        for (int i = 0; i < encuesta.length; i++) {
            encuesta[i] = (int) Math.round(Math.random() * 80);

        }

    }

    public void imprimirEdades() {

        for (int i = 0; i < encuesta.length; i++) {

            System.out.println("[" + encuesta[i] + "]");
        }

    }

    public void validarRelacion() {

        for (int i = 0; i < encuesta.length; i++) {

            if (encuesta[i] >= 35) {

                contador++;

            }

        }

    }

    public static void main(String[] args) {

        /*
    
    Dada una lista de 100 personas se pide una relacion de las personas mayores de 35 años 
    
    
         */
        Practica encuesta = new Practica();

        encuesta.incoporarEdades();
        encuesta.imprimirEdades();
        encuesta.validarRelacion();

        System.out.println("Totalidad de personas mayores de 35" + "[" + encuesta.getContador() + "]");

    }

}
