
public class EditorCapas {
    Capa cabeza;
    Capa cola;
    Capa puntero;
    public EditorCapas(){
        this.cabeza = null;
        this.cola = null;
        this.puntero = null;
    }
    
    public void imprimir_Activa(Capa capaimprimir){
        System.out.println("-Nombre: "+capaimprimir.nombre+". -Activo: {✓}. -Tipo: "+capaimprimir.tipo);
    }

    public void imprimir_Inactiva(Capa capaimprimir){
        System.out.println("-Nombre: "+capaimprimir.nombre+". -Activo: { }. -Tipo: "+capaimprimir.tipo);
    }

    public boolean esta_Vacia(){
        return cabeza == null;
    }
    public void agregar_capa(Capa nuevacapa){
        if (esta_Vacia()) {
            nuevacapa.siguiente = nuevacapa;
            nuevacapa.anterior = nuevacapa;
            cabeza = nuevacapa;
            cola = nuevacapa;
            puntero = nuevacapa;
        }
        else{
            nuevacapa.siguiente = cabeza;
            nuevacapa.anterior = cola;
            cola.siguiente = nuevacapa;
            cabeza.anterior = nuevacapa;
            cola = nuevacapa;
            puntero = nuevacapa;
        }
    }
    public void mostrar_puntero(){
        if (esta_Vacia()) {
            System.out.println("No existen Capas.");
        }
        else{
            if (es_Visible()) {
                System.out.println("-Nombre: "+puntero.nombre+". -Activo: {✓}. -Tipo: "+puntero.tipo);
            }
            else{
                System.out.println("-Nombre: "+puntero.nombre+". -Activo: { }. -Tipo: "+puntero.tipo);
            }
        }
    }

    public void subir_Capa(){
        if (esta_Vacia()) {
            System.out.println("No existen capas.");
        }
        else{
            System.out.println("Capa actual: "+ puntero.nombre);
            puntero = puntero.anterior;
            System.out.println("Capa actual: "+ puntero.nombre);
        }
    }

    public void bajar_Capa(){
        if (esta_Vacia()) {
            System.out.println("No existen capas.");
        }
        else{
            System.out.println("Capa actual: "+ puntero.nombre);
            puntero = puntero.siguiente;
            System.out.println("Capa actual: "+ puntero.nombre);
        }
    }

    public void cambiar_Visibilidad(int opcion3){
        if ( esta_Vacia()) {
            System.out.println("No existen capas.");
        }
        else{
            switch (opcion3) {
                case 1:
                    puntero.activo = true;
                    break;
                case 2:
                    puntero.activo = false;
                    break;
                default:
                    System.out.println("Opcion Invalida.");
                    break;
            }
            System.out.println("Cambio Realizado.");
        }
    }

    public boolean es_Visible(){
        return puntero.activo = true;
    }

    public void eliminar_Actual(){
        while (puntero != null) {
            if (puntero == cabeza && puntero == cola) {
                cabeza = null;
                cola = null;
                puntero = null;
            }
            else if (puntero == cabeza) {
                puntero.anterior.siguiente = puntero.siguiente;
                puntero.siguiente.anterior = puntero.anterior;
                cabeza = puntero.siguiente;
                puntero = puntero.siguiente;
            }
            else if (puntero == cola) {
                puntero.anterior.siguiente = puntero.siguiente;
                puntero.siguiente.anterior = puntero.anterior;
                cola = puntero.anterior;
                puntero = puntero.siguiente;
            }
            else{
                puntero.anterior.siguiente = puntero.siguiente;
                puntero.siguiente.anterior = puntero.anterior;
                puntero = puntero.siguiente;
            }
            System.out.println("Capa Borrada exitosamente.");
            return;
        }
        System.out.println("No existen Capas.");
    }

    public void mostrar_Capas(){
        if (esta_Vacia()) {
            System.out.println("El historial esta vacio.");
        }
        else{
            Capa actual = cabeza;
            do {
                
                if (actual == puntero) {
                    System.out.print(">>");
                    if (es_Visible()) {
                        imprimir_Activa(actual);
                    }
                    else{
                        imprimir_Inactiva(actual);
                    }
                }
                else{
                    if (es_Visible()) {
                        imprimir_Activa(actual);
                    }
                    else{
                        imprimir_Inactiva(actual);
                    }
                }
                actual = actual.siguiente;
            } while (actual != cabeza);
        }
    }
}
