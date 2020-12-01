package Ejercicio.Practica51;

public class Ejercicios51 {

    private double[] listNotas = new double[20];
    private int contadorAprovadas;
    private int contadorNoAprovado;

    public int getContadorAprovadas() {
        return contadorAprovadas;
    }

    public void setContadorAprovadas(int contadorAprovadas) {
        this.contadorAprovadas = contadorAprovadas;
    }

    public int getContadorNoAprovado() {
        return contadorNoAprovado;
    }

    public void setContadorNoAprovado(int contadorNoAprovado) {
        this.contadorNoAprovado = contadorNoAprovado;
    }

    public void ingresarNotas() {

        for (int i = 0; i < listNotas.length; i++) {

            listNotas[i] = (int) Math.round(Math.random() * 10.5);

        }

    }

    public void visualizarNotas() {

        for (int i = 0; i < listNotas.length; i++) {

            System.out.println("[" + (i + 1) + "]" + listNotas[i]);

        }
    }

    public void validarNotas() {

        for (int i = 0; i < listNotas.length; i++) {

            if (listNotas[i] > 80) {

                contadorAprovadas++;

            } else if (listNotas[i] < 80) {

                contadorNoAprovado++;

            }
        }

    }

    public static void main(String[] args) {

        Ejercicios51 listNumeros = new Ejercicios51();

        listNumeros.ingresarNotas();
        listNumeros.visualizarNotas();
        System.out.println(listNumeros.getContadorAprovadas());
        System.out.println(listNumeros.getContadorNoAprovado());
    }


    /*
    Ingresar una lista de 25 notas y determinar cuantas estas fueron aprovadas 
    
    
     */
}
