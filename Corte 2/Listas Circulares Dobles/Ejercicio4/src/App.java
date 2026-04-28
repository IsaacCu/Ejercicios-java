import java.util.Scanner;

public class App {
// 4. Galería de Fotos
// Una app de galería muestra las fotos de un álbum de una en una. El usuario puede pasar a la foto siguiente, volver a la anterior, y marcar cualquier foto como favorita. Al eliminar una foto, la galería continúa desde la siguiente sin interrupciones.

// La Clase Foto (Nodo): Debe contener titulo (String), fecha (String) y esFavorita (boolean).
// El Problema: La galería mantiene un puntero actual a la foto que se está viendo. Navegar con "siguiente" o "anterior" mueve ese puntero. Marcar como favorita simplemente alterna el campo esFavorita de la foto actual. Eliminar la foto actual desconecta el nodo en O(1) y mueve actual a la siguiente.
// Reto: Implementa los métodos siguiente(), anterior(), toggleFavorita(), eliminarActual() y mostrarGaleria(). mostrarGaleria() recorre todas las fotos marcando con [★] las favoritas y con [▶] la foto actual. Simula: carga 5 fotos, avanza dos veces, marca la actual como favorita, retrocede una, elimina esa foto y muestra el estado final de la galería.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Galeria galeria = new Galeria();
        int opcion;
        do {
            System.out.println("\n==============================================");
            System.out.println("    Galeria de fotos — Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Agregar Foto.");
            System.out.println("2. Mostrar Fotos.");
            System.out.println("3. Siguiente Foto.");
            System.out.println("4. Anterior Foto.");
            System.out.println("5. Hacer Favorito Actual.");
            System.out.println("6. Eliminar Foto Actual.");
            System.out.println("0. Salir.");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Fecha: ");
                    String fecha = sc.next();
                    boolean esFavorita;
                    while (true) {
                        System.out.println("Favorita(1-Si/2-No): ");
                        int opcion2 = sc.nextInt();
                        if (opcion2 == 1) {
                            esFavorita = true;
                            break;
                        }
                        else if (opcion2 == 2) {
                            esFavorita = false;
                            break;
                        }
                        else{
                            System.out.println("Opcion invalida.");
                        }
                    }
                    System.out.println("");
                    galeria.agregar_foto(new Foto(titulo, fecha , esFavorita));
                    System.out.println("Foto agregada exitosamente.");
                    break;

                case 2:
                    galeria.mostrar_fotos();
                    break;

                case 3:
                    galeria.anterior_foto();
                    break;

                case 4:
                    galeria.siguiente_foto();
                    break;

                case 5:
                    if (galeria.esta_Vacia()) {
                        System.out.println("No existen Fotos.");
                    }
                    else{
                        System.out.println("Puntero actual: ");
                        galeria.mostrar_puntero();
                        System.out.println("Cambiar Favorito a:");
                        System.out.println("1- Si.");
                        System.out.println("2- No");
                        int opcion3; 
                        opcion3 = sc.nextInt();
                        galeria.cambiar_favorito(opcion3);
                    }
                    break;

                case 6:
                    if (galeria.esta_Vacia()) {
                        System.out.println("No existen Fotos.");
                    }
                    else{
                        System.out.println("Puntero actual: ");
                        galeria.mostrar_puntero();
                        galeria.eliminar_Actual();
                    }
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        sc.close();
    }
}
