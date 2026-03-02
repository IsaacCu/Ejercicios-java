// 4. Control de Acceso (Gimnasio)
// Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad.
//  La lista está ordenada de menor a mayor.

// El Problema: Cuando un socio digita su código, el sistema debe validar si el código está 
// en la lista de "pagos al día". Si no está, se le niega la entrada.

// Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos en una lista
//  que ya está organizada.

public class EjercicioARRAY4 {
    public static void main(String[] args){
        int[] codigosPagosAlDia = {
            1021, 1050, 1103, 1155, 1200,
            1258, 1304, 1350, 1402, 1456,
            1500, 1555, 1601, 1650, 1703,
            1750, 1808, 1855, 1900, 1954,
            2001, 2050, 2100, 2155, 2203
        };

        int busqueda=1601;
        int inicio=0;
        int fin= codigosPagosAlDia.length-1;
        int ubicacionEncontrada=-1;

        while (inicio<fin) {
            int medio=inicio+(fin-inicio)/2;

            if (codigosPagosAlDia[medio]==busqueda) {
                ubicacionEncontrada=medio;
                break;
            }

            if (codigosPagosAlDia[medio]<busqueda){
                inicio=medio+1;
            }
            else{
                fin=medio-1;
            }
        }

        if (ubicacionEncontrada != -1) {
            System.out.println("El cliente esta al dia con su pago.");
            System.out.println("ubicacion:"+ubicacionEncontrada);
        }
        else{
            System.out.println("El cliente no se encuentra al dia con su pago.");
        }


        
    }


}
