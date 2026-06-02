import java.util.Scanner;
// 3. Sistema de Nómina (Recursos Humanos)
// Una empresa de logística administra a sus empleados en un BST organizado por número de cédula. El área de RRHH consulta frecuentemente el empleado con el menor y el mayor número de cédula para procesar los extremos de la nómina. También necesita conocer la altura del árbol para auditar si la estructura sigue siendo eficiente después de muchas incorporaciones.

// La Clase Empleado (Nodo): Debe contener cedula (long, clave del BST), nombreCompleto (String), cargo (String) y salario (double).
// El Problema: El sistema debe poder ubicar al empleado con la cédula más baja (el más antiguo en el registro) y al de cédula más alta (el más reciente), y también reportar la altura actual del árbol para verificar que las búsquedas siguen siendo eficientes.
// Reto: Implementa buscarMinimo() y buscarMaximo(), que recorran el BST siguiendo siempre el subárbol izquierdo o derecho respectivamente hasta llegar a una hoja e impriman los datos del empleado encontrado. Implementa también reporteEficiencia() que imprima la altura actual del árbol y el número total de hojas (contarHojas()).

public class App {

    public static void main(String[] args) {

        ArbolEmpleados arbol = new ArbolEmpleados();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        arbol.insertar(10852341, "Carlos Ramirez", "Supervisor", 3200000);
        arbol.insertar(10987452, "Ana Torres", "Auxiliar", 1800000);
        arbol.insertar(10234567, "Luis Perez", "Conductor", 2200000);
        arbol.insertar(11567890, "Maria Gomez", "Coordinadora", 3800000);
        arbol.insertar(10111213, "Jorge Martinez", "Analista", 2600000);

        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE NÓMINA (BST) ---");
            System.out.println("1. Buscar empleado con menor cédula");
            System.out.println("2. Buscar empleado con mayor cédula");
            System.out.println("3. Registrar empleado");
            System.out.println("4. Reporte de eficiencia");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    arbol.buscarMinimo();
                    break;

                case 2:
                    arbol.buscarMaximo();
                    break;

                case 3:
                    System.out.print("Cédula: ");
                    long cedula = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Nombre completo: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Cargo: ");
                    String cargo = scanner.nextLine();

                    System.out.print("Salario: ");
                    double salario = scanner.nextDouble();
                    scanner.nextLine();

                    arbol.insertar(cedula, nombre, cargo, salario);
                    System.out.println("Empleado registrado correctamente.");
                    break;

                case 4:
                    arbol.reporteEficiencia();
                    break;

                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}