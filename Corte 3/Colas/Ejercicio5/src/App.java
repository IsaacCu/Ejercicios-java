public class App {
// 5. Fábrica de Pedidos (E-commerce)
// Una tienda en línea recibe pedidos de manera continua. Cada pedido ingresa a una cola central de procesamiento. El sistema de bodega toma los pedidos en orden de llegada para preparar el envío. Si un pedido ya fue cancelado por el cliente, debe ser descartado automáticamente al momento de ser procesado.

// La Clase Pedido (Nodo): Debe contener numeroPedido (String), cliente (String), totalPagar (double) y cancelado (boolean).
// El Problema: La bodega necesita procesar solo los pedidos vigentes. Los cancelados deben ser eliminados sin ser despachados, pero registrados en un conteo.
// Reto: Implementa un método procesarPedidos() que recorra y vacíe la cola. Para cada pedido: si cancelado = true, lo descarta e incrementa un contador de cancelados; si cancelado = false, lo "despacha" imprimiendo sus datos. Al finalizar, muestra el total despachado y el total cancelado.
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
