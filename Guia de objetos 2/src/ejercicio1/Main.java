package ejercicio1;

import ejercicio1.Autor;
import ejercicio1.Libro;

public class Main {
    public static void main (String[] args) {
        Autor autor = new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
        Autor autor2 = new Autor("Martin", "Caminero", "martincaminero64@gmail.com", 'M');
        Autor autor3 = new Autor("Victoria", "Caminero", "vickycaminero@gmail.com", 'F');
        Libro libro = new Libro("Effective Java", 450,150, autor);

        System.out.println(autor.toString());
        System.out.println("///////////////////////////");
        System.out.println("///////////////////////////");
        System.out.println(libro.toString());

        libro.setPrecio(500);
        libro.setStock(libro.getStock() + 50);
        libro.setAutor(autor2);
        libro.setAutor(autor3);
        System.out.println("///////////////////////////");
        System.out.println("///////////////////////////");
        System.out.println(libro.toString());
        System.out.println("///////////////////////////");
        System.out.println("///////////////////////////");
        for (int i = 0; i < libro.getAutores().size(); i++) {
            System.out.println(libro.getAutores().get(i).getNombre());
            System.out.println(libro.getAutores().get(i).getApellido());
            System.out.println(libro.getAutores().get(i).getEmail());
            System.out.println(libro.getAutores().get(i).getGenero());
        }

        libro.mensaje();




    }
}