package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Libro {

    private String titulo;
    private int precio;
    private int stock;
    private List<Autor> autores = new ArrayList<Autor>();

    public Libro (String titulo, int precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        autores.add(autor);

    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setAutor(Autor autor) {
        this.autores.add(autor);
    }

    public void mostrarLibro() {
        System.out.println("Titulo del libro: " + titulo);
        System.out.println("Precio del libro: " + precio);
        System.out.println("Stock del libro: " + stock);
        System.out.println("");
        System.out.println("Autor/es del libro: ");
        for (Autor autor : autores) {
            System.out.println("------------------------");
            System.out.println(autor.toString());
        }
    }

    //no me gusta la idea de usar override para este caso
    @Override
    public String toString() {
        return "Titulo del libro: " + titulo +
                "\nPrecio del libro: " + precio +
                "\nStock del libro: " + stock +
                "\n" +
                "\nAutores del libro: \n" +
                autores.toString();
    }


    public void mensaje() {
        String autores = new String("");
        for (Autor autor : this.autores) {
            autores = autores.concat(", ").concat(autor.getNombre().concat(" ").concat(autor.getApellido()));
        }
        System.out.println("El libro, " + titulo + " de" + autores + ". Se vende a " + precio + " pesos.");
    }


}
