public class HistorialComandos {
    Comando cabeza;
    Comando cola;
    Comando cursor;
    public HistorialComandos(){
        this.cabeza = null;
        this.cola = null;
        this.cursor = null;
    }

    public void imprimir(Comando imprimir){
        System.out.println("Comando Actual: Texto: "+imprimir.texto+". - Operacion Exitosa: "+imprimir.exitosa+". - Path: "+imprimir.path+".");
    }

    public void agregar(Comando nuevoComando){
        if (cabeza == null) {
            nuevoComando.siguiente = nuevoComando;
            nuevoComando.anterior = nuevoComando;
            cabeza = nuevoComando;
            cola = nuevoComando;
            cursor = nuevoComando;
        }
        else{
            cola.siguiente=nuevoComando;
            nuevoComando.anterior = cola;
            nuevoComando.siguiente = cabeza;
            cabeza.anterior = nuevoComando;
            cola = nuevoComando;
            cursor = nuevoComando;
        }
    }

    public void arriba(){
        if ( cursor == null) {
            System.out.println( "No existen comandos");
        }
        else{
            System.out.print("Cursor actual:");
            mostrarCursor();
            cursor = cursor.anterior;
            System.out.print("Cursor actual:");
            mostrarCursor();
        }
    }

    public void abajo(){
        if ( cursor == null) {
            System.out.println( "No existen comandos");
        }
        else{
            System.out.print("Cursor actual:");
            mostrarCursor();
            cursor = cursor.siguiente;
            System.out.print("Cursor actual:");
            mostrarCursor();
        }
    }

    public void mostrarCursor(){
        if (cursor == null) {
            System.out.println("No existen comandos");
        }
        else{
            this.imprimir(cursor);
        }
    }

    public void eliminar_Actual(){
        while (cursor != null) {
            if (cursor == cabeza && cursor == cola) {
                cabeza = null;
                cola = null;
                cursor = null;
            }
            else if (cursor == cabeza) {
                cursor.anterior.siguiente = cursor.siguiente;
                cursor.siguiente.anterior = cursor.anterior;
                cabeza = cursor.siguiente;
                cursor = cursor.siguiente;
            }
            else if (cursor == cola) {
                cursor.anterior.siguiente = cursor.siguiente;
                cursor.siguiente.anterior = cursor.anterior;
                cola = cursor.anterior;
                cursor = cursor.siguiente;
            }
            else{
                cursor.anterior.siguiente = cursor.siguiente;
                cursor.siguiente.anterior = cursor.anterior;
                cursor = cursor.siguiente;
            }
            System.out.println("Comando Borrado exitosamente.");
            return;
        }
        System.out.println("No existen comandos.");

    }

    public void mostrar_historial(){
        if (cabeza == null) {
            System.out.println("El historial esta vacio.");
        }
        else{
            Comando actual = cabeza;
            do {
                
                if (actual == cursor) {
                    System.out.print(">>");
                    imprimir(actual);
                }
                else{
                    imprimir(actual);
                }
                actual = actual.siguiente;
            } while (actual != cabeza);

        }
    }
}
