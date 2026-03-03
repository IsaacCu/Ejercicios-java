import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] vip={001,002,003};
        double[] montos=new double[5];
        int[] cuentas=new int[5];
    
        for(int i=0; i<cuentas.length;i++){
            System.out.println("Ingrese el numero de cuenta Nº"+(i+1)+": ");
            cuentas[i]=sc.nextInt();
            System.out.println("Monto: ");
            montos[i]=sc.nextInt();
        }
        for(int x=0;x<montos.length;x++){
            if (montos[x]>5000) {
                boolean encontrado= false;
                int inicio=0;
                int fin= vip.length-1;

                while (inicio<=fin) {
                    int medio=inicio+(fin-inicio)/2;

                    if (vip[medio]==montos[x]) {
                        encontrado= true;
                        break;
                    }

                    if (vip[medio]<montos[x]){
                        inicio=medio+1;
                    }
                    else{
                        fin=medio-1;
                    }   
                }
                if (encontrado) {
                    System.out.println("Transaccion "+(x+1) +" exitosa.");
                }
                else{
                    System.out.println("Transaccion "+(x+1) +"Alerta de Fraude.");
                }
            }
            
        }
        sc.close();
    }
}