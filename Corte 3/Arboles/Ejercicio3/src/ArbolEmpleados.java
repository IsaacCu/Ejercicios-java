public class ArbolEmpleados {

    private Empleado raiz;

    public ArbolEmpleados() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    // --- INSERTAR ---

    private Empleado insertar(Empleado nodo, long cedula, String nombreCompleto, String cargo, double salario) {
        if (nodo == null)
            return new Empleado(cedula, nombreCompleto, cargo, salario);

        if (cedula < nodo.cedula)
            nodo.izquierdo = insertar(nodo.izquierdo, cedula, nombreCompleto, cargo, salario);
        else if (cedula > nodo.cedula)
            nodo.derecho = insertar(nodo.derecho, cedula, nombreCompleto, cargo, salario);
        else
            System.out.println("Ya existe un empleado con cédula " + cedula + " — no se insertó.");

        return nodo;
    }

    public void insertar(long cedula, String nombreCompleto, String cargo, double salario) {
        raiz = insertar(raiz, cedula, nombreCompleto, cargo, salario);
    }

    // --- BUSCAR MINIMO ---

    public void buscarMinimo() {
        if (isEmpty()) {
            System.out.println("  [ Árbol vacío ]");
            return;
        }

        Empleado actual = raiz;

        while (actual.izquierdo != null)
            actual = actual.izquierdo;

        System.out.println("Empleado con menor cédula:");
        System.out.println(actual);
    }

    // --- BUSCAR MAXIMO ---

    public void buscarMaximo() {
        if (isEmpty()) {
            System.out.println("  [ Árbol vacío ]");
            return;
        }

        Empleado actual = raiz;

        while (actual.derecho != null)
            actual = actual.derecho;

        System.out.println("Empleado con mayor cédula:");
        System.out.println(actual);
    }

    // --- ALTURA Y HOJAS ---

    private int altura(Empleado nodo) {
        if (nodo == null) return -1;

        return 1 + Math.max(altura(nodo.izquierdo), altura(nodo.derecho));
    }

    public int altura() {
        return altura(raiz);
    }

    private int contarHojas(Empleado nodo) {
        if (nodo == null) return 0;

        if (nodo.izquierdo == null && nodo.derecho == null)
            return 1;

        return contarHojas(nodo.izquierdo) + contarHojas(nodo.derecho);
    }

    public int contarHojas() {
        return contarHojas(raiz);
    }

    // --- REPORTE DE EFICIENCIA ---

    public void reporteEficiencia() {
        System.out.println("Altura del árbol:  " + altura());
        System.out.println("Nodos hoja:        " + contarHojas());
    }
}