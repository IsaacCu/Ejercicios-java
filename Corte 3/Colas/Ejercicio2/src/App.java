import java.util.Scanner;

public class App {
//     2. Urgencias Hospitalarias (Triaje)
// En la sala de urgencias de un hospital, los pacientes que llegan son registrados y colocados en una fila de atención. Dado el volumen de pacientes, el médico de guardia atiende en estricto orden de llegada. Al momento de llamar a un paciente, el sistema debe mostrar su información completa.

// La Clase Paciente (Nodo): Debe contener cedula (String), nombreCompleto (String), edad (int) y sintomaPrincipal (String).
// El Problema: Al finalizar el turno, el hospital necesita un reporte del total de pacientes atendidos y la lista completa en orden de atención.
// Reto: Implementa un método atenderTodos() que extraiga (dequeue) a cada paciente uno a uno, imprima su información al momento de ser atendido e imprima al final el total de pacientes procesados.
    public static void main(String[] args) {
        ColaPacientes colaPacientes = new ColaPacientes();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        colaPacientes.enqueue(new Paciente("111", "Juan Perez", 23, "Anemia"));
        colaPacientes.enqueue(new Paciente("222", "Pedrito Perez", 23, "Tos"));
        colaPacientes.enqueue(new Paciente("333", "Pepe Guazman", 23, "Pulmonia"));
        colaPacientes.enqueue(new Paciente("444", "Felipe Alvernia", 23, "Gastritis"));

        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE GESTIÓN DE PASIENTES (COLAS) ---");
            System.out.println("1. Ver pacientes en espera");
            System.out.println("2. Registrar nuevo paciente (Enqueue)");
            System.out.println("3. Atender Paciente (Dequeue)");
            System.out.println("4. Atender todos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\nEstado actual de la cola:");
                    colaPacientes.imprimir();
                    break;
                case 2:
                    System.out.print("Cedula: "); String cedula = scanner.nextLine();
                    System.out.print("Nombre Completo: "); String nombre = scanner.nextLine();
                    System.out.print("Edad: "); int edad = scanner.nextInt();
                    System.out.print("Sintoma Principal: "); String sintoma = scanner.nextLine();
                    scanner.nextLine(); // Limpiar buffer
                    colaPacientes.enqueue(new Paciente(cedula, nombre, edad, sintoma));
                    System.out.println("Paciente registrado correctamente.");
                    break;
                case 3:
                    System.out.println("-- Paciente atendido --");
                    Paciente imprimir = colaPacientes.dequeue();
                    colaPacientes.ImprimirPaciente(imprimir);
                    break;
                case 4:
                    colaPacientes.AtenderTodos();
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
