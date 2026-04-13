public class Reproductor {
    Cancion cabeza;
    Cancion cola;
    Cancion actual;

    public Reproductor(){
        this.cabeza = null;
        this.cola = null;
        this.actual = null;
    }

    public void agregar_cancion(Cancion nueva){
        if (cabeza == null) {
            cabeza = nueva;
            cola = nueva;
            actual = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            cola = nueva;
        }
    }

    public void mostrar_actual(){
        if (actual == null) {
            System.out.println("No hay canciones");
        } else {
            System.out.println("Reproduciendo: " + actual.titulo + 
                               " - " + actual.artista + 
                               " (" + actual.duracion + "s)");
        }
    }

    public void saltarAdelante(){
        if (actual == null) {
            System.out.println("No hay canciones");
        } else if (actual.siguiente == null) {
            System.out.println("No hay siguiente canción");
        } else {
            actual = actual.siguiente;
            mostrar_actual();
        }
    }

    public void saltarAtras(){
        if (actual == null) {
            System.out.println("No hay canciones");
        } else if (actual.anterior == null) {
            System.out.println("No se puede retroceder");
        } else {
            actual = actual.anterior;
            mostrar_actual();
        }
    }
}