public class ArbolLibros {

    private Libro raiz;

    public ArbolLibros() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    // --- INSERTAR ---

    private Libro insertar(Libro nodo, long isbn, String titulo, String autor, int anioPublicacion) {
        if (nodo == null)
            return new Libro(isbn, titulo, autor, anioPublicacion);

        if (isbn < nodo.isbn)
            nodo.izquierdo = insertar(nodo.izquierdo, isbn, titulo, autor, anioPublicacion);
        else if (isbn > nodo.isbn)
            nodo.derecho = insertar(nodo.derecho, isbn, titulo, autor, anioPublicacion);
        else
            System.out.println("Ya existe un libro con ISBN " + isbn + " — no se insertó.");

        return nodo;
    }

    public void insertar(long isbn, String titulo, String autor, int anioPublicacion) {
        raiz = insertar(raiz, isbn, titulo, autor, anioPublicacion);
    }

    // --- EXISTE ISBN ---

    private boolean existeISBN(Libro nodo, long isbn) {
        if (nodo == null) return false;
        if (isbn == nodo.isbn) return true;

        if (isbn < nodo.isbn)
            return existeISBN(nodo.izquierdo, isbn);
        else
            return existeISBN(nodo.derecho, isbn);
    }

    public boolean existeISBN(long isbn) {
        return existeISBN(raiz, isbn);
    }

    // --- IMPRIMIR CATALOGO ---

    private void imprimirCatalogo(Libro nodo) {
        if (nodo != null) {
            imprimirCatalogo(nodo.izquierdo);
            System.out.println("  " + nodo.isbn + " - " + nodo.titulo + " - " + nodo.autor);
            imprimirCatalogo(nodo.derecho);
        }
    }

    public void imprimirCatalogo() {
        if (isEmpty()) {
            System.out.println("  [ Árbol vacío ]");
            return;
        }

        System.out.println("  Catálogo ordenado por ISBN:");
        imprimirCatalogo(raiz);
    }
}