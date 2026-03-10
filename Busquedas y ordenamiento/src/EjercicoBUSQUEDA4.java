// 4. Registro Alfabético de Estudiantes
// Algoritmo obligatorio: Ordenamiento por Inserción (Insertion Sort)

// Contexto: El profesor necesita pasar asistencia y requiere que la lista de nombres 
// ingresada en el sistema se ordene alfabéticamente de la A a la Z.
// Detalle del ejercicio: El programa debe preguntar cuántos alumnos hay en clase y
//  solicitar sus nombres (cadenas de texto).
// Lógica de Texto: Se debe usar el método de Inserción adaptado para String.
// Requisito técnico: El estudiante debe investigar y aplicar el método 
// nombre1.compareToIgnoreCase(nombre2). Es vital explicar que si el resultado es 
// mayor a 0, el primer nombre es alfabéticamente "mayor" que el segundo.
// Resultado esperado: La lista de asistencia impresa en orden alfabético perfecto.

import java.util.Scanner;
public class EjercicoBUSQUEDA4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de alumnos: ");
        int estudiantes = sc.nextInt();
        String[] nombres = new String[estudiantes];

        for (int i=0; i<estudiantes;i++){
            System.out.println("Ingrese el nombre del alumno "+(i+1)+": ");
            nombres[i]= sc.next();
        }

        System.out.println("Lista Original.");
        imprimirArreglo(nombres);

        // Ordenamiento por inserción
        for (int i = 1; i < nombres.length; i++) {

            String actual = nombres[i];
            int j = i - 1;

            while (j >= 0 && nombres[j].compareToIgnoreCase(actual) > 0) {
                nombres[j + 1] = nombres[j];
                j--;
            }

            nombres[j + 1] = actual;
        }
        System.out.println("Lista ordenada.");
        imprimirArreglo(nombres);

        sc.close();

    }
    public static void imprimirArreglo(String[] args) {
        for (String d : args) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
    // es porque esta funcion compara las iniciales por orden alfabetica que
    //  ya viene integrada, sin importar si son mayusculas o minusculas, esto permite 
    // comparar y organizar de manera mas rapida
}
