import java.util.ArrayList;
import java.util.List;

public class Ejemplo_List {

    public static void main(String[] args) {

        // 1. DECLARACIÓN
        // -------------------------------------------------
        List<String> mochila =new ArrayList<>();
        // 2. ASIGNAR VALORES (.add)
        // -------------------------------------------------
        mochila.add("TABLET");
        mochila.add("TAREA");
        mochila.add("CAFE");


        // 3. MOSTRAR TAMAÑO
        // -------------------------------------------------
        System.out.println("Elementos: " + mochila.size()); // .size()

        // 4. ELIMINAR VALORES (.remove)
        // -------------------------------------------------
        mochila.remove("TAREA");
        // 5. RECORRER
        // -------------------------------------------------
        for (String objeto : mochila) {
            System.out.println("- " + objeto);
        }
    }
}