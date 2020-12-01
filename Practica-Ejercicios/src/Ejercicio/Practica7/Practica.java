
package Ejercicio.Practica7;

public class Practica {

    private double duracionMinutos;
    private double ope;
    private double precioLlamada;

    public Practica() {
        duracionMinutos = 0;
        ope = 0;
        precioLlamada = 0.50;

    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
        if (duracionMinutos <= 3) {
    
            ope = precioLlamada;
    
        } else if (duracionMinutos > 4) {
    
            ope = (precioLlamada * 0.1);
    
        }

    }

    public void setOperacionLlamada() {


    }

  

    public double getope() {
        return ope;

    }

 

    public static void main(String[] args) {
        //////////////////////////////// EJERCICIO///////////////////////////
        /*
         * Dada una duracion en minutos de una llamada calcular el costo,considerando
         * -Hasat tres minutos el costo es 0.50 -Por encima de tres minutos es 0.50 mas
         * 0.1 * cada minuto adicional a los tres primeros
         * 
         * 
         */
        ///////////////////////////////////////////////////////////////////

        Practica minutos = new Practica();

        minutos.setDuracionMinutos(10);
        minutos.setOperacionLlamada();
        System.out.println(minutos.getope());

    }

}
