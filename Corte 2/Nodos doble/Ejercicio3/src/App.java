import java.util.Scanner;

public class App {
    // 3. Planificador de CPU (Algoritmo Round Robin) Los sistemas operativos usan el
    //  algoritmo Round Robin para repartir el tiempo del procesador entre varios procesos 
    // de forma justa: cada proceso recibe un pequeño intervalo de tiempo llamado quantum. 
    // Si no termina, espera su siguiente turno. La Clase Proceso (Nodo): Debe contener nombre 
    // (String), pid (int), tiempoRestante (int) y prioridad (int - del 1 al 3). El Problema: El 
    // planificador debe recorrer la lista circular en bucle. En cada turno, descuenta el quantum 
    // del tiempoRestante del proceso actual. Cuando tiempoRestante <= 0, el proceso termina y
    //  se elimina de la lista. Reto: Implementa el método ejecutar(int quantum) que simule el
    //  planificador. Imprime en cada turno cuál proceso se está ejecutando, cuánto tiempo le
    //  queda y si terminó. El ciclo debe terminar cuando la lista quede vacía. Al final, 
    // imprime el orden en que terminaron los procesos.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion;
        Planificador planificador = new Planificador();

        do {
            System.out.println("\n==============================================");
            System.out.println("        Planificador Round Robin");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar Proceso");
            System.out.println("  [2] Ejecutar");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre:");
                    String nombre = sc.next();

                    System.out.println("Ingrese PID:");
                    int pid = sc.nextInt();

                    System.out.println("Ingrese tiempo restante:");
                    int tiempo = sc.nextInt();

                    System.out.println("Ingrese prioridad (1-3):");
                    int prioridad = sc.nextInt();

                    Proceso nuevo = new Proceso(nombre, pid, tiempo, prioridad);
                    planificador.agregar(nuevo);
                    break;

                case 2:
                    System.out.println("Ingrese quantum:");
                    int quantum = sc.nextInt();
                    planificador.ejecutar(quantum);
                    break;

                case 0:
                    System.out.println("Cerrando programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}