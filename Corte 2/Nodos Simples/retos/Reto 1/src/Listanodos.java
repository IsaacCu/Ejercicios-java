public class Listanodos {
    Nodos cabeza;
    public Listanodos(){
        this.cabeza = null;
    }
    public void Agregarnodos(Nodos nuevonodo){
        if (cabeza == null) {
            cabeza = nuevonodo;
        }
        else{
            Nodos actual = cabeza;
            while (actual.sigueinte != null) {
                actual = actual.sigueinte;
            }
            actual.sigueinte = nuevonodo;
        }
    }
    public int contarnodos(){
        int totalnodos = 0;
        Nodos actual = cabeza;
        while (actual != null) {
            totalnodos+=1;
            actual= actual.sigueinte;
        }
        return totalnodos;
    }
}
