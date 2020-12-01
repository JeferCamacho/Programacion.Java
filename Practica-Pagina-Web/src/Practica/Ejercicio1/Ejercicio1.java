package Practica.Ejercicio1;

public class Ejercicio1 {

    private String titular;
    private double cantidad;

    public Ejercicio1() {
    }

    public Ejercicio1(String titular, double cantidad) {
        this.titular = titular;

        if (cantidad < 0) {

            this.cantidad = 0;

        } else {

            this.cantidad = cantidad;
        }

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Ejercicio1 [" + "   titular=" + titular + ",   cantidad=  " + cantidad + ']';
    }

    public void ingresarDinero(double cantidad) {

        if (cantidad > 0) {
            this.cantidad += cantidad;

        }

    }

    public void retirarDinero(double cantidad) {

        if (cantidad >= this.cantidad) {

            this.cantidad = 0;

        } else {

            this.cantidad -= cantidad;
        }

    }

    public static void main(String[] args) {

        Ejercicio1 cuenta = new Ejercicio1("Jefersson", -4500);

        cuenta.setCantidad(40000);
        cuenta.retirarDinero(3800);

        System.out.println(cuenta);

    }

}
