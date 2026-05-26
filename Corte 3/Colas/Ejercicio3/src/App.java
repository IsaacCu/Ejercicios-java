import java.util.Scanner;

public class App {
// 3. Impresora Compartida (Red de Oficina)
// En una oficina de arquitectura, varias computadoras comparten una única impresora de gran formato. Cada vez que alguien envía un documento, este se agrega al final de la cola de impresión. La impresora procesa los trabajos en el orden exacto en que fueron recibidos.

// La Clase Documento (Nodo): Debe contener nombreArchivo (String), usuario (String), numeroPaginas (int) y esColor (boolean).
// El Problema: Antes de imprimir, el jefe de oficina quiere saber cuántas páginas en total tiene la cola de impresión pendiente.
// Reto: Implementa un método calcularPaginasTotales() que recorra la cola y retorne la suma de numeroPaginas de todos los documentos en espera, sin alterar la cola.
    public static void main(String[] args) {
        ColaDocumentos colaDocumentos = new ColaDocumentos();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        colaDocumentos.enqueue(new Documento("pepe", "Juan Perez", 23, true));

        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE GESTIÓN DE IMPRESION (COLAS) ---");
            System.out.println("1. Ver documentos en espera");
            System.out.println("2. Registrar nuevo documento (Enqueue)");
            System.out.println("3. Imprimir documento (Dequeue)");
            System.out.println("4. Total de paginas en cola.4");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nEstado actual de la cola:");
                    colaDocumentos.imprimir();
                    break;
                case 2:
                    System.out.print("Nombre Archivo: "); String nombreArchivo = scanner.nextLine();
                    System.out.print("Usuario: "); String usuario = scanner.nextLine();
                    System.out.print("Numero de paginas: "); int paginas = scanner.nextInt();
                    boolean esColor = true;
                    while (true) {
                        System.out.print("Es a color(1-SI/2-NO): "); int color = scanner.nextInt();
                        if (color == 1) {
                            esColor = true;
                            break;
                        }
                        else if (color == 2) {
                            esColor = false;
                            break;
                        }
                        else{
                            System.out.println("Opcion invalida.");
                        }
                    }
                    scanner.nextLine(); // Limpiar buffer
                    colaDocumentos.enqueue(new Documento(nombreArchivo, usuario, paginas, esColor));
                    System.out.println("Documento registrado correctamente.");
                    break;
                case 3:
                    System.out.println("-- Documento Impreso --");
                    Documento imprimir = colaDocumentos.dequeue();
                    colaDocumentos.ImprimirDocumentos(imprimir);
                    break;
                case 4:
                    System.out.println("Total de Paginas en cola: "+colaDocumentos.TotalPaginas());
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
