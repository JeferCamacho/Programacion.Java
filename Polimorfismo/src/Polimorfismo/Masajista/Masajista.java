package Polimorfismo.Masajista;

import Polimorfismo.Seleccion.Futbol.Superclase.SeleccionFutbol;

public class Masajista extends SeleccionFutbol {

    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {

    }

    public Masajista(String titulacion, int aniosExperiencia, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    ///////////////////////////////////////////////////////////Polimorfismo
    @Override
    public void entrenamiento() {

        System.out.println("Da asistencia en el entrenamiento [Clase Masajista]");

    }

    //////////////////////////////////////////////////////////////////////////////
    public void darMasaje() {

        System.out.println("Dar masaje");
    }

}
