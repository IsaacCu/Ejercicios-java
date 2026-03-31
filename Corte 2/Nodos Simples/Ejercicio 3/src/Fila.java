public class Fila {
    Vuelo cabeza;

    public Fila(){
        this.cabeza = null;
    }

    public void Agregar_Vuelo(Vuelo nuevoVuelo){
        if (cabeza == null) {
            cabeza = nuevoVuelo;
        } else {
            Vuelo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoVuelo;
        }
    }

    public void insertarAlInicio(Vuelo nuevoVuelo){
        nuevoVuelo.siguiente = cabeza;
        cabeza = nuevoVuelo;
    }

    public void reportarEmergencia(String codigo){
        if (cabeza == null || cabeza.numeroVuelo.equals(codigo)) {
            return;
        }

        Vuelo actual = cabeza;
        Vuelo anterior = null;

        while (actual != null && !actual.numeroVuelo.equals(codigo)) {
            anterior = actual;
            actual = actual.siguiente;
        }

        if (actual == null) {
            return;
        }

        anterior.siguiente = actual.siguiente;
        actual.siguiente = cabeza;
        cabeza = actual;
    }

    public void Imprimir(){
        Vuelo iterando = cabeza;
        System.out.println("=================================================");
        System.out.println("                 Fila de vuelos                  ");
        System.out.println("=================================================");
        while (iterando != null) {
            System.out.println(iterando.numeroVuelo);
            iterando = iterando.siguiente;
        }
    }
}