package Practica.BusquedaSecuencial.Array;

import javax.swing.JOptionPane;

public class BusquedadSecuencialArray {

    private int arreglo[] = {12345, 12489, 21212};
    private int i = 0;
    private int numero;
    private boolean band = false;

    public void busquedaSecuencial() {

        arreglo[i] =numero= Integer.parseInt(JOptionPane.showInputDialog("Digite password"));

        while ((i < 3) && (band == false)) {

            if (arreglo[i] == numero) {

                band=true;
                
            }
            i++;

        }

    }

    public void validacionSecuencial(){
        
        if (band) {
            
            System.out.println("Contresena correcta");
        }else{
            
            System.out.println("contrasena incorrenta");
        }
        
        
    }
    
    public static void main(String[] args) {

        BusquedadSecuencialArray busquedadsecuencialarray=new BusquedadSecuencialArray();
        
        busquedadsecuencialarray.busquedaSecuencial();
        busquedadsecuencialarray.validacionSecuencial();
        
    }

}
