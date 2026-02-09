import java.util.ArrayList;

public class EjemploArray {
    public static void main(String[] args) {

        ArrayList<String> listaPersona = new ArrayList<>();

        // Agregando elementos de forma secuencial
        listaPersona.add("Marie Curie");
        listaPersona.add("Benjamin Franklin");
        listaPersona.add("Marco Antonio");
        listaPersona.add("Gabriel Campos");

        // USO DE MÉTODOS ESPECÍFICOS: Insertar en una posición exacta
        // Esto NO se puede hacer si la variable fuera de tipo Collection
        listaPersona.add(1, "Juan Murillo");

        System.out.println("USO DE ARRAYLIST");
        System.out.println("Contenido de listaPers: " + listaPersona.toString() + "\n");

        // Obtener la posición de un elemento
        int pos = listaPersona.indexOf("Gabriel Campos");
        System.out.println("está en la posición: " + pos);
    }
}


/*
public class EjemploCollection {
    public static void main(String[] args) {

        Collection<String> listaMarcasCoches = new ArrayList<>();

        listaMarcasCoches.add("Audi");
        listaMarcasCoches.add("Porsche");
        listaMarcasCoches.add("Aston Martin");
        listaMarcasCoches.add("Ferrari");
        listaMarcasCoches.add("Mercedes");
        listaMarcasCoches.add("Seat");

        System.out.println("Número elementos antes de eliminar: " + listaMarcasCoches.size());
        System.out.println("Elementos: " + listaMarcasCoches.toString());

        // Removiendo elemento por nombre
        listaMarcasCoches.remove("Seat");

        System.out.println("Elementos después de eliminar: " + listaMarcasCoches);
    }
}

*/

