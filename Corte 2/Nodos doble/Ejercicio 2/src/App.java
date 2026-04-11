import java.util.Scanner;

public class App {
// 2. Carrusel de Imágenes (Galería Interactiva)
// Simula el comportamiento de una galería de fotos en una aplicación móvil.

// La Clase Fotografia (Nodo): Debe contener nombreArchivo (String), tamanoMB (double) y resolucion
// (String).
// El Problema: El usuario puede avanzar a la "Siguiente Foto" o retroceder a la "Foto Anterior". Si 
// llega al final, no puede avanzar más (a menos que sea circular, pero por ahora manténlo lineal).
// Reto: Crea un método reproducirGaleria() que recorra toda la lista hacia adelante y luego toda la 
// lista hacia atrás para mostrar todas las fotos.
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion;
        Galeria galeria = new Galeria();
        do {
            System.out.println("\n==============================================");
            System.out.println("           Galeria de Fotografias");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar Fotografia");
            System.out.println("  [2] Recorrer de inico a fin la Galeria");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese nombre del archivo:");
                    String nombre = sc.next();

                    System.out.println("Ingrese el tamaño:");
                    Double tamaño = sc.nextDouble();

                    System.out.println("Ingrese la Resolucion:");
                    String resolucion = sc.next();

                    Fotografia nuevaFotografia = new Fotografia(nombre,tamaño,resolucion);
                    galeria.agregar(nuevaFotografia);
                    break;

                case 2:
                    galeria.recorrer_galeria();
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
