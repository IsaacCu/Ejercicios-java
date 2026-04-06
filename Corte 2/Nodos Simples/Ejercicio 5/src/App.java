import java.util.Scanner;

public class App {
// 5. Spotify Lite (Lista de Reproducción)
// Crea un reproductor de música simplificado que gestione una lista de canciones.

// La Clase Cancion (Nodo): Debe contener titulo (String), artista (String), duracionSegundos (int)
//  y genero (String).
// El Problema: El usuario puede agregar canciones "A continuación" (insertar después de la actual) 
// o "Al final de la cola".
// Reto: Implementa un método que sume la duración de todas las canciones y muestre el tiempo total
//  de la lista en formato MM:SS.
    public static void main(String[] args){
        int opcion;
        Lista lista = new Lista();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("========================================");
            System.out.println("========== Menu de Opciones ============");
            System.out.println("========================================");
            System.out.println("1- Agregar cancion a continuacion.");
            System.out.println("2- Agregar cancion al final.");
            System.out.println("3- Duracion total.");
            System.out.println("4- Imprimir lista.");
            System.out.println("5- Salir.");
            System.out.println("========================================");
            System.out.println("Opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    String titulo;
                    String artista;
                    int duracion;
                    String genero;
                    System.out.println("Ingrese el titulo de la cancion:: ");
                    titulo = sc.next();
                    System.out.println("Ingrese el nombre del artista:");
                    artista = sc.next();
                    System.out.println("Ingrese la duracion: ");
                    duracion = sc.nextInt();
                    System.out.println("Ingrese el genero: ");
                    genero = sc.next();
                    Cancion nuevalectura = new Cancion(titulo, artista, duracion, genero);
                    lista.agregar_acontinuacion(nuevalectura);
                    break;

                case 2:
                    String titulo2;
                    String artista2;
                    int duracion2;
                    String genero2;
                    System.out.println("Ingrese el titulo de la cancion:: ");
                    titulo2 = sc.next();
                    System.out.println("Ingrese el nombre del artista:");
                    artista2 = sc.next();
                    System.out.println("Ingrese la duracion: ");
                    duracion2 = sc.nextInt();
                    System.out.println("Ingrese el genero: ");
                    genero2 = sc.next();
                    Cancion nuevalectura2 = new Cancion(titulo2, artista2, duracion2, genero2);
                    lista.agregar_alfial(nuevalectura2);
                    break;

                case 3:
                    lista.tiempoReproducciom();
                    break;
                
                case 4:
                    lista.listaReproduccion();
                    break;

                case 5:
                    System.out.println("==================================");
                    System.out.println("cerrando el codigo...");
                    System.out.println("==================================");
                    break;

                default:
                    System.out.println("Opcion invalida, elija otra opcion.");
                    break;
            }
        } while (opcion != 5);
        sc.close();
    }
}
