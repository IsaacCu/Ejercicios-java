/* 1. El Tren de Carga (Logística Ferroviaria)
Diseña un sistema para gestionar los vagones de un tren de carga internacional.

La Clase Vagon (Nodo): Debe contener contenido (String), pesoToneladas (double), origen (String) y destino (String).
El Problema: El tren sale de una estación y se le van enganchando vagones al final.
Reto: Implementa un método que recorra el tren y calcule el peso total de toda la carga transportada. */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int opcion;
        Tren tren = new Tren();

        do {
            System.out.println("==================================");
            System.out.println("         Menu de opciones"         );
            System.out.println("==================================");
            System.out.println("1- Agregar vagon.");
            System.out.println("2- Calcular peso total de la carga.");
            System.out.println();
            System.out.println("0- Salir.");
            System.out.println("==================================");
            System.out.println("Elija una opcion:");
            opcion=sc.nextInt();
            System.out.println();
            switch (opcion) {
                case 1:
                    System.out.println("==================================");
                    System.out.println("Ingrese el contenido: ");
                    String contenido = sc.next();
                    System.out.println("Ingrese el peso en toneladas: ");
                    Double pesoToneladas = sc.nextDouble();
                    System.out.println("Ingrese el lugar de origen: ");
                    String origen = sc.next();
                    System.out.println("Ingrese el lugar de destino: ");
                    String destino = sc.next();

                    Vagon nuevoVagon = new Vagon(contenido, pesoToneladas, origen, destino);
                    tren.Agregar_Vagon(nuevoVagon);
                    break;

                case 2:
                    Double pesototal= tren.calcularPeso();
                    System.out.println("==================================");
                    System.out.println(" Peso de toda la carga: " + pesototal+" Toneladas.");
                    System.out.println("==================================");
                    break;
                
                case 0:
                    System.out.println("==================================");
                    System.out.println("Cerrando Programa......");
                    System.out.println("==================================");
                    break;

                default:
                    System.out.println("==================================");
                    System.out.println("Opcion Invalida, Elija otra opcion.");
                    System.out.println("==================================");
            }

        } while (opcion!=0);

        sc.close();
    }
}
