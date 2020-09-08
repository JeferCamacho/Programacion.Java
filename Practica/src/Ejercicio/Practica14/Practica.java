package Ejercicio.Practica14;

import javax.swing.JOptionPane;

public class Practica {

    private int edad;
    private String sexo;
    private int seguir;

    private int cont;
    private int contHombre;
    private int contMujer;

    private double promHombre;
    private double promMujer;

    private int contEdadH;
    private int contEdadM;

    public Practica() {

        edad = 0;
        sexo = "";
        seguir = 0;
        cont = 0;
        contHombre = 0;
        contMujer = 0;

    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCont() {
        return cont;
    }

    public int getContHombre() {
        return contHombre;
    }

    public int getContMujer() {
        return contMujer;
    }

    public double getPromHombre() {
        return promHombre;
    }

    public double getPromMujer() {
        return promMujer;
    }

    public void setPersonasAsistieron() {

        //Pendiente
        
        do {
            for (int i = 0; i < cont; i++) {

                int[] array = new int[cont];

                for (int j = 0; j < array.length; j++) {
                    array[j] = edad = Integer.parseInt(JOptionPane.showInputDialog("Informacion personal", "Ingrese edad"));

                }

            }

            if (edad < 18) {

                JOptionPane.showMessageDialog(null, "Edad no permitia");

            } else {

                sexo = JOptionPane.showInputDialog("Ingrese sexo \n" + " H = nombre  \n"
                        + "M  =  mujer");

                cont++;

                if (sexo.equalsIgnoreCase("H")) {

                    contHombre++;
                    contEdadH += edad;

                    promHombre = (contEdadH / contHombre);

                } else if (sexo.equalsIgnoreCase("M")) {

                    contMujer++;
                    contEdadM += edad;

                    promMujer = (contEdadM / contMujer);

                }

            }

            seguir = Integer.parseInt(JOptionPane.showInputDialog("Desea Ingresar mas datos \n"
                    + "Si = 1 \n"
                    + "NO = 0 "));

        } while (seguir != 0);

    }

    public static void main(String[] args) {

        ////////////////////////////////EJERCICIO///////////////////
        /*  Auna fiesta asistieron personas de diferentes edades y sexos.
            -Construie un algoritmo dadad las edades y sexos de la persenas calcualar
        
            -Cuantas personas asistieron a la fiesta
            -Cuantos hombre y cuantas mujeres 
            -Promedio de edades por sexo 
            -La edad de la persona mas joven que asistio 
            -Nose permiten menores de edad a la fiesta
            -Ingresar datos hasta que se ingrese una edad a cero
        
        
        
         */
        ////////////////////////////////////////////////////////////
        Practica practica = new Practica();

        practica.setPersonasAsistieron();

        JOptionPane.showMessageDialog(null, "Personas que asistieron " + "[" + practica.getCont() + "]");
        JOptionPane.showMessageDialog(null, "Asistieron   " + "[" + practica.getContHombre() + "]   " + "Hombres");
        JOptionPane.showMessageDialog(null, "Asistieron   " + "[" + practica.getContMujer() + "] " + "Mujeres");
        JOptionPane.showMessageDialog(null, "Promedio   " + "[" + practica.getPromHombre() + "] " + "Hombre");
        JOptionPane.showMessageDialog(null, "Promedio   " + "[" + practica.getPromMujer() + "] " + "Mujeres");

    }

}
