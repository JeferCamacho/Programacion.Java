package Prueba;

public abstract class VehiculoSuperclase {

    private String marca;
    private int kilometraje;
    private int cilindraje;
    private String placa;

    public VehiculoSuperclase() {

    }

    public VehiculoSuperclase(String marca, int kilometraje, int cilindraje, String placa) {
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.cilindraje = cilindraje;
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "VehiculoSuperclase{" + "marca=" + marca + ", kilometraje=" + kilometraje + ", cilindraje=" + cilindraje + ", placa=" + placa + '}';
    }

    public abstract void acelerar();

    public abstract void frenar();

    public abstract void estacionar();

}
