public class Ejercicio2 {
    public static void main(String[] args) {
        //Ejercicio 2 — Calculadora de una tienda
        //Una tienda de barrio vende productos al por menor.
        //El cajero necesita calcular:
        System.out.println("==== Calculadora de una tienda ====");

        Double precio;
        int cantidades;
        Double descuento;
        Double subtotal;
        Double total;


        precio=2000.0;
        cantidades=10;
        subtotal=precio*cantidades;
        descuento=subtotal*0.2;
        total=subtotal-descuento;


        System.out.println("Precio:" + precio);
        System.out.println("Unidades:" + cantidades);
        System.out.println("Subtotal:" + subtotal);
        System.out.println("Descuento:" + descuento);
        System.out.println("Total:" + total);
    }
    
}
