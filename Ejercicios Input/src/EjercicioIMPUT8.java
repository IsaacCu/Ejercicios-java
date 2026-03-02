// Ejercicio 8 — Copia real vs referencia
// Pide al usuario 3 calificaciones para llenar notas[]. Crea una copia real 
// en notasRespaldo[] copiando elemento por elemento. Modifica notas[0] con un valor
//  que el usuario ingrese. Muestra ambos arreglos y verifica que notasRespaldo no cambió.

// Datos de entrada: double × 3 notas, double nuevo valor para notas[0]

import java.util.Scanner;

public class EjercicioIMPUT8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] notas= new double[3];

        for(int i=0; i<notas.length;i++){
            System.out.println("Ingrese la nota Nº" + (i+1) + ": ");
            notas[i]= sc.nextDouble();
        }

        double[] notasRespaldo = new double[notas.length];
        for(int i=0; i<notas.length;i++){
            notasRespaldo[i]= notas[i];
        }
        System.out.println("Ingrese un valor ue sustituira la primera nota: ");
        double nuevanota= sc.nextDouble();
        notas[0]=nuevanota;

        System.out.println("Lista de Notas");
        for(int i=0; i<notas.length;i++){
            System.out.println("Nota Nº"+ (i+1)+": " + notas[i]);
        }

        System.out.println("Lista de Notas de respaldo");
        for(int i=0; i<notasRespaldo.length;i++){
            System.out.println("Nota Nº"+ (i+1)+": " + notasRespaldo[i]);
        }
        
        sc.close();
    }
    
}
