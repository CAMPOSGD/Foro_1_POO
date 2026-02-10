import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class PooForo1 {
    public static void main() {

        Scanner teclado = new Scanner(System.in);
        Map<String, String> MapaAlumnosRegistro = new HashMap<>();

        ArrayList<String> SelectorMenu = new ArrayList<>();
        int opcion = 0;

        while (opcion != 5) {

            System.out.println("-----Universidad Don Bosco-----");
            System.out.println("-Almacenamiento de estudiantes-");
            System.out.println("--------------POO--------------");
            System.out.println("1.Registro de Alumnos");
            System.out.println("2.Busqueda de Alumnos");
            System.out.println("3.Eliminar Alumnos");
            System.out.println("4.Mostrar todos los Alumnos");
            System.out.println("5.Salir");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el Número de Carnet del alumno: ");
                    String CarnetId = teclado.nextLine();

                    System.out.println("Ingrese el nombre del alumno: ");
                    String NombreAlumno = teclado.nextLine();

                    MapaAlumnosRegistro.put(CarnetId, NombreAlumno);

                    System.out.println("¡Alumno ingresado éxitosamente!");

                    System.out.println("Presioná enter para regresar al menú...");
                    teclado.nextLine();
                    break;


                case 2:
                    System.out.println("Ingrese el número de carnet del alumno: ");
                    String carnetBuscar = teclado.nextLine();
                    if (MapaAlumnosRegistro.containsKey(carnetBuscar)){
                        System.out.println("Alumno encontrado...");
                        System.out.println("Nombre del alumno: "+MapaAlumnosRegistro.get(carnetBuscar));
                        System.out.println("Carnet: "+carnetBuscar);
                    }else{
                        System.out.println("Alumno no encontrado, no se puede mostrar...");
                    }
                    System.out.println("Presioná enter para regresar al menú...");
                    teclado.nextLine();
                    break;


                case 3:
                    System.out.println("Ingrese el número de carnet del alumno que desea eliminar: ");
                    String carnetEliminar = teclado.nextLine();

                    if (MapaAlumnosRegistro.containsKey(carnetEliminar)){
                        MapaAlumnosRegistro.remove(carnetEliminar);
                        System.out.println("El alumno ha sido eliminado correctamente...");
                    }else{
                        System.out.println("Alumno no encontrado, no se puede eliminar");
                    }
                    System.out.println("Presioná enter para regresar al menú...");
                    teclado.nextLine();
                    break;


                case 4:
                    System.out.println("Reporte de estudiantes:");

                    if (MapaAlumnosRegistro.isEmpty()) {
                        System.out.println("Aún no has registrado estudiantes o los eliminaste todos");

                        System.out.println("Presioná enter para regresar al menú...");
                        teclado.nextLine();

                    } else {
                        for (Map.Entry<String, String> registro : MapaAlumnosRegistro.entrySet()) {
                            System.out.println("Carnet: " + registro.getKey() + " | Nombre: " + registro.getValue());
                        }

                        System.out.println("Presioná enter para regresar al menú...");
                        teclado.nextLine();
                        break;

                    }
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
            }

        }
        teclado.close();
    }

}
