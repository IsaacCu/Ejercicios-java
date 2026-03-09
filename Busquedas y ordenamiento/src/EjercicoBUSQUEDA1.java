// 1. El Podio de la Competencia
// Algoritmo obligatorio: Ordenamiento por Selección (Selection Sort)

// Contexto: Se ha realizado una carrera de 100 metros planos y el comité olímpico
//  necesita determinar quiénes ganaron las medallas.
// Detalle del ejercicio: El programa debe solicitar primero cuántos corredores participaron
//  (ej. 5 a 10). Luego, debe pedir el tiempo en segundos (con decimales) de cada corredor.
// Lógica de Selección: El algoritmo debe buscar el tiempo más bajo (el más rápido) en cada
//  iteración y colocarlo al inicio.
// Resultado esperado: El programa debe imprimir el arreglo totalmente ordenado y,
//  adicionalmente, mostrar un mensaje claro indicando quién obtuvo el Oro (1er lugar), Plata 
// (2do lugar) y Bronce (3er lugar).

import java.util.Scanner;

public class EjercicoBUSQUEDA1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de corredores que Participaron: ");
        int corredores = sc.nextInt();
        double[] Participantes = new double[corredores];

        for(int i = 0;i<Participantes.length; i++){
            System.out.println("Ingrese el timepo del jugador "+ (i+1)+": ");
            double tiempo= sc.nextDouble();
            Participantes[i]= tiempo;
        }

        //Imprimir
        System.out.println("Original");
        imprimirArreglo(Participantes);
        System.out.println(Participantes[2]);

        //Algoritmo de busqueda
        int n= Participantes.length;
        for(int j=0;j < n-1;j++){
            int minIndx= j;
            for(int k = j+1; k < n ;k++){
                if (Participantes[k]<Participantes[minIndx]) {
                    minIndx=k;
                }

            double temp = Participantes[minIndx];
            Participantes[minIndx] = Participantes[j];
            Participantes[j] = temp;
            }
        }


        System.out.println("Ordenada: ");
        imprimirArreglo(Participantes);
        System.out.println(Participantes[2]);
        sc.close();

        System.out.println("Medalla de Oro; tiempo: "+Participantes[0]);
        System.out.println("Medalla de Plata; tiempo: "+Participantes[1]);
        System.out.println("Medalla de Bronce; tiempo: "+Participantes[2]);


    }
    public static void imprimirArreglo(double[] arr) {
        for (double d : arr) {
            System.out.print("[" + d + "] ");
        }
        System.out.println();
    }
}
