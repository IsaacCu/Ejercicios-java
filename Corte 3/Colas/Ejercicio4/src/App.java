import java.util.Scanner;

public class App {
// 4. Peaje Inteligente (Control de Tráfico)
// En una autopista de peaje, los vehículos ingresan a un carril y avanzan en fila hasta la cabina de cobro. El sistema registra automáticamente cada vehículo al entrar al carril. El cajero cobra en el orden estricto de llegada.

// La Clase Vehiculo (Nodo): Debe contener placa (String), tipoVehiculo (String), tarifa (double) y esExento (boolean).
// El Problema: Al cerrar el turno, el sistema debe calcular el total recaudado, ignorando los vehículos exentos de pago.
// Reto: Implementa un método cerrarTurno() que extraiga (dequeue) todos los vehículos de la cola, acumule la tarifa solo de los que tengan esExento = false e imprima el total recaudado al finalizar.
    public static void main(String[] args) {
        ColaVehiculos colaVehiculos = new ColaVehiculos();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        colaVehiculos.enqueue(new Vehiculo("111", "Juan Perez", 23, true));

        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE GESTIÓN DE VEHICULOS (COLAS) ---");
            System.out.println("1. Ver vehiculos en espera");
            System.out.println("2. Registrar nuevo vehiculo (Enqueue)");
            System.out.println("3. Atender vehiculo (Dequeue)");
            System.out.println("4. Cerrar Turno(Tarifa recolectada)");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nEstado actual de la cola:");
                    colaVehiculos.imprimir();
                    break;
                case 2:
                    System.out.print("Placa: "); String placa = scanner.nextLine();
                    System.out.print("Tipo Vehiculo: "); String tipoVehiculo = scanner.nextLine();
                    System.out.print("Tarifa: "); double tarifa = scanner.nextDouble();
                    boolean esExento = true;
                    while (true) {
                        System.out.print("Es Exento(1-SI/2-NO): "); int exento = scanner.nextInt();
                        if (exento == 1) {
                            esExento = true;
                            break;
                        }
                        else if (exento == 2) {
                            esExento = false;
                            break;
                        }
                        else{
                            System.out.println("Opcion invalida.");
                        }
                    }
                    scanner.nextLine(); // Limpiar buffer
                    colaVehiculos.enqueue(new Vehiculo(placa,tipoVehiculo,tarifa,esExento));
                    System.out.println("Vehiculo registrado correctamente.");
                    break;
                case 3:
                    System.out.println("-- Vehiculo atendido --");
                    Vehiculo imprimir = colaVehiculos.dequeue();
                    colaVehiculos.ImprimirPaciente(imprimir);
                    break;
                case 4:
                    colaVehiculos.CerrarTurnos();
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
