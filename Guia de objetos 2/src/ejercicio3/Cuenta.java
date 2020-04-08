package ejercicio3;


import java.util.UUID;

public class Cuenta {

    private final String ID;
    private float balance;
    private Cliente cliente;

    public Cuenta(Cliente cliente, float balance) {
        this.cliente = cliente;
        this.balance = balance;
        ID = UUID.randomUUID().toString();
    }


    public String getID() {
        return ID;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void extraer(float cantidad) {
        if (balance < cantidad) {
            System.out.println("error en la operacion. Saldo insuficiente.\n");
        } else {
            balance -= cantidad;
        }
    }

    public void depositar(float cantidad) {
        balance += cantidad;
    }

    @Override
    public String toString() {
        return "ID de la cuenta: " + ID +
                "\nbalance de la cuenta: " + balance +
                "\ncliente: \n" +
                cliente.toString();
    }

}
