package Clases;

public class ObrasDomesticas extends Obra{

    private int cantidadDeHabitaciones;

    public ObrasDomesticas(){}

    public  ObrasDomesticas(String direccion, int mestrosCuadrados, int tiempoEstimadoDeObra, int costoPorMetroCuadrado, int cantidadDeHabitaciones) {
        super(direccion,mestrosCuadrados,tiempoEstimadoDeObra,costoPorMetroCuadrado);
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    public int getCantidadDeHabitaciones() {
        return cantidadDeHabitaciones;
    }

    public void setCantidadDeHabitaciones(int cantidadDeHabitaciones) {
        this.cantidadDeHabitaciones = cantidadDeHabitaciones;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncantidad de habitaciones: " + cantidadDeHabitaciones;
    }
}
