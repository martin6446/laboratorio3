package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("martin","caminero", "martincaminero64@gmail.com", 25);
        Factura factura = new Factura(cliente);
        ItemVenta item = new ItemVenta("manzana", "roja y dulce", 25.0f);
        ItemVenta item2 = new ItemVenta("banana", "amarilla y pastosa", 15.50f);

        factura.mostrarFactura();

        cliente.comprar(3,item);
        cliente.comprar(4,item2);

        factura.actualizarFactura();
        factura.mostrarFactura();

    }
}