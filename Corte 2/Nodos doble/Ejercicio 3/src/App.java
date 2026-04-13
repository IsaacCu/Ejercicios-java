import java.util.Scanner;
public class App {
// 3. Navegación de Pestañas de Navegador
// Imagina un navegador donde puedes moverte entre pestañas abiertas.

// La Clase Pestana (Nodo): Debe contener tituloPagina (String), url (String) y 
// horaApertura (String).
// El Problema: Las pestañas se abren una tras otra. A veces el usuario quiere cerrar 
// la pestaña actual y el foco debe pasar a la pestaña anterior.
// Reto: Implementar el método cerrarPestanaActual(String url) que busque la pestaña por 
// URL, la elimine de la lista y reconecte el nodo anterior con el siguiente correctamente
//  (¡Cuidado con la Cabeza y la Cola!).
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion;
        Historial historial = new Historial();
        do {
            System.out.println("\n==============================================");
            System.out.println("           Pestañas de navegacion");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar pestaña.");
            System.out.println("  [2] Imprimir lista de pestañas.");
            System.out.println("  [3] Cerrar una pestaña.");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese titulo de la pestaña:");
                    String titulo = sc.next();

                    System.out.println("Ingrese el URL:");
                    String url = sc.next();

                    System.out.println("Ingrese la hora actual:");
                    String hora = sc.next();

                    Pestaña nuevapestaña = new Pestaña(titulo,url,hora);
                    historial.agregar_pestaña(nuevapestaña);
                    break;

                case 2:
                    historial.imprimir();
                    break;
                
                case 3:
                    System.out.println("Ingrese el URL de la pestaña a cerrar::");
                    String url_borrar = sc.next();
                    historial.cerrar_Pestaña(url_borrar);
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
