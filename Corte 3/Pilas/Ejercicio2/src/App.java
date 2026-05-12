import java.util.Scanner;

public class App {
// 2. Control de Calidad (Línea de Ensamblaje)
// Un brazo robótico en una fábrica de motores apila componentes siguiendo una secuencia precisa. Un sensor de visión artificial inspecciona cada pieza después de ser colocada.

// La Clase Pieza (Nodo): Debe contener nombrePieza (String), numeroSerie (String) y esDefectuosa (boolean).
// El Problema: Si el sensor detecta una pieza defectuosa, la línea de producción debe detenerse inmediatamente.
// Reto: Crea un método limpiarHastaDefecto() que extraiga (pop) todas las piezas de la pila hasta encontrar la primera que tenga esDefectuosa = true. El método debe imprimir el nombre de todas las piezas "buenas" que tuvieron que ser retiradas y descartadas antes de llegar a la pieza fallida.
    public static void main(String[] args) {
        LineaEnsamblaje ensamblaje = new LineaEnsamblaje();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=========================================");
            System.out.println("========== Linea de Ensamblaje ==========");
            System.out.println("=========================================");
            System.out.println(" 1- Apilar nueva pieza.");
            System.out.println(" 2- Limpiar hasta pieza defectuosa.");
            System.out.println(" 3- Salir.");
            System.out.println("=========================================");
            System.out.print(" -Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-Ingrese el nombre: ");
                    String nombre = sc.next();
                    System.out.println("-Ingrese el numero de serie: ");
                    String numero = sc.next();
                    System.out.println("La pieza presenta defectos(1-Si./2-No.)");
                    int opcion2 = sc.nextInt();
                    boolean defectos;
                    if (opcion2 == 1) {
                        defectos = true;
                    }
                    else{
                        defectos = false;
                    }
                    ensamblaje.Push(new Pieza(nombre,numero,defectos));
                    System.out.println("Pieza ensamblada con exito.");
                    break;
                
                case 2:
                    ensamblaje.limpiarHastaDefecto();
                    break;
                
                case 3:
                    System.out.println("Cerrando programa...");
                    break;
            
                default:
                    System.out.println("Opcion Invalida.");
                    break;
            }
        } while (opcion!=3);

        sc.close();

    }
}
