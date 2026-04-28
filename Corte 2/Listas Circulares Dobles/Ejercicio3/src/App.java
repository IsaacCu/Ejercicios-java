import java.util.Scanner;

public class App {
// 3. Editor de Capas (Diseño Gráfico)
// Los editores gráficos organizan el diseño en capas. El usuario navega a la capa superior 
// (siguiente) o inferior (anterior) y puede ocultar o mostrar cada capa. La estructura es 
// circular: después de la capa más alta vuelve a la más baja.

// La Clase Capa (Nodo): Debe contener nombre (String), visible (boolean) y tipo (String —
//  "fondo", "objeto", "texto").
// El Problema: El editor mantiene un puntero capaActiva a la capa seleccionada. El usuario
//  puede moverse entre capas, alternar la visibilidad de la activa y eliminarla (el foco pasa
//  a la siguiente).
// Reto: Implementa los métodos subirCapa(), bajarCapa(), toggleVisibilidad(), eliminarActiva()
//  y mostrarCapas(). mostrarCapas() imprime todas las capas marcando la activa con [✓] e indicando
//  si cada una es visible. Simula: crea 4 capas, activa la del medio, sube una vez, oculta la
//  activa, elimínala y muestra el estado final.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EditorCapas editorCapas = new EditorCapas();
        int opcion;
        do {
            System.out.println("\n==============================================");
            System.out.println("    Editor de Capas — Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Agregar Capa.");
            System.out.println("2. Mostrar Capas.");
            System.out.println("3. Mover puntero arriba.");
            System.out.println("4. Mover puntero abajo.");
            System.out.println("5. Cambiar la visivilidad la capa Actual.");
            System.out.println("6. Eliminar Capa actual.");
            System.out.println("0. Salir.");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la capa: ");
                    String nombre = sc.nextLine();
                    boolean activo;
                    while (true) {
                        System.out.println("Activo (1-SI/2-NO): ");
                        int opcion2 = sc.nextInt();
                        if (opcion2 == 1) {
                            activo = true;
                            break;
                        }
                        else if (opcion2 == 2) {
                            activo = false;
                            break;
                        }
                        else{
                            System.out.println("Opcion invalida.");
                        }
                    }
                    System.out.print("Tipo(fondo/objeto/texto): ");
                    String tipo = sc.next();
                    System.out.println("");
                    editorCapas.agregar_capa(new Capa(nombre, activo, tipo));
                    System.out.println("Comando agregado exitosamente.");
                    break;

                case 2:
                    editorCapas.mostrar_Capas();
                    break;

                case 3:
                    editorCapas.subir_Capa();
                    break;

                case 4:
                    editorCapas.bajar_Capa();
                    break;

                case 5:
                    if (editorCapas.esta_Vacia()) {
                        System.out.println("No existen capas.");
                    }
                    else{
                        System.out.println("Puntero actual: ");
                        editorCapas.mostrar_puntero();
                        System.out.println("Cambiar estado a:");
                        System.out.println("1- SI.");
                        System.out.println("2- NO");
                        int opcion3; 
                        opcion3 = sc.nextInt();
                        editorCapas.cambiar_Visibilidad(opcion3);
                    }
                    break;

                case 6:
                    if (editorCapas.esta_Vacia()) {
                        System.out.println("No existen capas.");
                    }
                    else{
                        System.out.println("Puntero actual: ");
                        editorCapas.mostrar_puntero();
                        editorCapas.eliminar_Actual();
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
