// Ejercicio 7 — Arreglo compartido (inventario)
// Pide al usuario 4 precios para llenar un arreglo precios[]. Crea 
// preciosAuditoria = precios (misma referencia). Pide al usuario el índice y
//  el nuevo precio para hacer una corrección desde preciosAuditoria. Muestra ambos
//  arreglos y verifica que el cambio se refleja en los dos.

// Datos de entrada: double × 4 precios, int índice, double nuevo precio

import java.util.Scanner;

public class EjercicioIMPUT7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] precios = new double[4];

        for(int i=0; i<precios.length;i++){
            System.out.println("Ingresa el precio Nº"+(i+1)+": ");
            precios[i] = sc.nextDouble();
        }
        

        double preciosAuditoria[] = precios;
        System.out.println("Ingrese el indice del precio que desea cambiar: ");
        int indice = sc.nextInt();
        System.out.println("Ingrese el nuevo precio: ");
        double nuevo_precio =sc.nextDouble();
        preciosAuditoria[indice]= nuevo_precio;

        System.out.println("Lista de precios: " );

        for(int i=0; i<precios.length;i++){
            System.out.println("Producto Nº"+ (i+1)+": " + precios[i]);
        }

        System.out.println("Lista de preciosAuditoria: " );
        for(int i=0; i<precios.length;i++){
            System.out.println("Producto Nº"+ (i+1)+": " + preciosAuditoria[i]);
        }

        sc.close();
    }
}
