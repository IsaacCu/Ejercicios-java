
public class ListaReproduccion {
    Cancion cabeza;
    Cancion cola;
    Cancion reproduciendo;

    public ListaReproduccion(){
        this.cabeza = null;
        this.cola = null;
        this.reproduciendo = null;
    }

    public boolean estaVacia(){
        if ( cabeza == null) {
            return true;
        }
        return false;
    }
    public void agregar_Inicio(Cancion nuevacaCancion){
        if (estaVacia()) {
            nuevacaCancion.anterior = nuevacaCancion;
            nuevacaCancion.siguiente = nuevacaCancion;
            cabeza = nuevacaCancion;
            cola = nuevacaCancion;
            reproduciendo = nuevacaCancion;
        }
        else{
            nuevacaCancion.anterior = cola;
            nuevacaCancion.siguiente = cabeza;
            cola.siguiente=nuevacaCancion;
            cabeza.anterior = nuevacaCancion;
            cabeza = nuevacaCancion;
            reproduciendo = nuevacaCancion;
        }
    }

    public void agregar_Final(Cancion nuevacaCancion){
        if (estaVacia()) {
            nuevacaCancion.anterior = nuevacaCancion;
            nuevacaCancion.siguiente = nuevacaCancion;
            cabeza = nuevacaCancion;
            cola = nuevacaCancion;
            reproduciendo = nuevacaCancion;
        }
        else{
            nuevacaCancion.anterior = cola;
            nuevacaCancion.siguiente = cabeza;
            cola.siguiente=nuevacaCancion;
            cabeza.anterior = nuevacaCancion;
            cola = nuevacaCancion;
            reproduciendo = nuevacaCancion;
        }
    }

    public void imprimir(Cancion cancion){
        int minutos = (cancion.duracion)/60;
        int segundos = (cancion.duracion) % 60;
        System.out.println("-Titulo: "+cancion.titulo+" -Artista: "+cancion.artista+" -Duracion: "+minutos+":"+segundos+" -Genero: "+cancion.genero);
    }

    public void mostrar_Lista(){
        Cancion actual = cabeza;
        if (estaVacia()) {
            System.out.println("Lista de reproduccion vacia.");
        }
        else{
            do {
                if (actual == reproduciendo) {
                    System.out.print("[>]");
                    imprimir(actual);
                }
                else{
                    System.out.print("[ ]");
                    imprimir(actual);
                }
            } while (actual != cabeza);
        }
    }

    public void reproducirSiguiete(){
        if (estaVacia()) {
            System.out.println("Lista de reproduccion vacia.");
        }
        else{
            System.out.println("Reproducion anterior: "+reproduciendo);
            reproduciendo = reproduciendo.siguiente;
            System.out.println("Reproducion actual: "+reproduciendo);
        }
    }
}
