package ejercicio3;

import java.util.UUID;

public class Cliente {
    private final String ID;
    private String nombre;
    private char genero;


    public Cliente(String nombre, char genero) {
        this.nombre = nombre;
        this.genero = genero;
        ID = UUID.randomUUID().toString();
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "ID del cliente: " + ID +
                "\nnombre del cliente: " + nombre +
                "\ngenero del cliente: " + genero;
    }
}
