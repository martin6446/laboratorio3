package Clases;

public class Comercio extends ObrasComerciales{
    private String rubro;

    public Comercio(){}

    public Comercio(String direccion, int mestrosCuadrados, int tiempoEstimadoDeObra, int costoPorMetroCuadrado, String nombreDeLaObra, String rubro) {
        super(direccion,mestrosCuadrados,tiempoEstimadoDeObra,costoPorMetroCuadrado,nombreDeLaObra);
        this.rubro = rubro;
    }


    @Override
    public String toString() {
        return super.toString() +
                "\nrubro: " + rubro;
    }
}
