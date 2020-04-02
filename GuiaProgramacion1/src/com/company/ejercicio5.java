package com.company;
import java.text.SimpleDateFormat;

class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public void setHoras(int horas) {
        if (horas >= 0 && horas < 23) {
            this.horas = horas;
        }
    }

    public void setMinutos( int minutos) {
        if (minutos >= 0 && minutos < 60) {
            this.minutos = minutos;
        }
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos < 60) {
            this.segundos = segundos;
        }
    }

    public void actualizar() {
        if(segundos > 59) {
            segundos = 0;
            minutos++;
        }
        if(minutos > 59) {
            minutos = 0;
            horas++;
        }
        if(horas > 23) {
            horas = 0;

        }
    }


    public void mostrarHora() {
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }

    public Hora avanzar1Segundo() {
        segundos ++;
        actualizar();
        return this;
    }

    public Hora retroceder1Segundo() {
        segundos --;
        actualizar();
        return this;
    }



}



public class ejercicio5 {

    public static void main(String[] args) {
        Hora reloj = new Hora();


        reloj.setHoras(12);
        reloj.setMinutos(59);
        reloj.setSegundos(59);
        reloj.mostrarHora();

        reloj = reloj.avanzar1Segundo();
        reloj.mostrarHora();

       
    }
}
