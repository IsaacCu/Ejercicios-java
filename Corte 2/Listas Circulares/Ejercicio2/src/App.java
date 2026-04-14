import java.util.Scanner;
// 2. Carrusel de Anuncios (Pantalla Digital) Una tienda tiene una pantalla que muestra anuncios 
// en rotación continua. Cuando termina el último anuncio, vuelve automáticamente al primero. 
//  Clase Anuncio (Nodo): Debe contener titulo (String), duracionSegundos (int), vecesRepetido
//  (int) y categoria (String - ej: "Oferta", "Marca", "Evento"). El Problema: La pantalla
//  necesita saber cuánto tiempo total lleva encendida y cuál es el anuncio que más veces se 
// ha repetido. Reto: Implementa el método reproducir(int ciclos) que simule ciclos pasadas 
// completas por todos los anuncios, incrementando vecesRepetido en cada paso e imprimiendo 
// qué anuncio está en pantalla. Al finalizar, muestra el anuncio más repetido y el tiempo 
// total acumulado en pantalla.
public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion;
        Carrusel carrusel = new Carrusel();

        do {
            System.out.println("\n==============================================");
            System.out.println("           Carrusel de Anuncios");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar Anuncio");
            System.out.println("  [2] Reproducir ciclos");
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

                    System.out.println("Ingrese duracion en segundos:");
                    int duracion = sc.nextInt();

                    System.out.println("Ingrese categoria:");
                    String categoria = sc.next();

                    Anuncio nuevo = new Anuncio(titulo, duracion, categoria);
                    carrusel.agregar(nuevo);
                    break;

                case 2:
                    System.out.println("Ingrese cantidad de ciclos:");
                    int ciclos = sc.nextInt();
                    carrusel.reproducir(ciclos);
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