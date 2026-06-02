public class ArbolJugadores {

    private Jugador raiz;

    public ArbolJugadores() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    // --- INSERTAR ---

    private Jugador insertar(Jugador nodo, int elo, String nombreUsuario, String pais, int partidasJugadas) {
        if (nodo == null)
            return new Jugador(elo, nombreUsuario, pais, partidasJugadas);

        if (elo < nodo.elo)
            nodo.izquierdo = insertar(nodo.izquierdo, elo, nombreUsuario, pais, partidasJugadas);
        else if (elo > nodo.elo)
            nodo.derecho = insertar(nodo.derecho, elo, nombreUsuario, pais, partidasJugadas);
        else
            System.out.println("Ya existe un jugador con ELO " + elo + " — no se insertó.");

        return nodo;
    }

    public void insertar(int elo, String nombreUsuario, String pais, int partidasJugadas) {
        raiz = insertar(raiz, elo, nombreUsuario, pais, partidasJugadas);
    }

    // --- LISTAR EN RANGO ---

    private void listarEnRango(Jugador nodo, int eloMin, int eloMax) {
        if (nodo == null) return;

        if (nodo.elo < eloMin) {
            listarEnRango(nodo.derecho, eloMin, eloMax);
        }
        else if (nodo.elo > eloMax) {
            listarEnRango(nodo.izquierdo, eloMin, eloMax);
        }
        else {
            listarEnRango(nodo.izquierdo, eloMin, eloMax);
            System.out.println("  " + nodo);
            listarEnRango(nodo.derecho, eloMin, eloMax);
        }
    }

    public void listarEnRango(int eloMin, int eloMax) {
        if (isEmpty()) {
            System.out.println("  [ Árbol vacío ]");
            return;
        }

        System.out.println("  Jugadores clasificados:");
        listarEnRango(raiz, eloMin, eloMax);
    }
}