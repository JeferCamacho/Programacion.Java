package Prueba;

public class moto extends VehiculoSuperclase {

    public moto() {
    }

    public moto(String marca, int kilometraje, int cilindraje, String placa) {
        super(marca, kilometraje, cilindraje, placa);
    }

    @Override
    public void acelerar() {

        System.out.println("Acelere a mas de 100 Km la moto");

    }

    @Override
    public void frenar() {

        System.out.println("Reduci los niveles velocidad de la moto ");

    }

    @Override
    public void estacionar() {

        System.out.println("Estacione en un parqueadero de motos");

    }

}
