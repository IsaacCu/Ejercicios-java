public class Galeria {
    Fotografia cabeza;
    Fotografia cola;

    public Galeria(){
        this.cabeza = null;
        this.cola = null;
    }
    public void agregar(Fotografia nuevafotografia){
        if (cabeza == null) {
            cabeza = nuevafotografia;
            cola = nuevafotografia;
        }
        else{
            cola.siguiente = nuevafotografia;
            nuevafotografia.anterior = cola;
            cola = nuevafotografia;
        }
    }

    public void recorrer_galeria(){
        if (cabeza == null) {
            System.out.println("La galeria se encuentra vacia.");
        }
        else{
            Fotografia actual = cabeza;
            while (actual != null) {
                System.out.println("Nombre del Archivo:"+actual.nombreArchivo+" -Tamaño del archivo:"+actual.tamañoMB+"MB -Resolucion:"+actual.resolucion);
                actual = actual.siguiente;
            }
            System.out.println("--- Fin de la galeria, volviendo al inicio.. ---");

            actual = cola;
            while (actual != null) {
                System.out.println("- Nombre del Archivo:"+actual.nombreArchivo+", Tamaño del archivo:"+actual.tamañoMB+"MB , Resolucion:"+actual.resolucion);
                actual = actual.anterior;
            }
            System.out.println("--- Fin del recorrido. ---");
        }
    }
}
