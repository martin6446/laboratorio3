package ejercicio2;
import java.util.UUID;

public class ItemVenta {

    private final String ID;
    private String nombre;
    private String descripcion;
    private float precionUnitario;

    public ItemVenta(String nombre, String descripcion, float precionUnitario) {
        ID = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precionUnitario = precionUnitario;
    }

    /*public void mostrarItem() {
        System.out.println("ID del item: " + ID);
        System.out.println("nombre del item: " + nombre);
        System.out.println("descripcion del item: " + descripcion);
        System.out.println("precio unitario del item: " + precionUnitario);
    }*/

    @Override
    public String toString() {
        return "\nID del item: " + ID +
                "\nnombre del item: " + nombre +
                "\ndescripcion del item: " + descripcion +
                "\nprecio unitario del item: " + precionUnitario;
    }


    public String getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public float getPrecionUnitario() {
        return precionUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
