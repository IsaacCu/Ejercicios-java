/* 2. Inventario de Alimentos (Control de Caducidad)
Un supermercado necesita gestionar su estante de lácteos. Los productos que vencen más
 pronto deben colocarse al principio para ser vendidos primero.

La Clase Producto (Nodo): Debe contener nombre (String), cantidad (int) y diasParaVencer (int).
El Problema: Si llega un producto que vence en menos de 3 días, debe insertarse al inicio de la lista
 (prioridad de venta). Si vence en más tiempo, se pone al final.
Reto: Crea un método que imprima solo los productos que tienen menos de 5 días para vencer. */

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int opc;
        Estante estante = new Estante();

        do {
            System.out.println("=================================================");
            System.out.println("                  Menu de Opciones               ");
            System.out.println("=================================================");
            System.out.println("1- Agregar Producto.");
            System.out.println("2- Imprimir lista de productos proximos a vencer.");
            System.out.println();
            System.out.println("0- Salir.");
            System.out.println("=================================================");
            System.out.println("Elija un aopcion:");
            opc=sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("=================================================");
                    System.out.println("Ingrese el nombre: ");
                    String nombre = sc.next();
                    System.out.println("Ingrese la cantida: ");
                    int cantidad = sc.nextInt();
                    System.out.println("Ingrese los dias a vencer: ");
                    int diasParaVencer = sc.nextInt();
                    Producto producto= new Producto(nombre, cantidad, diasParaVencer);
                    estante.Ordenar(producto);
                    break;
                case 2:
                    estante.Imprimir();
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
            
        } while (opc !=0);
        sc.close();
    }
}
