package Prueba;

public class main {

    public static void main(String[] args) {

        /*
        
        Polimorfismo en persona
        
         */
        VehiculoSuperclase carro = new carro("BMW", 0, 0, "KL5452");

        //Instaciamos el objeto de la Subclase carro en cual al instanciarlo nos da como un sello y lo traemos 
        carro.acelerar();
        carro.frenar();
        carro.estacionar();
        carro.toString();

        System.out.println("");

        VehiculoSuperclase moto = new moto("KAWAZAKI", 0, 0, "HKLDS465");

        moto.acelerar();
        moto.frenar();
        moto.estacionar();
        moto.toString();

    }

}
