import java.util.Scanner;
// 5. Reproductor de Música Premium
// Mejora el ejercicio de Spotify de la semana pasada usando listas dobles.

// La Clase Cancion (Nodo): Debe contener titulo (String), artista (String) y duracion (int).
// El Problema: El reproductor ahora permite la función "Canción Anterior" de manera eficiente
//  sin tener que recorrer toda la lista desde el principio.
// Reto: Implementa un método saltarAtras() que retroceda una posición y saltarAdelante() que 
// avance una. Si se intenta saltar atrás desde la primera canción, debe mostrar un mensaje de 
// error.
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion;
        Reproductor reproductor = new Reproductor();

        do {
            System.out.println("\n==============================================");
            System.out.println("         Reproductor de Musica");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar canción.");
            System.out.println("  [2] Mostrar canción actual.");
            System.out.println("  [3] Siguiente canción.");
            System.out.println("  [4] Canción anterior.");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese titulo:");
                    String titulo = sc.next();

                    System.out.println("Ingrese artista:");
                    String artista = sc.next();

                    System.out.println("Ingrese duración (segundos):");
                    int duracion = sc.nextInt();

                    Cancion nueva = new Cancion(titulo, artista, duracion);
                    reproductor.agregar_cancion(nueva);
                    break;

                case 2:
                    reproductor.mostrar_actual();
                    break;

                case 3:
                    reproductor.saltarAdelante();
                    break;

                case 4:
                    reproductor.saltarAtras();
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