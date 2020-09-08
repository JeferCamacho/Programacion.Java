package Ejercicio_practica2;

import com.sun.javafx.css.CalculatedValue;

public class Persona {

    private final static char sexo_Defi = 'H';
    private final static int peso_NoIdeal = -1;
    private final static int peso_Ideal = 0;
    private final static int peso_SobrePeso = 1;

    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;
    private double calcularMc;

    private boolean sexoRetorno = false;

    public void Persona() {

    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, int dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Metodo de comportamiento
    public int calcalarMC() {

        calcularMc = ((peso) / (Math.pow(peso, 2)));

        if (calcularMc >= 20 && calcularMc <= 25) {

            return peso_Ideal;

        } else if (calcularMc < 20) {

            return peso_NoIdeal;

        } else {

            return peso_SobrePeso;

        }
    }

    public boolean comprobarSexo() {

        if (edad > 18) {

            sexoRetorno = true;
        }
        return sexoRetorno;

    }

    public void generarDni() {

    }

    @Override
    public String toString() {

        String sexo;

        if (this.sexo == 'h') {

            sexo = "Hombre";

        } else {

            sexo = "Mujer";

        }
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + ", calcularMc=" + calcularMc + ", sexoRetorno=" + sexoRetorno + '}';
    }

    public static void main(String[] args) {

    }
}
