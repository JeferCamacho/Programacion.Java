package Polimorfismo.Futbolista;

import Polimorfismo.Seleccion.Futbol.Superclase.SeleccionFutbol;

public class Futbolista extends SeleccionFutbol {

    private int dorsal;
    private String demarcacion;

    public Futbolista() {

    }

    public Futbolista(int dorsal, String demarcacion, int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    ////////////////////////////////////////////////////////////////////Polimorfismo 
    @Override
    public void entrenamiento() {

        System.out.println("Realiza un entrenamiento  [Clase Futbolista] ");

    }

    ///////////////////////////////////////////////////////////////////
    @Override
    public void partidoFutbol() {

        System.out.println("Juega un partido [Clase Futbolista] ");

    }

    public void entrevista() {

        System.out.println("Da la entrevista");

    }

}
