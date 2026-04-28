public class Galeria {
    Foto cabeza;
    Foto cola;
    Foto puntero;

    public Galeria(){
        this.cabeza = null;
        this.cola = null;
        this.puntero = null;
    }
    
    public void imprimir_favorita(Foto fotoimprimir){
        System.out.println("-Titulo: "+fotoimprimir.titulo+". -Fecha: "+fotoimprimir.fecha+" -Favorito: [SI].");
    }

    public void imprimir_nofavorita(Foto fotoimprimir){
        System.out.println("-Titulo: "+fotoimprimir.titulo+". -Fecha: "+fotoimprimir.fecha+" -Favorito: [NO].");
    }

    public boolean esta_Vacia(){
        return cabeza == null;
    }
    public void agregar_foto(Foto nuevafoto){
        if (esta_Vacia()) {
            nuevafoto.siguiente = nuevafoto;
            nuevafoto.anterior = nuevafoto;
            cabeza = nuevafoto;
            cola = nuevafoto;
            puntero = nuevafoto;
        }
        else{
            nuevafoto.siguiente = cabeza;
            nuevafoto.anterior = cola;
            cola.siguiente = nuevafoto;
            cabeza.anterior = nuevafoto;
            cola = nuevafoto;
            puntero = nuevafoto;
        }
    }
    public void mostrar_puntero(){
        if (esta_Vacia()) {
            System.out.println("No existen fotos.");
        }
        else{
            if (es_favorita(puntero)) {
                imprimir_favorita(puntero);
            }
            else{
                imprimir_nofavorita(puntero);
            }
        }
    }

    public void anterior_foto(){
        if (esta_Vacia()) {
            System.out.println("No existen fotos.");
        }
        else{
            System.out.println("foto actual: "+ puntero.titulo);
            puntero = puntero.anterior;
            System.out.println("foto actual: "+ puntero.titulo);
        }
    }

    public void siguiente_foto(){
        if (esta_Vacia()) {
            System.out.println("No existen fotos.");
        }
        else{
            System.out.println("Seleccion anterior: "+ puntero.titulo);
            puntero = puntero.siguiente;
            System.out.println("Seleccion actual: "+ puntero.titulo);
        }
    }

    public void cambiar_favorito(int opcion3){
        if ( esta_Vacia()) {
            System.out.println("No existen Fotos.");
        }
        else{
            switch (opcion3) {
                case 1:
                    puntero.esFavorita = true;
                    break;
                case 2:
                    puntero.esFavorita = false;
                    break;
                default:
                    System.out.println("Opcion Invalida.");
                    break;
            }
            System.out.println("Cambio Realizado.");
        }
    }

    public boolean es_favorita(Foto es){
        return es.esFavorita;
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
            System.out.println("Foto Borrada exitosamente.");
            return;
        }
        System.out.println("No existen Fotos.");
    }

    public void mostrar_fotos(){
        if (esta_Vacia()) {
            System.out.println("La galeria esta vacia.");
        }
        else{
            Foto actual = cabeza;
            do {
                
                if (actual == puntero) {
                    System.out.print("[>>]");
                    if (es_favorita(actual)) {
                        imprimir_favorita(actual);
                    }
                    else{
                        imprimir_nofavorita(actual);
                    }
                }
                else{
                    System.out.print("[  ]");
                    if (es_favorita(actual)) {
                        imprimir_favorita(actual);
                    }
                    else{
                        imprimir_nofavorita(actual);
                    }
                }
                actual = actual.siguiente;
            } while (actual != cabeza);
        }
    }
}
