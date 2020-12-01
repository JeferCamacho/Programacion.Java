package Prueba;

public class classObject {

    private int edad;
    private String nombre;
    private String carrera;
    private int salario;

    public classObject(int edad, String nombre, String carrera, int salario) {
        this.edad = edad;
        this.nombre = nombre;
        this.carrera = carrera;
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void estudiar() {

    }

    @Override
    public String toString() {
        return "classObject{" + "edad=" + edad + ", nombre=" + nombre + ", carrera=" + carrera + ", salario=" + salario + '}';
    }
    
    
    

}
