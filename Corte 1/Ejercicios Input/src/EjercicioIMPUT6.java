
// Ejercicio 6 — Demostración por valor
// Pide al usuario dos números enteros a y b. Asigna b = a, luego pide un nuevo valor para b. Imprime a y b después del cambio y explica con un mensaje en consola por qué a no cambió.

// Datos de entrada: int a, int b (dos veces)

import java.util.Scanner;

public class EjercicioIMPUT6 {
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingres el valor de A: ");
        int a = sc.nextInt();

        System.out.println("Ingrese el valor de B: ");
        int b= sc.nextInt();

        System.out.println("A: " + a);
        System.out.println("B: " + b);

        b=a;
        System.out.println("Asignee un nuevo valor para B: ");
        b= sc.nextInt();

        System.out.println("A: " + a);
        System.out.println("B: " + b);

        sc.close();

        //A no cambio porque B cambio, por la sencilla razon que al hacer
        //  B=A solo se copio la informacion de a mas no se enlazaron, es
        //  por esto que lo que ocurra en B no afecta a A
    }
}