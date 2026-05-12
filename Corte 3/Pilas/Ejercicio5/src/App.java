import java.util.Scanner;

public class App {
// 5. Ruta de Rescate (Espeleología Geológica)
// Un equipo de rescatistas entra en una cueva inexplorada. Para no perderse, van dejando "Estaciones de Seguridad" representadas por una baliza que registra los datos del entorno.

// La Clase Estacion (Nodo): Debe contener nombrePunto (String), profundidad (int) y nivelOxigeno (double).
// El Problema: Para salir de la cueva, el equipo debe seguir las estaciones en el orden inverso al que fueron colocadas (de la más profunda a la entrada).
// Reto: Implementa el método retrocederASuperficie(). Este debe mostrar el nombre de cada estación a medida que se desapila. Importante: Si en alguna estación el nivelOxigeno es inferior al 18%, el sistema debe imprimir una alerta de "Uso de Tanque de Emergencia Requerido" al pasar por ese punto.
    public static void main(String[] args) {
        Cueva cueva = new Cueva();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=========================================");
            System.out.println("========== Estaciones de Cueva ==========");
            System.out.println("=========================================");
            System.out.println(" 1- Crear nueva Estacion.");
            System.out.println(" 2- Ir a superficie.");
            System.out.println(" 3- Salir.");
            System.out.println("=========================================");
            System.out.print(" -Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-Ingrese el nombre del punto: ");
                    String nombre = sc.next();
                    System.out.println("-Ingrese la profundidad : ");
                    int profundidad = sc.nextInt();
                    System.out.println("-Ingrese el nivel de oxigeno(%): ");
                    double nivelOxigeno = sc.nextDouble();
                    cueva.Push(new Estacion(nombre,profundidad,nivelOxigeno));
                    System.out.println("Punto registrado con exito..");
                    break;
                
                case 2:
                    cueva.retrocederASuperficie();
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
