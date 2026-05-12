public class Callejon {
    Camion tope;
    int tamaño;
    public Callejon() {
        this.tope = null;
        this.tamaño = 0;
    }

    public boolean EstaVacia(){
        return tope == null;
    }

    public int GetTamaño(){
        return tamaño;
    }

    public void Push(Camion nuevocamion){
        nuevocamion.Siguiente = tope;
        tope = nuevocamion;
        tamaño++;
    }

    public double CalcularPeso(){
        Camion actual = tope;
        double pesoTotal = 0;
        while (actual!= null) {
            pesoTotal += actual.PesoToneladas;
            actual = actual.Siguiente;       
        }
        return pesoTotal;
    }
}
