import java.util.ArrayList;
import java.util.List;

public class Ejemplo_List { //

    public static void main(String[] args) {

        //            . ¿Cómo se declaran?
        // 1. DECLARACIÓN E INSTANCIACIÓN (Crear la Lista)
        // -------------------------------------------------
        // Usamos la interfaz 'List' y la implementación 'ArrayList'
        List<String> mochila = new ArrayList<>();

        //      ¿Cómo se pueden asignar valores?
        // 2. ASIGNAR VALORES (Agregar con .add)
        // -------------------------------------------------
        mochila.add("Tablet"); // Índice 0
        mochila.add("Cuaderno de Apuntes"); // Índice 1
        mochila.add("Botella de Agua");    // Índice 2

        //   ¿Cómo se pueden eliminar valores?
        // 3. MOSTRAR TAMAÑO Y DATOS
        // -------------------------------------------------
        System.out.println("---- INVENTARIO INICIAL ----");
        // Usamos .size() en lugar de .length
        System.out.println("Elementos en la mochila: " + mochila.size());

        // Usamos .get(0) en lugar de [0]
        System.out.println("El primer objeto es: " + mochila.get(0));

        // -------------------------------------------------
        // 4. ELIMINAR VALORES (Con .remove)
        // -------------------------------------------------
        System.out.println("\n... Sacando el Cuaderno ...");
        mochila.remove("Cuaderno de Apuntes");

        // -------------------------------------------------
        // 5. RECORRER LA LISTA FINAL
        // -------------------------------------------------
        System.out.println("---- INVENTARIO ACTUALIZADO ----");
        for (String objeto : mochila) {
            System.out.println("- " + objeto);
        }
    }
}