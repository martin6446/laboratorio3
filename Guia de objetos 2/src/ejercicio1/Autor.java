package ejercicio1;

public class Autor {
    private String nombre;
    private String apellido;
    private String email;
    private char genero;

    public Autor(String nombre, String apellido, String email, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.genero = genero;
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

    public char getGenero() {
        return genero;
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

    public void setGenero(char genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "\nnombre del autor: " + nombre +
                "\napellido del autor: " + apellido +
                "\nemail del autor: " + email +
                "\ngenero del autor: " + genero;
    }

    /*public void mostrarAutor() {
        System.out.println("nombre del autor: " + nombre);
        System.out.println("apellido del autor: " + apellido);
        System.out.println("email del autor: " + email);
        System.out.println("genero del autor: " + genero);
    }*/
}
