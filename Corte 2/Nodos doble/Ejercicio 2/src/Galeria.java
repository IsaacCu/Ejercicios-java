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
}
