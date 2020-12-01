package PruebaPolimorfismo;

public class Perro extends Animal {

    public void Perro() {

    }

    public Perro(double estatura, String habitat) {
        super(estatura, habitat);
    }

    @Override
    public void tipoDeAlimentacion() {
        System.out.println("Purina ");

    }

    @Override
    public void makeSound() {

        System.out.println("gua gua");
        System.out.println("");
        
    }

}
