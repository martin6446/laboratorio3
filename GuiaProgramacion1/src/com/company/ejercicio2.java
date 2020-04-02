package com.company;
import java.util.Scanner;

class Empleado {
    private int DNI;
    private String nombre;
    private String apellido;
    private int salario;

    public Empleado(String nombre, String apellido, int DNI, int salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.salario = salario;
    }
    public int calcularSalarioAnual() {
        return salario * 12;
    }

    public void aumentarSalario(float porcentaje) {
        salario += salario * (porcentaje / 100);
    }

    public void mostrarEmpleado() {
        System.out.println("nombre y apellido del empleado: " + nombre + " " + apellido);
        System.out.println("DNI del empleado: " + DNI);
        System.out.println("salario del empleado: " + salario);
        System.out.println("salario anual del empleado: " + calcularSalarioAnual());
    }

}

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Empleado carlos = new Empleado("Carlos", "Gutierrez", 23456345, 25_000);
        Empleado ana = new Empleado("Ana", "Sanchez", 34234123, 27_500);

        carlos.mostrarEmpleado();
        ana.mostrarEmpleado();

        System.out.println("\naumentamos el salario de carlos un 15%.");
        carlos.aumentarSalario(15);
        carlos.mostrarEmpleado();



    }


}
