// Ejercicio 10 — Intercambio de valores
// Pide dos números enteros x e y. Intercambia sus valores usando una 
// variable auxiliar temp. Muestra los valores antes y después del intercambio.

// Datos de entrada: int x, int y

import java.util.Scanner;

public class EjercicioIMPUT10 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese un numero entero para X: ");
        int x = sc.nextInt();

        System.out.println("Ingrese un numero entero para Y: ");
        int y = sc.nextInt();
        System.out.println("Variables antes del cambio.");
        System.out.println("X:"+x+" ; Y:"+y);
        int temp=x;
        x=y;
        y=temp;

        System.out.println("Variables despues del cambio.");
        System.out.println("X:"+x+" ; Y:"+y);


        
        sc.close();
    }
    
}
