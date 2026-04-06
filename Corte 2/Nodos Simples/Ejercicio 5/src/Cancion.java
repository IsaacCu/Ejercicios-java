public class Cancion {
    String titulo;
    String artista;
    int duracion;
    String genero;
    Cancion siguiente;

    public Cancion(String titulo, String artista, int duracion, String genero){
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
        this.siguiente = null;
    }
}
