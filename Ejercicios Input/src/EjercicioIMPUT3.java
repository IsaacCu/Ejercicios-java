// Ejercicio 3 — Promedio de notas
// Pide al usuario su nombre y 4 notas de un curso. Calcula el promedio
//  y determina si aprobó (promedio >= 3.0).

// Datos de entrada:

// String nombre
// double nota1, nota2, nota3, nota4

import java.util.Scanner;

public class EjercicioIMPUT3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su Nº1: ");
        double nota1 = sc.nextDouble();

        System.out.println("Ingrese su Nº2: ");
        double nota2 = sc.nextDouble();

        System.out.println("Ingrese su Nº3: ");
        double nota3 = sc.nextDouble();

        System.out.println("Ingrese su Nº4: ");
        double nota4 = sc.nextDouble();

        double promedio =(nota1+nota2+nota3+nota4)/4;

        String estado = "REPROBADO";

        if (promedio>=3) {
            estado = "APROBADO";
        }
        

        System.out.println("==== Estado del Estudiente ====");
        System.out.println("Estudiante: "+ nombre);
        System.out.println("Promedio: "+ promedio);
        System.out.println("Estado: "+ estado);

    }
}
