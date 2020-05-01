package Clases;

public class Arquitecto extends Empleado {
    private int matricula;

    public Arquitecto(){}

    public Arquitecto(String nombre, int dni, int telefono, int matricula) {
        super(nombre,dni,telefono,2000);
        this.matricula = matricula;
    }


    public void creaPlanos() {
        System.out.println("Creando mi proximo plano.");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nmatricula: " + matricula;
    }
}
