import java.util.Scanner;

public class App {
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
            System.out.println("  [3] Ver foto actual");
            System.out.println("  [4] Foto anterior");
            System.out.println("  [5] Foto siguiente");
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

                case 3:
                    galeria.verActual();
                    break;

                case 4:
                    galeria.deshacer();
                    break;

                case 5:
                    galeria.rehacer();
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