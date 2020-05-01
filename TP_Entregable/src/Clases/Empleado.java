package Clases;

public class Empleado {
    private String nombre;
    private int dni;
    private int telefono;
    private int salario;

    public Empleado(){}

    public Empleado(String nombre, int dni, int telefono, int salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre +
                "\ndni: " + dni +
                "\ntelefono: " + telefono +
                "\nsalario: " + salario;
    }

}
