package Clases;

public class MaestroMayorDeObra extends Empleado implements Trabajar {

    private int edad;
    public MaestroMayorDeObra(){}

    public MaestroMayorDeObra(String nombre, int dni, int telefono, int edad) {
        super(nombre,dni,telefono,1500);
        this.edad = edad;
    }

    @Override
    public void construir() {
        System.out.println("Soy maestro y superviso las construcciones.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nedad: " + edad;
    }
}
