package Clases;

public abstract class ObrasComerciales extends Obra{
    private String nombreDeLaObra;


    public ObrasComerciales(){}

    public ObrasComerciales(String direccion, int mestrosCuadrados, int tiempoEstimadoDeObra, int costoPorMetroCuadrado, String nombreDeLaObra) {
        super(direccion,mestrosCuadrados,tiempoEstimadoDeObra,costoPorMetroCuadrado);
        this.nombreDeLaObra = nombreDeLaObra;

    }


    @Override
    public String toString() {
        return super.toString() +
                "\nnombre de la obra: " + nombreDeLaObra;
    }
}
