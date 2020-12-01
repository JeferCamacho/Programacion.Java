package Practica.Herencia;

public class Empleado extends SuperClasePersonaSalario {

    private int tiempo;

    public Empleado(int tiempo, String nombre, int edad, int salario) {
        super(nombre, edad, salario);
        this.tiempo = tiempo;
    }

    public static void main(String[] args) {

        Empleado empl1 = new Empleado(5, "jefersson", 20, 2000);

        empl1.Salario(1000);
        System.out.println("Salario:" + empl1.getSalario());
    }

}
