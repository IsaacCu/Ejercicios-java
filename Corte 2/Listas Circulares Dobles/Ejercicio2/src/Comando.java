public class Comando {
    String texto;
    boolean exitosa;
    String path;

    Comando siguiente;
    Comando anterior;

    public Comando(String texto,boolean exitosa, String path){
        this.texto = texto;
        this.exitosa = exitosa;
        this.path = path;
        this.siguiente = null;
        this.anterior = null;
    }
}
