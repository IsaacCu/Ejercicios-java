public class Galeria {
    Fotografia cabeza;
    Fotografia cola;
    Fotografia actual;

    public Galeria(){
        this.cabeza = null;
        this.cola = null;
        this.actual = null;
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
        actual = cola;
    }

    public void verActual(){
        if (actual == null) {
            System.out.println("No hay fotos.");
        }
        else{
            System.out.println("Nombre del Archivo:"+actual.nombreArchivo+" -Tamaño del archivo:"+actual.tamañoMB+"MB -Resolucion:"+actual.resolucion);
        }
    }

    public void deshacer(){
        if (actual == null || actual.anterior == null) {
            System.out.println("No hay fotos anteriores.");
        }
        else{
            actual = actual.anterior;
            System.out.println("Foto anterior:");
            System.out.println("Nombre del Archivo:"+actual.nombreArchivo+" -Tamaño del archivo:"+actual.tamañoMB+"MB -Resolucion:"+actual.resolucion);
        }
    }

    public void rehacer(){
        if (actual == null || actual.siguiente == null) {
            System.out.println("No hay fotos siguientes.");
        }
        else{
            actual = actual.siguiente;
            System.out.println("Foto siguiente:");
            System.out.println("Nombre del Archivo:"+actual.nombreArchivo+" -Tamaño del archivo:"+actual.tamañoMB+"MB -Resolucion:"+actual.resolucion);
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