import java.util.Scanner;
// 2. Catálogo Digital (Biblioteca Universitaria)
// La biblioteca de la universidad organiza su colección de libros en un BST usando el ISBN como clave única. Cada vez que ingresa un libro nuevo, se inserta automáticamente en el árbol. El sistema debe poder confirmar si un ISBN ya existe antes de registrar un nuevo ejemplar y listar toda la colección ordenada por ISBN.

// La Clase Libro (Nodo): Debe contener isbn (long, clave del BST), titulo (String), autor (String) y anioPublicacion (int).
// El Problema: Al final del semestre, el bibliotecario necesita imprimir el inventario completo ordenado de menor a mayor por ISBN para enviarlo a la sede central. También debe verificar si un ISBN específico ya existe en el catálogo antes de registrar una donación.
// Reto: Implementa el método imprimirCatalogo() usando el recorrido InOrden para listar todos los libros en orden ascendente de ISBN (imprime isbn - titulo - autor). Además, implementa existeISBN(long isbn) que retorne true si el libro ya está registrado y false en caso contrario.
public class App {

    public static void main(String[] args) {

        ArbolLibros arbol = new ArbolLibros();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        arbol.insertar(9780134685991L, "Libro Java", "Joshua Bloch", 2018);
        arbol.insertar(9780132350884L, "Codigo Limpio", "Robert C. Martin", 2008);
        arbol.insertar(9780201633610L, "Design Patterns", "GoF", 1994);
        arbol.insertar(9780134494166L, "Core Java", "Cay Horstmann", 2018);
        arbol.insertar(9781491950357L, "Learning Python", "Mark Lutz", 2013);

        int opcion;

        do {
            System.out.println("\n--- CATÁLOGO DIGITAL DE BIBLIOTECA (BST) ---");
            System.out.println("1. Imprimir catálogo ordenado");
            System.out.println("2. Verificar existencia de ISBN");
            System.out.println("3. Insertar libro");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println();
                    arbol.imprimirCatalogo();
                    break;

                case 2:
                    System.out.print("Ingrese el ISBN a buscar: ");
                    long isbnBuscar = scanner.nextLong();
                    scanner.nextLine();

                    if (arbol.existeISBN(isbnBuscar))
                        System.out.println("El ISBN ya existe en el catálogo.");
                    else
                        System.out.println("El ISBN no se encuentra registrado.");
                    break;

                case 3:
                    System.out.print("ISBN: ");
                    long isbn = scanner.nextLong();
                    scanner.nextLine();

                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();

                    System.out.print("Año de publicación: ");
                    int anio = scanner.nextInt();
                    scanner.nextLine();

                    arbol.insertar(isbn, titulo, autor, anio);
                    System.out.println("Libro registrado correctamente.");
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 4);

        scanner.close();
    }
}