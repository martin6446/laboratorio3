package ejercicio2;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.time.LocalDate;
import java.util.List;
public class Factura {

    private final String ID;
    private float montoTotal;
    private String fecha;
    private String hora;
    private Cliente cliente;


    public Factura(Cliente cliente) {
        this.cliente = cliente;
        ID = UUID.randomUUID().toString();
        fecha = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        hora = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        montoTotal = calcularMontoTotal();
    }

    public float calcularMontoTotal() {
        float total = 0.0f;
        if (!cliente.getCompras().isEmpty()) {
            for (ItemVenta items : cliente.getCompras()) {
                total += items.getPrecionUnitario();
            }
        }
        return total;
    }

    public void actualizarFactura() {
        montoTotal = calcularMontoTotal();
    }

    public float calcularDescuento() {
        return montoTotal - (montoTotal * (cliente.getDescuento() / 100.f));
    }

    //tampocpo creo que conviene aca usar override
    public void mostrarFactura() {
        System.out.println("FACTURA:");
        System.out.println("ID de la factura: " + ID);
        System.out.println("fecha de emision: " + fecha);
        System.out.println("hora de emision: " + hora);
        System.out.println("monto total de la compra: " + montoTotal);
        System.out.println("monto total luego del descuento: " + calcularDescuento());
        System.out.println("------------------------------");
        System.out.println("CLIENTE: ");
        cliente.mostrarCliente();

    }


}
