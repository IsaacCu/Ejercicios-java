public class Planificador {
    Proceso cabeza;
    Proceso cola;

    public Planificador(){
        this.cabeza = null;
        this.cola = null;
    }

    public void agregar(Proceso nuevo){
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            cabeza.siguiente = cabeza;
        }
        else{
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
    }

    public void ejecutar(int quantum){
        if (cabeza == null) {
            System.out.println("No hay procesos.");
        }
        else{
            String ordenFinal = "";
            Proceso actual = cabeza;
            Proceso anterior = cola;

            while (cabeza != null) {

                System.out.println("Ejecutando: " + actual.nombre + " PID:" + actual.pid);

                actual.tiempoRestante -= quantum;

                if (actual.tiempoRestante >= 0) {
                    System.out.println("Tiempo restante: " + actual.tiempoRestante);
                    anterior = actual;
                    actual = actual.siguiente;
                }
                else{
                    System.out.println("Proceso terminado: " + actual.nombre);

                    ordenFinal += actual.nombre + " -> ";

                    if (actual == cabeza && actual == cola) {
                        cabeza = null;
                        cola = null;
                        break;
                    }

                    if (actual == cabeza) {
                        cabeza = cabeza.siguiente;
                        cola.siguiente = cabeza;
                        actual = cabeza;
                        anterior = cola;
                    }
                    else if (actual == cola) {
                        anterior.siguiente = cabeza;
                        cola = anterior;
                        actual = cabeza;
                    }
                    else{
                        anterior.siguiente = actual.siguiente;
                        actual = actual.siguiente;
                    }
                }
            }

            System.out.println("\nOrden de finalizacion:");
            System.out.println(ordenFinal);
        }
    }
}