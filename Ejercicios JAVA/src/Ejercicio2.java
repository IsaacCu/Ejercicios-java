// Ejercicio 2 — Calculadora de una tienda
// Una tienda de barrio vende productos al por menor. El cajero necesita calcular:

// Precio unitario de un producto (double)
// Cantidad comprada (int)
// Descuento aplicado en porcentaje (double)
// Total a pagar después del descuento
// Declara las variables, realiza el cálculo y muestra el resultado por consola.

public class Ejercicio2 {
    public static void main(String[] args) {
        
        System.out.println("==== Calculadora de una tienda ====");

        Double precio;
        int cantidades;
        Double descuento=0.2;
        Double subtotal;
        Double total;
        double resta;


        precio=2000.0;
        cantidades=10;
        subtotal=precio*cantidades;
        resta=subtotal*descuento;
        total=subtotal-resta;


        System.out.println("Precio:" + precio);
        System.out.println("Unidades:" + cantidades);
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Descuento:" + descuento*100 + "%");
        System.out.println("Total:" + total);
    }
    
}
