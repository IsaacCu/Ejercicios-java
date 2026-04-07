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
        Listanodos lista = new Listanodos();

        do {
            System.out.println("==================================");
            System.out.println("         Menu de opciones"         );
            System.out.println("==================================");
            System.out.println("1- Agregar Nodo.");
            System.out.println("2- Contar cuantos nodos hay.");
            System.out.println();
            System.out.println("0- Salir.");
            System.out.println("==================================");
            System.out.println("Elija una opcion:");
            opcion=sc.nextInt();
            System.out.println();
            switch (opcion) {
                case 1:
                    System.out.println("==================================");
                    System.out.println("Ingrese el nombre del nodo: ");
                    String nombrenodo = sc.next();
                    

                    Nodos nuevoNodo = new Nodos(nombrenodo);
                    lista.Agregarnodos(nuevoNodo);
                    break;

                case 2:
                    int pesototal= lista.contarnodos();
                    System.out.println("==================================");
                    System.out.println(" numero de nodos: " + pesototal);
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
