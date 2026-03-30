// Ejercicio 1 — Recibo de compra
// Pide al usuario el nombre de un producto, la cantidad comprada y el 
// precio unitario. Calcula el subtotal, aplica un IVA del 19% y muestra 
// el recibo con el total a pagar.

// Datos de entrada:

// String nombre del producto
// int cantidad
// double precio unitario

import java.util.Scanner;

public class EjercicioIMPUT1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        String nombre_producto = sc.nextLine();

        System.out.println("Ingrese la cantidad del producto: ");
        int cantidad = sc.nextInt();

        System.out.print("Ingrese el Valor del producto: ");
        double valor = sc.nextDouble();

        double subto = cantidad*valor;
        double iva = subto*0.19;
        double total=subto+iva;
        
        System.out.println("=========== Recibo ===========");
        System.out.println("Producto: " + nombre_producto);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Valor Unitario c/u: " + valor);
        System.out.println("Subtotal: " + subto);
        System.out.println("IVA(19%): " + iva);
        System.out.println("Total: " + total);

        sc.close();
    }
    
}
