import java.util.Scanner;

public class Repasop2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de intentos que tuvo: ");
        int corredores = sc.nextInt();
        double[] participantes = new double[corredores];
        double suma=0;
        for(int i = 0;i<participantes.length; i++){
            System.out.println("Ingrese el puntaje del intento "+ (i+1)+": ");
            double tiempo= sc.nextDouble();
            participantes[i]= tiempo;
            suma+=tiempo;
        }

        int n = participantes.length;
        for (int i = 1; i < n; i++) {
            double clave = participantes[i];
            int j = i - 1;

            while (j >= 0 && participantes[j] < clave) {
                participantes[j + 1] = participantes[j];
                j = j - 1;  
            }
            participantes[j + 1] = clave; 
        }

        System.out.println(" -- Lista Ordenada --");
        Tabla(participantes);

        double prom=suma/2;
        System.out.println("Promedio de puntajes: "+prom);
        sc.close();

        System.out.println(" -- Ingresa un puntaje para buscar -- ");
        int puntajeBuscar= sc.nextInt();
        for(int i=0; i<participantes.length;i++){
            if (participantes[i]==puntajeBuscar) {
                System.out.println("el puntaje "+puntajeBuscar+" se encuentra en el "+(i+1)+"º lugar de la tabla.");
            }
        }
        
    }
    public static void Tabla(double[] args){
        for(int i=0;i<args.length;i++){
            System.out.println((i+1)+"º Lugar:"+args[i]);
        }
    }
}
