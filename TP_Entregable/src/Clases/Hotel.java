package Clases;

public class Hotel extends ObrasComerciales{
    private int cantidadDePisos;

    public Hotel(){}

    public Hotel(String direccion, int mestrosCuadrados, int tiempoEstimadoDeObra, int costoPorMetroCuadrado, String nombreDeLaObra, int cantidadDePisos) {
        super(direccion,mestrosCuadrados,tiempoEstimadoDeObra,costoPorMetroCuadrado,nombreDeLaObra);
        this.cantidadDePisos = cantidadDePisos;
    }

    public int getCantidadDePisos() {
        return cantidadDePisos;
    }

    public void setCantidadDePisos(int cantidadDePisos) {
        this.cantidadDePisos = cantidadDePisos;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncantidad de pisos: " + cantidadDePisos;
    }
}
