package ejercicio2;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cliente {

    private final String ID;
    private String nombre;
    private String apellido;
    private String email;
    private int descuento;
    private List<ItemVenta> compras = new ArrayList<>();

    public Cliente(String nombre, String apellido, String email,int descuento) {
        ID = UUID.randomUUID().toString().replaceAll("-","");
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.descuento = descuento;

    }

    public void comprar(int cantidad, ItemVenta item) {
       for (int i = 0 ; i < cantidad; i++) {
           compras.add(item);
       }
    }

    //no creo conveniente usar el metodo override de toString en este caso
    public void mostrarCliente() {
        System.out.println("ID del cliente: " + ID);
        System.out.println("nombre y apellido del cliente: " + nombre + " " + apellido);
        System.out.println("email del cliente: " + email);
        System.out.println("descuento del cliente: " + descuento + "%");
        System.out.println("compras: ");
        if (!compras.isEmpty()) {
            for (ItemVenta items : compras) {
                System.out.println("---------------------");
                System.out.println(items.toString());
            }
        } else {
            System.out.println("no hay compras.");
        }
    }

    public List<ItemVenta> getCompras() {
        return compras;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public int getDescuento() {
        return descuento;
    }

    public String getID() {
        return ID;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

}
