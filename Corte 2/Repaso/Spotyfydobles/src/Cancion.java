public class Cancion {
    String titulo;
    String artista;
    int duracion;
    String genero;
    Cancion anterior;
    Cancion siguiente;
    public Cancion(String titulo,String artista,int duracion,String genero){
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
        this.genero = genero;
        this.anterior = null;
        this.siguiente = null;
    }
}
