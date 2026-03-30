public class Tren {
    Vagon cabeza;

    public Tren(){
        this.cabeza = null;
    }

    public void Agregar_Vagon(Vagon nuevoVagon){
        if (cabeza == null) {
            cabeza = nuevoVagon;
        }
        else{
            Vagon actual = cabeza;
            while (actual.siguiente != null) {
                actual= actual.siguiente;
            }
            actual.siguiente = nuevoVagon;
        }
    }
    public Double calcularPeso(){
        Double pesototal = 0.0;
        Vagon actual = cabeza;
        while (actual != null) {
            pesototal += actual.pesoToneladas;
            actual= actual.siguiente;
        }
        return pesototal;
    }
    
}
