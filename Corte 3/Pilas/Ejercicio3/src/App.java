import java.util.Scanner;

public class App {
//     3. Logística de Distribución (Callejón sin Salida)
// Un centro de logística urbana tiene un muelle de carga ubicado al final de un callejón muy estrecho. Los camiones de reparto entran uno tras otro y quedan "atrapados" en el orden de llegada. El último camión en entrar debe ser obligatoriamente el primero en salir para permitir que los demás se retiren.

// La Clase Camion (Nodo): Debe contener placa (String), conductor (String) y cargaToneladas (double).
// El Problema: El supervisor necesita saber cuánta carga total hay en el callejón sin mover los camiones físicamente (solo consultando la estructura).
// Reto: Implementa un método que recorra la pila (sin destruirla permanentemente, o reconstruyéndola) y calcule la suma total de cargaToneladas de todos los camiones estacionados.
    public static void main(String[] args) {
        Callejon callejon = new Callejon();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=========================================");
            System.out.println("========== Callejon del muelle ==========");
            System.out.println("=========================================");
            System.out.println(" 1- Apilar nuevo camion.");
            System.out.println(" 2- Calcular peso de todos los camiones.");
            System.out.println(" 3- Salir.");
            System.out.println("=========================================");
            System.out.print(" -Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-Ingrese la placa: ");
                    String placa = sc.next();
                    System.out.println("-Ingrese el nombre del conductor: ");
                    String conductor = sc.next();
                    System.out.println("-Ingrese el peso del camion(Toneladas): ");
                    double peso = sc.nextDouble();
                    callejon.Push(new Camion(placa,conductor,peso));
                    System.out.println("Camion estacionado con exito..");
                    break;
                
                case 2:
                    System.out.println(" El peso de todos los camiones estacionados es: "+ callejon.CalcularPeso()+" Toneladas.");
                    break;
                
                case 3:
                    System.out.println("Cerrando programa...");
                    break;
            
                default:
                    System.out.println(" Opcion Invalida.");
                    break;
            }
        } while (opcion!=3);

        sc.close();
    }
}
