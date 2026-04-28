public class Capa {
    String nombre;
    boolean activo;
    String tipo;

    Capa siguiente;
    Capa anterior;
    public Capa(String nombre,boolean activo, String tipo){
        this.nombre = nombre;
        this.activo = activo;
        this.tipo = tipo;
        this.siguiente = null;
        this.anterior = null;
    }
}
