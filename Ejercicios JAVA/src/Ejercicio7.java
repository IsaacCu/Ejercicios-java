// Ejercicio 7 — Inventario compartido
// Un almacén tiene un arreglo con el stock de 5 productos. El sistema de ventas y el sistema de reportes apuntan al mismo arreglo.

// Crea el arreglo stockAlmacen con valores iniciales.
// Asigna stockReportes = stockAlmacen.
// Simula una venta reduciendo el stock de un producto desde stockReportes.
// Muestra que stockAlmacen también cambió y explica en comentarios por qué.
public class Ejercicio7 {
    

    public static void main(String[] args) {
        int[] stockAlmacen = {5,2,4};
        int[] stockReportes = stockAlmacen;

        System.out.println("Stock de Almacen: " + stockAlmacen[0]);
        System.out.println("Stock de Reporte: "+ stockReportes[0]);
        System.out.println("-- Se reporta una venta--");
        stockReportes[0]-=1;

        System.out.println("Stock de Almacen: " + stockAlmacen[0]);
        System.out.println("Stock de Reporte: "+ stockReportes[0]);

        // en este caso lo que le ocurra a una variable tambien le ocurrio a la otra
        //esto se debe a que al ser objetos y igualarse empieza a depender uno del otro
        //basicamente lps cambios que tenga una variable tambian las tendra la otra.
    }
    
}
