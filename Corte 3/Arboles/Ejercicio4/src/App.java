import java.util.Scanner;
// 4. Torneo de Ajedrez (Sistema de Rankings ELO)
// Una plataforma de ajedrez en línea gestiona el ranking ELO de sus jugadores en un BST. A medida que los jugadores completan partidas, su ELO se actualiza y se reinsertan en el árbol. El director del torneo necesita obtener la lista de jugadores que clasifican a la siguiente ronda, es decir, todos aquellos cuyo ELO se encuentre dentro de un rango específico.

// La Clase Jugador (Nodo): Debe contener elo (int, clave del BST), nombreUsuario (String), pais (String) y partidasJugadas (int).
// El Problema: Para la ronda de clasificación, el director fija un rango mínimo y máximo de ELO (por ejemplo, entre 1800 y 2200). Todos los jugadores en ese rango deben ser listados de menor a mayor ELO para armar los emparejamientos.
// Reto: Implementa el método listarEnRango(int eloMin, int eloMax) que recorra el árbol e imprima los datos de todos los jugadores cuyo elo esté dentro del rango [eloMin, eloMax] en orden ascendente. Usa la propiedad del BST para podar: si el nodo actual es menor que eloMin, solo explora el subárbol derecho; si es mayor que eloMax, solo explora el izquierdo.
public class App {

    public static void main(String[] args) {

        ArbolJugadores arbol = new ArbolJugadores();
        Scanner scanner = new Scanner(System.in);

        // Datos de prueba
        arbol.insertar(1650, "DragonMaster", "Colombia", 120);
        arbol.insertar(2100, "KnightKing", "Argentina", 340);
        arbol.insertar(1850, "QueenAttack", "Peru", 215);
        arbol.insertar(1950, "ChessTitan", "Mexico", 278);
        arbol.insertar(2300, "GrandMasterX", "Chile", 510);
        arbol.insertar(1750, "RookPlayer", "Ecuador", 160);

        int opcion;

        do {
            System.out.println("\n--- TORNEO DE AJEDREZ (BST) ---");
            System.out.println("1. Listar jugadores en rango ELO");
            System.out.println("2. Registrar jugador");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("ELO mínimo: ");
                    int eloMin = scanner.nextInt();

                    System.out.print("ELO máximo: ");
                    int eloMax = scanner.nextInt();
                    scanner.nextLine();

                    arbol.listarEnRango(eloMin, eloMax);
                    break;

                case 2:
                    System.out.print("ELO: ");
                    int elo = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Nombre de usuario: ");
                    String nombre = scanner.nextLine();

                    System.out.print("País: ");
                    String pais = scanner.nextLine();

                    System.out.print("Partidas jugadas: ");
                    int partidas = scanner.nextInt();
                    scanner.nextLine();

                    arbol.insertar(elo, nombre, pais, partidas);
                    System.out.println("Jugador registrado correctamente.");
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}