import java.util.Scanner;

public class Repasop3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("-- Registro de notas --"); 
        System.out.println("Ingrese el numero de notas: ");
        int numeronotas = sc.nextInt();
        double[] notas = new double[numeronotas];
        for(int i = 0;i<notas.length; i++){
            System.out.println("Ingrese la nota "+ (i+1)+": ");
            double nota= sc.nextDouble();
            notas[i]= nota;
        }
        System.out.println("-- INFORME ACADEMICO --");

        double min=notas[0];
        double max=0;
        for(int i=0; i<notas.length; i++){
            if (i>max) {
                max=i;
            }
            else if (i<min) {
                min=i;
            }
        }
        System.out.println("La nota mas ALTA fue: "+max);
        System.out.println("La nota mas BAJA fue: "+min);

        System.out.println("-- LISTA DE NOTAS ORDENADAS --");

        int n= notas.length;
        for(int j=0;j < n-1;j++){
            int minIndx= j;
            for(int k = j+1; k < n ;k++){
                if (notas[k]<notas[minIndx]) {
                    minIndx=k;
                }

            double temp = notas[minIndx];
            notas[minIndx] = notas[j];
            notas[j] = temp;
            }
        }

        for(int i=0;i<notas.length;i++){
            System.out.println();
        }




        sc.close();
    }
}
