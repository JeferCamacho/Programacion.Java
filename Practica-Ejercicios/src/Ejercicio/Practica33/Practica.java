package Ejercicio.Practica33;

import javax.swing.JOptionPane;

public class Practica {

    
    
    private int tiempoServicio;
    private int salario;

    public Practica() {

    }

    public Practica(int tiempoServicio, int salario) {
        this.tiempoServicio = tiempoServicio;
        this.salario = salario;
    }

    public int getTiempoServicio() {
        return tiempoServicio;
    }

    public void setTiempoServicio(int tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void validarServicio() {

        if (tiempoServicio >= 1 && tiempoServicio <= 5) {

            this.salario += 100;

        } else if (tiempoServicio == 6 && tiempoServicio <= 10) {

            this.salario += 250;
        } else if (tiempoServicio >= 11 && tiempoServicio <= 20) {

            this.salario += 400;

        } else if (tiempoServicio >= 21) {

            this.salario += 550;

        }

    }

    /*
    
    en una empresa de 100 trabajadores se hara un aumento de salario de acuerdo al tiempo de servicio para este 
    aumento se tomara encuenta lo siguiente:
    
    
Tiempo de servicio: de 1 a 5 años       Aumento: S/. 100

Tiempo de servicio: de 5 a 10 años      Aumento: S/. 250

Tiempo de servicio: de 10 a 20 años     Aumento: S/. 400

Tiempo de servicio: de 20 años a más    Aumento: S/. 550

    Se desea obtener una lista  del personal de forma creciente con respecto al salario modificado
    
    
     */
    public static void main(String[] args) {

        Practica aumento = new Practica(6 , 100);
        aumento.validarServicio();

        System.out.println("Salario de tiempo de servicio  " + "[ " + aumento.getSalario() + " ]");

    }

}
