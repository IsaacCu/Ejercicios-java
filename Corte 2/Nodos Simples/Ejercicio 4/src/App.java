import java.util.Scanner;

public class App {
// 4. Monitoreo Industrial (Sensores en Tiempo Real)
// Una planta química registra lecturas de sus tanques cada hora en una lista enlazada para auditoría.

// La Clase Lectura (Nodo): Debe contener idSensor (int), temperatura (double), presion (double) 
// y hora (String).
// El Problema: Las lecturas se van agregando al inicio para que la más reciente sea siempre la 
// primera que vea el supervisor.
// Reto: Implementa un método que busque y muestre la lectura con la temperatura más alta registrada 
// en el historial.
    public static void main(String[] args){

        int opcion;
        Historial historial = new Historial();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("========================================");
            System.out.println("========== Menu de Opciones ============");
            System.out.println("========================================");
            System.out.println("1- Agregar lectura.");
            System.out.println("2- Buscar la lectura mas alta.");
            System.out.println("3- Salir.");
            System.out.println("========================================");
            System.out.println("Opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    int idSensor;
                    double temperatura;
                    double presion;
                    String hora;
                    System.out.println("Ingreseel Id del sensor: ");
                    idSensor = sc.nextInt();
                    System.out.println("Ingrese la temperatura:");
                    temperatura = sc.nextDouble();
                    System.out.println("Ingrese la presion: ");
                    presion = sc.nextDouble();
                    System.out.println("Ingrese la hora: ");
                    hora = sc.next();
                    Lectura nuevalectura = new Lectura(idSensor, temperatura, presion, hora);
                    historial.agregar_lectura(nuevalectura);
                    break;
                case 2:
                    historial.buscarMayorLectura();
                    break;
                default:
                    System.out.println("Opcion invalida, elija otra opcion.");
                    break;
            }
        } while (opcion != 3);
        sc.close();
    }
}
