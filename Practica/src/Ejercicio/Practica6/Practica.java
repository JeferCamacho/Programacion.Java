package Ejercicio.Practica6;

public class Practica {

    private int a;
    private int b;
    private int c;
    private int x;
    private int x1;
    private int x2;
    private int x3;
    private int x4;

    public Practica() {

    }


    public void setA(int a) {
        this.a = a;
    }


    public void setB(int b) {
        this.b = b;
    }


    public void setC(int c) {
        this.c = c;
    }

    public void setMultiplicar() {

        x = (b * b) - (4 * a * c);
        x1 = (2 * a);

    }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    
    public int getX3() {
        return x3;
    }

    public int getC() {
        return c;
    }
    public int getX4() {
        return x4;
    }

    public int getX1() {
        return x1;
    }
    

    public void setRaiz() {

        x2 = (int) Math.sqrt(x);

    }

    public void setMasMenos() {

        x3 = (b + x2);
        x4 = (b - x2);
    }
    

    public static void main(String[] args) {

        //////////////////////////////////EJERCICIO/////////////////////////
        /*Culcular las raices de una ecuacion de segundo grado (a 2 + bx + c =0 )*/
        //////////////////////////////////////////////////////////////////
        Practica ecuacion = new Practica();

        ecuacion.setA(1);
        ecuacion.setB(5);
        ecuacion.setC(6);

        ecuacion.setMultiplicar();
        ecuacion.setRaiz();
        ecuacion.setMasMenos();

        System.out.println("Fracion suma \n "+
                             +ecuacion.getX3()+"\n"+
                            "---"+"\n"+
                            " "+ecuacion.getX1());
        
        
        System.out.println("--------------------------------");
        
        System.out.println("Fracion resta \n "+
                             +ecuacion.getX4()+"\n"+
                            "---"+"\n"+
                            " "+ecuacion.getX1());

    }

}
