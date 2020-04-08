package ejercicio3;

import java.util.UUID;

public class Deudor extends Cuenta {
    private final String ID;

    public Deudor(Cliente cliente, float balance) {
        super(cliente,balance);
        this.ID = UUID.randomUUID().toString();
    }

    @Override
    public void extraer(float cantidad) {
        if (getBalance() - cantidad >= -2000) {
            setBalance(getBalance() - cantidad);
        } else {
            System.out.println("error en la operacion. Saldo insuficiente.\n");
        }
    }
}
