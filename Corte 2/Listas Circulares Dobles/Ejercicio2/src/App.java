import java.util.Scanner;

public class App {
    // 2. Historial de Comandos de Terminal
// Los terminales guardan un historial de comandos. Al presionar flecha arriba el usuario
//  retrocede al comando anterior; flecha abajo avanza al más reciente. El historial es circular:
//  después del más antiguo vuelve al más nuevo.

// La Clase Comando (Nodo): Debe contener texto (String), exitoso (boolean — si ejecutó sin 
// errores) y directorio (String — el path desde donde se ejecutó).
// El Problema: El historial mantiene un puntero cursor al comando que se está consultando. 
// Navegar con "arriba" mueve el cursor al anterior (anterior); "abajo" lo mueve al siguiente 
// (siguiente). El usuario puede eliminar el comando actual (para borrar contraseñas escritas 
// por error), y el cursor pasa automáticamente al siguiente.
// Reto: Implementa los métodos arriba(), abajo(), mostrarCursor() y eliminarActual(). Simula:
//  agrega 5 comandos, navega 3 veces hacia arriba, elimina el comando actual, navega una vez
//  hacia abajo y muestra el historial completo con el cursor marcado.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HistorialComandos  historial = new HistorialComandos();
        int opcion;
        do {
            System.out.println("\n==============================================");
            System.out.println("   Historial de comandos — Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Agregar Comando.");
            System.out.println("2. Mostrar Historial.");
            System.out.println("3. Mover cursor arriba.");
            System.out.println("4. Mover cursor abajo.");
            System.out.println("5. Eliminar comando actual.");
            System.out.println("0. Salir.");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Texto del comando: ");
                    String texto = sc.nextLine();
                    boolean ejecucion;
                    while (true) {
                        System.out.println("Exitoso (1-True/2-False): ");
                        int opcion2 = sc.nextInt();
                        if (opcion2 == 1) {
                            ejecucion = true;
                            break;
                        }
                        else if (opcion2 == 2) {
                            ejecucion = false;
                            break;
                        }
                        else{
                            System.out.println("Opcion invalida.");
                        }
                    }
                    System.out.print("Directorio(Path): ");
                    String path = sc.next();
                    System.out.println("");
                    historial.agregar(new Comando(texto, ejecucion, path));
                    System.out.println("Comando agregado exitosamente.");
                    break;

                case 2:
                    historial.mostrar_historial();
                    break;

                case 3:
                    historial.arriba();
                    break;

                case 4:
                    historial.abajo();
                    break;

                case 5:
                    historial.eliminar_Actual();
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        sc.close();
    }
}
