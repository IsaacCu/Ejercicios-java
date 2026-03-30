// 2. Buscador de Cédulas (Base de Datos Bancaria)
// Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente 
// por su número de cédula o ID.

// El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar
//  sus datos de la manera más rápida posible (en pocos pasos).

// Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, este algoritmo 
// permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso.

public class EjercicioARRAY2 {
    public static void main(String[] args){
        // Arreglo de 100 clientes ordenados ascendentemente
        int[] clientes = new int[100];

        // Llenamos el arreglo con números de cédula ordenados
        int cedulaInicial = 100000;
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = cedulaInicial + i; // Siempre va aumentando
        }

        int cedula = 100033;
        int inicio = 0;
        int fin = clientes.length- 1;
        int pasos=0;
        int ubicacionEncontrada=-1;

        while (inicio<=fin) {

            pasos++;
            int mitad=inicio+(fin-inicio)/2;
            if (clientes[mitad]==cedula) {
                ubicacionEncontrada=mitad;
                break;
            }

            if (clientes[mitad]<cedula) {
                inicio=mitad+1;
            }

            else {
                fin=mitad-1;
            } 
        }

        if (ubicacionEncontrada != -1) {
            System.out.println("Se encontraron los datos");
            System.out.println("Posición en el sistema: " + ubicacionEncontrada);
            System.out.println("Eficiencia: encontrado en " + pasos + " divisiones.");
        } else {
            System.out.println("El código " + cedula + " no existe en la base de datos.");
            System.out.println("Se agotaron los " + pasos + " pasos de búsqueda.");
        }
    }
}
