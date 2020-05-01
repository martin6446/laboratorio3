package Clases;

import java.util.LinkedList;

public class Empresa {
    private String nombre;
    private LinkedList<Empleado> empleados = new LinkedList<>();
    private LinkedList<Obra> obrasRealizadas = new LinkedList<>();

    public Empresa(){}

    public Empresa(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void agregarObra(Obra obra) {
        obrasRealizadas.add(obra);
    }


    public void mostrarEmpleados() {
        System.out.printf("LISTA DE EMPLEADOS DE LA EMPRESA: %s\n", this.nombre.toUpperCase());
        for(Empleado e:empleados) {
            System.out.println(e);
            System.out.println("---------------------");
        }
    }

    public void mostrarObras() {
        System.out.printf("LISTA DE OBRAS DE LA EMPRESA: %s\n", this.nombre.toUpperCase());
        for (Obra o:obrasRealizadas) {
            System.out.println(o);
            System.out.println("----------------------");
        }
    }

}
