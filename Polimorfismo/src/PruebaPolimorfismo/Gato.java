package PruebaPolimorfismo;

public class Gato extends Animal {

    public void Gato() {
    }

    public Gato(double estatura, String habitat) {
        super(estatura, habitat);
    }

    @Override
    public void tipoDeAlimentacion() {

        System.out.println("Purina");
    }

    @Override
    public void makeSound() {

        System.out.println("Mia mia");

    }

}
