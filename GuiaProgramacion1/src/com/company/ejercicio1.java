package com.company;
import java.util.Scanner;

class Rectangulo {
    private
    float ancho = 1.0f;
    float alto = 1.0f;

    public
    Rectangulo(){}
    Rectangulo(float alto, float ancho){
        this.alto = alto;
        this.ancho = ancho;
    }
    void settAncho(float ancho) {
        this.ancho = ancho;
    }
    void settAlto(float alto) {
        this.alto = alto;
    }
    float getAncho() {
        return this.ancho;
    }
    float getAlto() {
        return this.alto;
    }

    float calcularArea() {
        return alto * ancho;
    }
    float calcularPerimetro() {
        return 2 * alto + 2 * ancho;
    }

}



class Scratch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float alto;
        float ancho;

        System.out.println("ingrese el alto y el ancho del rectangulo.");
        System.out.print("alto: ");
        alto = scanner.nextFloat();
        System.out.print("\nancho: ");
        ancho = scanner.nextFloat();



        Rectangulo recti = new Rectangulo(alto,ancho);
        System.out.println("alto del rectangulo: " + recti.getAlto() + "\nancho del rectangulo: " + recti.getAncho());
        System.out.println("area del rectangulo: " + recti.calcularArea() + "\nperimetro del rectangulo: " + recti.calcularPerimetro());
        System.out.println("ingrese las nuevas medidas del rectangulo.");
        System.out.print("alto: ");
        recti.settAlto(scanner.nextFloat());
        System.out.print("\nancho: ");
        recti.settAncho(scanner.nextFloat());
        System.out.println("rectangulo modificado.");
        System.out.println("alto del rectangulo: " + recti.getAlto() + "\nancho del rectangulo: " + recti.getAncho());
        System.out.println("area del rectangulo: " + recti.calcularArea() + "\nperimetro del rectangulo: " + recti.calcularPerimetro());
        System.out.println("nuevo rectangulo inicializado con parametros por defecto.");
        Rectangulo recti2 = new Rectangulo();
        System.out.println("alto del rectangulo: " + recti2.getAlto() + "\nancho del rectangulo: " + recti2.getAncho());
        System.out.println("area del rectangulo: " + recti2.calcularArea() + "\nperimetro del rectangulo: " + recti2.calcularPerimetro());


    }
}