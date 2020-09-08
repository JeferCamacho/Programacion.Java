package Ejercicio_practica1;

public class Practica {

    private String titular;
    private double cantidad;

    public Practica() {

        titular = "";
        cantidad = 0;

    }

    public Practica(String titular, double cantidad) {

        if (this.cantidad < 0) {

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
        return "Practica{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }

    /*
    
    Prancipalmente estamos realizando el comportamiento en cantidad(Atributo) para realizar el respectivo 
    metodo y reliazar el comportamiento
    
    
    cantidad es una variables en cual va a tomar diferentes comportamiento como se visualiza en los 
    dos metodo  es muy importante que debe realizar una identificacion muy relativamente muy importante 
    que es el (Parametro y el Argumento )
     */
    public void ingresar(double cantidad) {

        if (cantidad > 0) {

            this.cantidad += cantidad;

        }

    }

    public void retirar(double cantidad) {

        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }

    }

    public static void main(String[] args) {

        /*
        1) Crea una clase llamada Cuenta que tendrá los siguientes atributos:
        titular y cantidad (puede tener decimales).
        
        El titular será obligatorio y la cantidad es opcional. Crea dos constructores que cumpla lo anterior.

Crea sus métodos get, set y toString.

Tendrá dos métodos especiales:

ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
retirar(double cantidad): se retira una cantidad a la cuenta, si restando la cantidad actual a la que nos pasan es negativa,
        la cantidad de la cuenta pasa a ser 0.
        
        
         */
        Practica cuenta = new Practica();

        cuenta.ingresar(100);
        cuenta.retirar(800000);

        System.out.println(cuenta);

    }

}
