import Clases.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //EJERCICIO 1
        //trabajadores
        Arquitecto arquitecto = new Arquitecto("charly",12346579,4658795,135);
        MaestroMayorDeObra maestroMayorDeObra = new MaestroMayorDeObra("javier",34237627,657621681,38);
        Obrero obrero = new Obrero("alejandro",32546516,63687621,45);

        //empresa
        Empresa empresa = new Empresa("daylition");

        //obras
        ObrasDomesticas casa = new ObrasDomesticas("san martin 7655", 500, 30,600,5);
        Hotel hotel = new Hotel("santigo del estero 1564",800,60,120,"hotel ibetostar",50);
        Comercio comercio = new Comercio("santa fe 2579",80,35,85,"lo de carlitos","restaurant");

        //EJERCICIO 2
        //A
        System.out.println("EJERCICIO 2A");
        arquitecto.creaPlanos();
        maestroMayorDeObra.construir();
        obrero.construir();

        //B
        System.out.println("\n\nEJERCICIO 2B");
        empresa.agregarEmpleado(arquitecto);
        empresa.agregarEmpleado(maestroMayorDeObra);
        empresa.agregarEmpleado(obrero);
        empresa.agregarEmpleado(obrero);
        empresa.mostrarEmpleados();

        //C
        System.out.println("\n\nEJERCICIO 2C");
        System.out.println("OBRA DOMESTICA");
        casa.agregarEmpleado(arquitecto);
        casa.agregarEmpleado(maestroMayorDeObra);
        casa.agregarEmpleado(obrero);
        casa.agregarEmpleado(obrero);
        System.out.println(casa.toString());

        System.out.println("\n\nHOTEL");
        hotel.agregarEmpleado(arquitecto);
        hotel.agregarEmpleado(maestroMayorDeObra);
        hotel.agregarEmpleado(obrero);
        hotel.agregarEmpleado(obrero);
        System.out.println(hotel.toString());

        System.out.println("\n\nCOMERCIO");
        comercio.agregarEmpleado(arquitecto);
        comercio.agregarEmpleado(maestroMayorDeObra);
        comercio.agregarEmpleado(obrero);
        comercio.agregarEmpleado(obrero);
        System.out.println(comercio.toString());

        //D
        System.out.println("\n\nEJERCICIO 2D");
        empresa.agregarObra(casa);
        empresa.agregarObra(hotel);
        empresa.agregarObra(comercio);
        empresa.mostrarObras();

        //E este punto se demostro en el punto C pero muestro cuales son los metodos
        System.out.println("\n\nEJERCICIO 2E");
        casa.mostrarEmpleados();
        hotel.mostrarEmpleados();
        comercio.mostrarEmpleados();

        //F este punto se demostro en el punto D pero muestro cual es el metodo
        System.out.println("\n\nEJERCICIO 2F");
        empresa.mostrarObras();


    }
}
