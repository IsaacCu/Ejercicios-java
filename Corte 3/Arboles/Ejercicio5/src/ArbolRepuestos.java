public class ArbolRepuestos {

    private Repuesto raiz;

    public ArbolRepuestos() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    // --- INSERTAR ---

    private Repuesto insertar(Repuesto nodo, int codigoRef, String descripcion, String marca, int stock) {
        if (nodo == null)
            return new Repuesto(codigoRef, descripcion, marca, stock);

        if (codigoRef < nodo.codigoRef)
            nodo.izquierdo = insertar(nodo.izquierdo, codigoRef, descripcion, marca, stock);
        else if (codigoRef > nodo.codigoRef)
            nodo.derecho = insertar(nodo.derecho, codigoRef, descripcion, marca, stock);
        else
            System.out.println("Ya existe un repuesto con código " + codigoRef + " — no se insertó.");

        return nodo;
    }

    public void insertar(int codigoRef, String descripcion, String marca, int stock) {
        raiz = insertar(raiz, codigoRef, descripcion, marca, stock);
    }

    // --- BACKUP PREORDEN ---

    private void backupPreOrden(Repuesto nodo) {
        if (nodo != null) {
            System.out.println("  " + nodo);
            backupPreOrden(nodo.izquierdo);
            backupPreOrden(nodo.derecho);
        }
    }

    public void backupPreOrden() {
        if (isEmpty()) {
            System.out.println("  [ Árbol vacío ]");
            return;
        }

        System.out.println("  Respaldo del inventario (PreOrden):");
        backupPreOrden(raiz);
    }

    // --- CONTAR HOJAS ---

    private int contarHojas(Repuesto nodo) {
        if (nodo == null) return 0;

        if (nodo.izquierdo == null && nodo.derecho == null)
            return 1;

        return contarHojas(nodo.izquierdo) + contarHojas(nodo.derecho);
    }

    public int contarHojas() {
        return contarHojas(raiz);
    }

    // --- REPORTE DE REPUESTOS UNICOS ---

    public void reporteRepuestosUnicos() {
        int cantidad = contarHojas();

        System.out.println("Cantidad de repuestos sin variantes relacionadas: " + cantidad);
    }
}