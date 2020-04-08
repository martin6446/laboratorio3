package ejercicio3;

import java.io.File;

public class Main {
    public static void main(String[] args) {


        Cliente cliente = new Cliente("martin", 'M');
        System.out.println(cliente.toString());
        Deudor deudor = new Deudor(cliente,2000);


        System.out.println("");
        Cuenta cuenta = new Cuenta(cliente,10_000.0f);
        System.out.println(cuenta.toString());
        System.out.println("\nDEPOSITO DE 25000\n");
        cuenta.depositar(25_000.0f);
        System.out.println(cuenta.toString());
        System.out.println("\nEXTRACCION DE 40_000\n");
        cuenta.extraer(40_000.0f);
        System.out.println(cuenta.toString());
        System.out.println("\nSUBCLASE DEUDORA\n");
        deudor.extraer(4001.0f);
        System.out.println(deudor.toString());


    }
}