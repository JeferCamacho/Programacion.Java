package Practica.Ejercicio2;

public class Persona {

    private final static int pesoBajo = -1;
    private final static int pesoIdeal = 0;
    private final static int pesoSobrePeso = 1;

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double estatura;
    private double pesoActual;

    public Persona() {
    }

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.estatura = estatura;
    }

    public Persona(String nombre, int edad, char sexo, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getCalcular() {
        return pesoActual;
    }

    public void calcularImc() {

        pesoActual = (this.peso) / (Math.pow(this.estatura, 2));

    }

    public void retornoImcPeso() {

        if (pesoActual < 20) {

            System.out.println("Bajo de peso");

        } else if (pesoActual >= 20 && pesoActual <= 25) {

            System.out.println("Peso ideal");

        } else if (pesoActual > 25) {
            System.out.println("Sobre peso");
        }

    }

    public void esMayorDeEdad() {

        if (this.peso < 18) {

            System.out.println("Menor de edad ");

        } else {

            System.out.println("El mayor edad");
        }

    }
        

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", estatura=" + estatura + ", pesoActual=" + pesoActual + '}';
    }

    public static void main(String[] args) {

        Persona validacionSalud = new Persona("Jefersson", 20, "asf654", 'h', 20, 1.67);

        validacionSalud.calcularImc();
        validacionSalud.retornoImcPeso();
        validacionSalud.esMayorDeEdad();

        System.out.println(validacionSalud);
    }

}
