package Ejercicio.Practica12;

public class Practica {

    private int monto;
    private double descuento;

    public void Practica() {

        monto = 0;
        descuento = 0;

    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento() {

        if (monto <= 10000) {

            descuento = (monto * 0.10) - (monto);

        } else if (monto == 50000 ) {

            descuento = (monto * 0.20) - (monto);

        }else if (monto <=100000){
            
            descuento = (monto* 0.20)-(monto);
        }

    }

    public static void main(String[] args) {

        ////////////////////////////////EJERCICIO/////////////////
        /*Dada el monto de una compra calcular el descuento considerando es 
          
         *10% si el monto es mayor a 10.000 pesos 
         *20% descuento si el monto es mayor 50.000 pesos y menor o igual a 100.000
         *No hay descuento si el monto es mayor o igual  a 5000
  
         */
        //////////////////////////////////////////////////////////
        Practica practica = new Practica();

        practica.setMonto(70000);
        practica.setDescuento();
        System.out.println("Descuento" + practica.getDescuento());
    }

}
