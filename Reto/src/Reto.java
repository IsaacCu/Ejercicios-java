import java.util.Scanner;

public class Reto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] precios= new double[5];
        double subto =0;
        double mayor= 0;
        double total=0;
    for (int i=0; i<precios.length;i++){
        System.out.println("Ingrese el precio del producto Nº" + (i+1) + ":" );
        precios[i]= sc.nextDouble();
    }

    for (int f=0;f<precios.length;f++){
        subto += precios[f];
    }
    for (int h=0;h<precios.length;h++){
        if (mayor<precios[h]){
            mayor = precios[h];
        }
    }
    if (subto>20000) {
        System.out.println("¡¡Tienes un descuento de 2000!!");
        total= subto-2000;
    }
    else{
        total=subto;
    }
    System.out.println("total a pagar:"+ total);
    }
}