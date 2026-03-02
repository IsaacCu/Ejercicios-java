// Ejercicio 9 — String inmutable
// Pide al usuario su nombre. Asigna alias = nombre. Pide un nuevo alias. 
// Muestra que nombre no cambió y explica la inmutabilidad de String con un 
// mensaje en consola.

// Datos de entrada: String nombre, String nuevo alias

import java.util.Scanner;

public class EjercicioIMPUT9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String nombre= sc.nextLine();
        String alias=nombre;
        System.out.println("Ingrese un nuevo alias: ");
        alias=sc.nextLine();

        System.out.println("Nombre: "+ nombre);
        System.out.println("Alias: "+ alias);
        System.out.println("Como podemos observar a pesar de asignar un nuevo valor a alias esto no afecto al nombre ya que los String son inmutables y simplemente se crea una copia.");
        sc.close();
    }
    
}
