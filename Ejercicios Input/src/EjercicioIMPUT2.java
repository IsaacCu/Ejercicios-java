// Ejercicio 2 — Conversor de temperatura
// Pide al usuario una temperatura en Celsius y conviértela a Fahrenheit y Kelvin.

// Fórmulas:

// F = (C × 9/5) + 32
// K = C + 273.15
// Dato de entrada: double temperatura en Celsius

import java.util.Scanner;
public class EjercicioIMPUT2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en Grados Celsius(C): ");
        double celsius = sc.nextDouble();

        double fahrenheit =(celsius*9/5)+32;
        double kelvin = celsius + 273.15;

        System.out.println("==== Conversor ====");
        System.out.println( celsius +" ºC = " + fahrenheit +" ºF = " + kelvin +" ºK");

        sc.close();
    }
    
}
