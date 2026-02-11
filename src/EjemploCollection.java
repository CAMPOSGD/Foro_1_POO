import java.util.Collection;
import java.util.HashSet;

class EjemploCollection {
    static void main() {

        // 1. DECLARACIÓN
        // Creamos una colección de enteros. HashSet no permite duplicados.
        Collection<Integer> numeros = new HashSet<>();

        // 2. ASIGNACIÓN DE VALORES (Añadir)
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(10); // Intentamos añadir un duplicado

        System.out.println("Colección tras añadir valores: " + numeros);
        // Nota: Solo verás [20, 10, 30] (el orden puede variar y el 10 no se repite)

        // 3. ELIMINACIÓN DE VALORES

        // Eliminar un valor específico
        numeros.remove(20);
        System.out.println("Tras eliminar el 20: " + numeros);

        // Eliminar usando una condición (Borrar todos los mayores a 25)
        numeros.removeIf(n -> n > 25);
        System.out.println("Tras eliminar mayores a 25: " + numeros);

        // Vaciar la colección por completo
        numeros.clear();
        System.out.println("¿Está vacía la colección?: " + true);
    }
}