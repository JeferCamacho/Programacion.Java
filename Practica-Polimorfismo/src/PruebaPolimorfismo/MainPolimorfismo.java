package PruebaPolimorfismo;

public class MainPolimorfismo {

    public static void main(String[] args) {

        Perro animal1 = new Perro(2.20, "Domestico");

        animal1.tipoDeAlimentacion();
        animal1.makeSound();

        ///////////////////////////////////////////////////////////////
        Animal animal2 = new Gato(10.5, "Domestico");

        animal2.tipoDeAlimentacion();
        animal2.makeSound();

    }

}
