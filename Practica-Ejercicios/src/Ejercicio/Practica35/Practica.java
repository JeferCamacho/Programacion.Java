package Ejercicio.Practica35;

import javax.swing.JOptionPane;

public class Practica {

    private String[] encuesta = new String[10];
    private int contadorSi;
    private int contadorNo;

    public Practica() {

    }

    public int getContadorSi() {
        return contadorSi;
    }

    public void setContadorSi(int contadorSi) {
        this.contadorSi = contadorSi;
    }

    public int getContadorNo() {
        return contadorNo;
    }

    public void setContadorNo(int contadorNo) {
        this.contadorNo = contadorNo;
    }

    public void IngresarEncuesta() {

        for (int i = 0; i < encuesta.length; i++) {

            encuesta[i] = JOptionPane.showInputDialog("Ingrese Si O No ");

        }

    }

    public void validar() {

        for (int i = 0; i < encuesta.length; i++) {

            if (encuesta[i].equalsIgnoreCase("si")) {

                contadorSi++;

            } else if (encuesta[i].equalsIgnoreCase("No")) {

                contadorNo++;

            }

        }

    }

    public static void main(String[] args) {

        /*
        En una encuesa cuya alternativas son "Si" y "No" participaran 1000 personas se requiere saber cuantas 
        personas botaron por la primera opcion
        
        
         */
        Practica encuesta = new Practica();

        encuesta.IngresarEncuesta();
        encuesta.validar();

        System.out.println("Encuesta [Si]" + encuesta.getContadorSi());
        System.out.println("Encuesta [No]" + encuesta.getContadorNo());

    }

}
