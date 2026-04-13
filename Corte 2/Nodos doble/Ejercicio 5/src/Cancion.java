public class Cancion {
    String titulo;
    String artista;
    int duracion;

    Cancion anterior;
    Cancion siguiente;

    public Cancion(String titulo, String artista, int duracion){
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.anterior = null;
        this.siguiente = null;
    }
}