import java.util.LinkedList;

public class Genero {

    private String tipo;
    LinkedList<Pelicula> peliculas;

    public Genero() {
        peliculas = null;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
