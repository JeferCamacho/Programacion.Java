package Practica.Ejercicio2;

public class pruebamath {

    private double estatura;
    private double peso;
    private double pesoActual;

    public pruebamath() {
    }

    public pruebamath(double estatura, double peso) {
        this.estatura = estatura;
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {

        this.peso = peso;
    }

    public double getCalcular() {
        return pesoActual;
    }

    public void setCalcular(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public double getPesoActual() {
        return pesoActual;
    }

    public void setPesoActual(double pesoActual) {
        this.pesoActual = pesoActual;
    }

    public void calcularIcm() {

        pesoActual = (int) (this.peso) / Math.pow(this.estatura, 2);

    }

    public static void main(String[] args) {

        pruebamath validacionMedica = new pruebamath();

        validacionMedica.setPeso(50.4);
        validacionMedica.setEstatura(1.84);
        validacionMedica.calcularIcm();

        System.out.println(validacionMedica.getPesoActual());

    }

}
