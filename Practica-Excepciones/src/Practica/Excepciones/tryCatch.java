package Practica.Excepciones;

import javax.swing.JOptionPane;

public class tryCatch {


    /*
    
    //INTENTALO Y REALIZA UNA EXCEPCION
    
    Se realiza para poder manejar errores en el programa en parde la ejecucion del programa
    
    <Try> = Se utliza para  brever excepciones en el trascurso de la ejecucion de un programa
            es necesario ya que hay se coloca las instrucciones que se deben realizar pese a la 
            excepcion.
    
    <Catch> = Posteriormente se utliza   donde se especifica la excepcion que se 
            puede ocurrir 
    
    
    try{
    
    la excepcion del codigo
    
    }catch(){
    
    especificamos el tipo de excepcion puede ocurrrir
    
    }
    
    
    
     */
    private int numeros;

    public void tryCatch() {

        try {

            numeros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numeros"));

        } catch (Exception error) {

            //Muestra el tipo de error en cual puede ocurrir
            error.printStackTrace();

            System.out.println("Solo puede recibir numeros y datos alfanumericos");

        }

    }

    public static void main(String[] args) {

        tryCatch exception = new tryCatch();

        exception.tryCatch();

    }
}
