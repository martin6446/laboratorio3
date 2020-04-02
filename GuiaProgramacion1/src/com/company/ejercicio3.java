package com.company;
import java.util.Scanner;


class Item_De_Venta {
    private int identificador;
    private String descripcion;
    private int cantidad;
    private int precio_unitario;
    Scanner scanner = new Scanner(System.in);


    public Item_De_Venta() {
        System.out.println("ingrese el ID del Item.");
        identificador = scanner.nextInt();
        System.out.println("ingrese la cantidad de elementos que hay del Item.");
        cantidad = scanner.nextInt();
        //scanner.nextLine();//es para hacer un salto de renglon
        System.out.println("ingrese una brebe descripcion del Item.");
        descripcion = scanner.next().concat(scanner.nextLine());
        System.out.println("ingrese el precio unitario del Item.");
        precio_unitario = scanner.nextInt();
    }
    public int calcularPrecioTotal() {
        return precio_unitario * cantidad;
    }

    public void mostrarItemDeVenta() {
        System.out.println("ID del Item: " + identificador);
        System.out.println("Descripcion del Item: " + descripcion);
        System.out.println("Cantidad de Items: " + cantidad);
        System.out.println("Precio Unitario: " + precio_unitario);
        System.out.println("Precio Total: " + calcularPrecioTotal());
    }

}

public class ejercicio3 {

    public static void main(String[] args) {
        Item_De_Venta manzana = new Item_De_Venta();

        manzana.mostrarItemDeVenta();
    }


}
