public class Documento {
    String NombreArchivo;
    String Usuario;
    int NumeroPaginas;
    boolean EsColor;
    Documento Siguiente;

    public Documento(String nombre, String usuario, int paginas, boolean escolor) {
        NombreArchivo = nombre;
        Usuario = usuario;
        NumeroPaginas = paginas;
        EsColor = escolor;
        Siguiente = null;
    }
}
