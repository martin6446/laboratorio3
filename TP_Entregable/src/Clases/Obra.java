package Clases;

import java.util.LinkedList;

public class Obra {
    private String direccion;
    private int mestrosCuadrados;
    private int tiempoEstimadoDeObra;
    private int costoPorMetroCuadrado;
    private LinkedList<Empleado> empleados = new LinkedList<>();

    public Obra(){}

    public Obra(String direccion, int mestrosCuadrados, int tiempoEstimadoDeObra, int costoPorMetroCuadrado) {
        this.direccion = direccion;
        this.mestrosCuadrados = mestrosCuadrados;
        this.tiempoEstimadoDeObra = tiempoEstimadoDeObra;
        this.costoPorMetroCuadrado = costoPorMetroCuadrado;
    }


    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.printf("\nLISTA DE EMPLEADOS DE LA OBRA: %s\n", this.getClass().getSimpleName().toUpperCase());
        for(Empleado e:empleados) {

            System.out.println(e);
            System.out.println("------------------");
        }
    }

    public boolean verificarEmpleados() {
        boolean isOk = true;

        if (cantidadDeArquitectos() != 1) {
            isOk = false;
            System.out.println("hay un problema con la cantidad de arquitectos");
        } else if (cantidadDeMaestrosDeObra() > 3 || cantidadDeMaestrosDeObra() == 0){
            isOk = false;
            System.out.println("hay un problema con la cantidad de maestros de obra");
        } else if (cantidadDeConstructores() < 2) {
            isOk = false;
            System.out.println("hay un problema con la cantidad de obreros");
        }

        return isOk;
    }

    private int cantidadDeArquitectos() {
        int cantidad = 0;
        for (Empleado e:empleados) {
            if (e instanceof Arquitecto) {
                cantidad++;
            }
        }
        return cantidad;
    }

    private int cantidadDeMaestrosDeObra() {
        int cantidad = 0;
        for (Empleado e:empleados) {
            if (e instanceof MaestroMayorDeObra) {
                cantidad++;
            }
        }
        return cantidad;
    }

    private int cantidadDeConstructores() {
        int cantidad = 0;
        for (Empleado e:empleados) {
            if (e instanceof Obrero) {
                cantidad++;
            }
        }
        return cantidad;
    }


    public String getDireccion() {
        return direccion;
    }

    public int getMestrosCuadrados() {
        return mestrosCuadrados;
    }

    public int getCostoPorMetroCuadrado() {
        return costoPorMetroCuadrado;
    }

    public int getTiempoEstimadoDeObra() {
        return tiempoEstimadoDeObra;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMestrosCuadrados(int cantidadDeCuadrados) {
        this.mestrosCuadrados = cantidadDeCuadrados;
    }

    public void setCostoPorMetroCuadrado(int costoPorMetroCuadrado) {
        this.costoPorMetroCuadrado = costoPorMetroCuadrado;
    }


    public void setTiempoEstimadoDeObra(int tiempoEstimadoDeObra) {
        this.tiempoEstimadoDeObra = tiempoEstimadoDeObra;
    }

    public int calcualarCostoDeEmpleados() {
        int result = 0;
        for(Empleado emp:empleados) {
            result += emp.getSalario();
        }
        return result;
    }

    public int calcularPrecioEstimado() {
        return verificarEmpleados() ? costoPorMetroCuadrado * mestrosCuadrados + calcualarCostoDeEmpleados() * tiempoEstimadoDeObra : 0;
    }



    @Override
    public String toString() {
        return "Direccion: " + direccion +
                "\ncantidad de cuadrados: " + mestrosCuadrados +
                "\ntiempo estimado en dias: " + tiempoEstimadoDeObra +
                "\ncosto por metro cuadrado: " + costoPorMetroCuadrado +
                "\ncosto por empleado: " + calcualarCostoDeEmpleados() +
                "\nprecio estimado total: " + calcularPrecioEstimado();
    }
}
