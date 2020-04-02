package com.company;
import java.util.Scanner;

class Cuenta_De_Banco {
    private static int identificador;
    private String nombre;
    private int balance;
    Scanner scanner = new Scanner(System.in);

    public Cuenta_De_Banco() {
        System.out.println("ingrese el nombre de la cuenta.");
        nombre = scanner.nextLine();
        System.out.println("ingrese su ID.");
        identificador = scanner.nextInt();
        System.out.println("ingrese el balance.");
        balance = scanner.nextInt();

    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getNombre() {
        return nombre;
    }
    public int getBalance() {
        return balance;
    }
    public int getIdentificador() {
        return identificador;
    }

    public void mostrarCuenta() {
        System.out.println("nombre: " + nombre);
        System.out.println("ID: " + identificador);
        System.out.println("balance: " + balance);
    }

    public int credito() {
        System.out.println("ingrese el monto deseado a depositar.");
        int monto = scanner.nextInt();
        return balance += monto;
    }

    public int debito() {
        System.out.println("ingrese el monto a sustraer.");
        int sustraccion = scanner.nextInt();
        if(sustraccion > balance)
        {
            System.out.println("no hay fondos suficientes.");
        } else {
            balance -= sustraccion;
        }
        return balance;
    }
}


public class ejercicio4 {
    public static void main (String[] args) {
        Cuenta_De_Banco martin, victoria, camila;

        martin = new Cuenta_De_Banco();


        martin.mostrarCuenta();
        martin.credito();
        martin.debito();
        martin.debito();
        martin.mostrarCuenta();



    }


}
