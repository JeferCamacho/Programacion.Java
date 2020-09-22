package Practica.DownCasting.UpCasting;

public class MainCasting {

    public static void main(String[] args) {

        Empleado empleado = new Cocinero(); //Instacia del objeto explicito

        empleado.mensajeEmpleado();
        empleado.informacionGenetica();

        //Casting explicito para poder accerder a los mismos metodos de su clase
        Cocinero emp = (Cocinero) empleado;

        emp.MensajeCocinero();

        System.out.println("   ");

        //////////////////////////////////////////////////////////////////////////////////
        Empleado empleado1 = new Mesero();//Instancia del objeto explicito

        ////////////////////////////////////////////////////////////////////////////////
        empleado.mensajeEmpleado();
        empleado.informacionGenetica();

        //Casting explicito para poder accerder a los mismos metodos de su clase
        Mesero emp1 = (Mesero) empleado1;

        emp1.mensajeMesero();

        ////////////////////////////////////////////////////////////////////////////
    }

}
