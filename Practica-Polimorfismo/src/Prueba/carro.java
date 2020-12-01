package Prueba;

public class carro extends VehiculoSuperclase {

    public carro() {
    }

    public carro(String marca, int kilometraje, int cilindraje, String placa) {
        super(marca, kilometraje, cilindraje, placa);
    }

    @Override
    public void acelerar() {

        System.out.println("Acerar carro 50 kilometros ");
    }

    @Override
    public void frenar() {

        System.out.println("Frenar en marcha el carro");

    }

    @Override
    public void estacionar() {

        System.out.println("Me estacione el carroo ");

    }

}
