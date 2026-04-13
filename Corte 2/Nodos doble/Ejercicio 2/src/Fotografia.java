public class Fotografia {
    String nombreArchivo;
    double tamañoMB;
    String resolucion;

    Fotografia anterior;
    Fotografia siguiente;

    public Fotografia(String nombreArchivo, double tamañoMB, String resolucion){
        this.nombreArchivo = nombreArchivo;
        this.tamañoMB = tamañoMB;
        this.resolucion = resolucion;
        this.anterior = null;
        this.siguiente = null;
    }
}