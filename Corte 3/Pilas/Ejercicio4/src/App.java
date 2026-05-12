import java.util.Scanner;

public class App {
// 4. Farmacia Automatizada (Dispensador Tubo LIFO)
// En una farmacia de alta tecnología, los medicamentos de alta rotación se almacenan en tubos dispensadores verticales. El personal introduce las cajas por la parte superior y las retira de la misma forma (el último lote en llegar es el primero en ser despachado).

// La Clase Medicamento (Nodo): Debe contener nombre (String), lote (String) y diasParaVencer (int).
// El Problema: Por norma de seguridad, no se puede despachar un medicamento si le quedan menos de 10 días para vencer.
// Reto: Implementa un método validarDespacho() que revise el medicamento en el tope. Si está a punto de vencer, debe ser retirado automáticamente y el sistema debe revisar el siguiente. El proceso se repite hasta que el tope sea un medicamento seguro o la pila quede vacía.
    public static void main(String[] args) {
        Dispensador dispensador = new Dispensador();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("=========================================");
            System.out.println("====== Dispensador de Medicamentos ======");
            System.out.println("=========================================");
            System.out.println(" 1- Apilar nuevo medicamento.");
            System.out.println(" 2- Validar despacho..");
            System.out.println(" 3- Salir.");
            System.out.println("=========================================");
            System.out.print(" -Opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("-Ingrese el nombre del medicamento: ");
                    String nombre = sc.next();
                    System.out.println("-Ingrese el lote al que pertenece: ");
                    String lote = sc.next();
                    System.out.println("-Ingrese los dias para vencer: ");
                    int diasParaVencer = sc.nextInt();
                    dispensador.Push(new Medicamento(nombre,lote,diasParaVencer));
                    System.out.println("Medicamento agregado con exito..");
                    break;
                
                case 2:
                    dispensador.ValidarDespacho();
                    break;
                
                case 3:
                    System.out.println("Cerrando programa...");
                    break;
            
                default:
                    System.out.println(" Opcion Invalida.");
                    break;
            }
        } while (opcion!=3);

        sc.close();
    }
}