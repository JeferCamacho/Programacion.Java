package PruebaPolimorfismo;

public abstract class Animal {

    private double estatura;
    private String habitat;

    public void Animal() {

    }

    public Animal(double estatura, String habitat) {
        this.estatura = estatura;
        this.habitat = habitat;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public abstract void tipoDeAlimentacion();

    public abstract void makeSound();

}
