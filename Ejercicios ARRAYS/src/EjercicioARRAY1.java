// El Cajero del Supermercado (Inventario)
// Un cajero escanea un producto con el código de barras 770123. El sistema tiene 
// un arreglo desordenado con los códigos de los productos disponibles en la estantería actual.

// El Problema: Debes recorrer la lista para verificar si el producto existe y en qué 
// posición de la estantería se encuentra.

// Algoritmo a usar: Búsqueda Lineal. Es el ideal porque los productos en la estantería
//  no tienen un orden numérico específico.

import java.util.Scanner;

public class EjercicioARRAY1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] codigosProductos = {"458912","112345","998877","770123","334455","556677","223344"};
        String codigo ="770123";
        boolean existe=false;
        int ubicacion=0;

        for(int i=0;i<codigosProductos.length;i++){

            if(codigosProductos[i].equalsIgnoreCase(codigo)) {
                existe=true;
                ubicacion=i;
                break;
            }
                
        }
        if (existe) {
            System.out.println("El producto si se encuentra en stock.");
            System.out.println("Su posicion indice es: "+ubicacion);
        }
        else{
            System.out.println("El producto no se encuentra en Stock.");
        }

        sc.close();

    }
    
}
