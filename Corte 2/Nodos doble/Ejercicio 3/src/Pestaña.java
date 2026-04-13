public class Pestaña {
    String tituloPagina;
    String url;
    String horaApertura;

    Pestaña anterior;
    Pestaña siguiente;

    public Pestaña(String titulo, String url, String hora){
        this.tituloPagina = titulo;
        this.url = url;
        this.horaApertura = hora;
        this.anterior = null;
        this.siguiente = null;
    }
}
