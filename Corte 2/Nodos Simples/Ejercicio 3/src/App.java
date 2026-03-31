import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opc;
        Fila fila = new Fila();

        do {
            System.out.println("=======================================");
            System.out.println("           Menu de opciones            ");
            System.out.println("=======================================");
            System.out.println("1- Agregar vuelos.");
            System.out.println("2- Imprimir vuelos.");
            System.out.println("3- Emergencia.");
            System.out.println("0- Salir.");
            System.out.println("=======================================");
            System.out.println("Elija una opcion: ");
            opc = sc.nextInt();
            sc.nextLine(); 

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el número de vuelo:");
                    String numeroVuelo = sc.nextLine();

                    System.out.println("Ingrese la aerolínea:");
                    String aerolinea = sc.nextLine();

                    System.out.println("Ingrese el combustible restante:");
                    int combustible = sc.nextInt();

                    System.out.println("Ingrese la cantidad de pasajeros:");
                    int pasajeros = sc.nextInt();
                    sc.nextLine();

                    Vuelo vuelo = new Vuelo(numeroVuelo, aerolinea, combustible, pasajeros);

                    
                    if (combustible < 10) {
                        fila.insertarAlInicio(vuelo);
                    } else {
                        fila.Agregar_Vuelo(vuelo);
                    }
                    break;

                case 2:
                    fila.Imprimir();
                    break;
                
                case 3:
                    System.out.println("Ingrese el número de vuelo para reordenarlo:");
                    String numeroBuscar = sc.nextLine();
                    fila.reportarEmergencia(numeroBuscar);
                    break;

                case 0:
                    System.out.println("=================================================");
                    System.out.println(" Cerrando programa......");
                    System.out.println("=================================================");
                    break;
            
                default:
                    System.out.println("=================================================");
                    System.out.println(" Opcion Invalida, elija nuevamente.");
                    System.out.println("=================================================");
                    break;
            }

            System.out.println();

        } while (opc != 0);

        sc.close();
    }
}