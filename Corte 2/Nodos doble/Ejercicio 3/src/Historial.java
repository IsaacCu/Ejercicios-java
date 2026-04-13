
public class Historial {
    Pestaña cabeza;
    Pestaña cola;
    public Historial(){
        this.cabeza = null;
        this.cola = null;
    }

    public void agregar_pestaña(Pestaña nuevapestaña){
        if ( cabeza == null) {
            cabeza = nuevapestaña;
            cola = nuevapestaña;            
        }
        else{
            cola.siguiente = nuevapestaña;
            nuevapestaña.anterior = cola;
            cola = nuevapestaña;
        }
    }

    public void imprimir(){
        Pestaña actual = cabeza;
        if (actual == null) {
                System.out.println("No hay pestañas abiertas");
                return;
            }
        while (actual != null) {
            System.out.println("Titulo:"+actual.tituloPagina+"; URL: "+actual.url+"; Hora: "+actual.horaApertura);
            actual = actual.siguiente;
        }

    }

    public void cerrar_Pestaña(String url){
    Pestaña actual = cabeza;
    while (actual != null) {
        if (actual.url.equals(url)) {
            if (actual == cabeza && actual == cola) {
                cabeza = null;
                cola = null;
            }
            else if (actual == cabeza) {
                cabeza = actual.siguiente;
                cabeza.anterior = null;
            }
            else if (actual == cola) {
                cola = actual.anterior;
                cola.siguiente = null;
            }
            else {
                actual.anterior.siguiente = actual.siguiente;
                actual.siguiente.anterior = actual.anterior;
            }

            System.out.println("Pestaña cerrada correctamente.");
            return;
        }
        actual = actual.siguiente;
    }
    System.out.println("No se encontró la pestaña.");
}
}
