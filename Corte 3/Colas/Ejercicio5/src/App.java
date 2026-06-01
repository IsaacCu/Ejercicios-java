import java.util.Scanner;

public class App {
// 5. Fábrica de Pedidos (E-commerce)
// Una tienda en línea recibe pedidos de manera continua. Cada pedido ingresa a una cola central de procesamiento. El sistema de bodega toma los pedidos en orden de llegada para preparar el envío. Si un pedido ya fue cancelado por el cliente, debe ser descartado automáticamente al momento de ser procesado.

// La Clase Pedido (Nodo): Debe contener numeroPedido (String), cliente (String), totalPagar (double) y cancelado (boolean).
// El Problema: La bodega necesita procesar solo los pedidos vigentes. Los cancelados deben ser eliminados sin ser despachados, pero registrados en un conteo.
// Reto: Implementa un método procesarPedidos() que recorra y vacíe la cola. Para cada pedido: si cancelado = true, lo descarta e incrementa un contador de cancelados; si cancelado = false, lo "despacha" imprimiendo sus datos. Al finalizar, muestra el total despachado y el total cancelado.
    public static void main(String[] args) {
        ColaPedidos colaPedidos = new ColaPedidos();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        colaPedidos.enqueue(new Pedido("111", "Juan Perez", 23, true));

        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE GESTIÓN DE PEDIDOS (COLAS) ---");
            System.out.println("1. Ver Pedido en espera");
            System.out.println("2. Registrar nuevo Pedido (Enqueue)");
            System.out.println("3. Despachar Pedido (Dequeue)");
            System.out.println("4. Procesar Pedidos(Todos)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nEstado actual de la cola:");
                    colaPedidos.imprimir();
                    break;
                case 2:
                    System.out.print("Numero del pedido: "); String numero = scanner.nextLine();
                    System.out.print("Cliente: "); String cliente = scanner.nextLine();
                    System.out.print("Total a Pagar: "); double total = scanner.nextDouble();
                    boolean cancelado = true;
                    while (true) {
                        System.out.print("Cancelado?(1-SI/2-NO): "); int exento = scanner.nextInt();
                        if (exento == 1) {
                            cancelado = true;
                            break;
                        }
                        else if (exento == 2) {
                            cancelado = false;
                            break;
                        }
                        else{
                            System.out.println("Opcion invalida.");
                        }
                    }
                    scanner.nextLine(); // Limpiar buffer
                    colaPedidos.enqueue(new Pedido(numero,cliente,total,cancelado));
                    System.out.println("Pedido registrado correctamente.");
                    break;
                case 3:
                    System.out.println("-- Pedido Despachado --");
                    Pedido imprimir = colaPedidos.dequeue();
                    colaPedidos.ImprimirPaciente(imprimir);
                    break;
                case 4:
                    colaPedidos.procesarPedidos();
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
