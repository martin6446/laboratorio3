package Clases;

public class Obrero extends Empleado implements Trabajar {

    private int edad;
    public Obrero(){}

    public Obrero(String nombre, int dni, int telefono, int edad) {
        super(nombre,dni,telefono,1800);
        this.edad = edad;
    }

    @Override
    public void construir() {
        System.out.println("Soy obrero y construyo.");
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nEdad: "+ edad;
    }

}
