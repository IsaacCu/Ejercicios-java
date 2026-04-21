public class App {
// 4. Gestión de Mesas en Restaurante (Lista de Espera Circular)
// Un restaurante popular tiene un sistema de lista de espera. Cuando una mesa se libera, 
// el siguiente grupo en espera ocupa el turno y pasa al final del ciclo por si quiere pedir 
// la carta nuevamente (para clientes VIP).

// La Clase Grupo (Nodo): Debe contener nombreReserva (String), numeroDPersonas (int), esVip
//  (boolean) y minutosEsperando (int).
// El Problema: Los grupos normales se atienden y salen de la lista. Los grupos VIP, al ser 
// atendidos, vuelven al final de la lista circular para una segunda ronda de atención. El sistema
//  debe atender un grupo por turno.
// Reto: Implementa el método atenderSiguiente() que tome el grupo de la cabeza, muestre su 
// información, y si esVip == true, lo reinserté al final; si no, lo elimine. Muestra el estado
//  de la lista después de cada atención. Llama al método 6 veces para simular la dinámica del
//  restaurante.
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
