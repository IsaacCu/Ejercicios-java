public class LineaEnsamblaje {
    private Pieza tope;
    private int tamaño;
    public LineaEnsamblaje() {
        this.tope = null;
        this.tamaño = 0;
    }

    public boolean EsVacia(){
        return tope == null;
    }

    public int GetTamaño(){
        return tamaño;
    }

    public void Push(Pieza nuevaPieza){
        nuevaPieza.Siguiente = tope;
        tope = nuevaPieza;
        tamaño ++;
    }

    public Pieza Pop(){
        if (EsVacia()) {
            return null;
        }
        else{
            Pieza aux = tope;
            tope = tope.Siguiente;
            tamaño--;
            aux.Siguiente = null;
            return aux;
        }
    }

    public void limpiarHastaDefecto(){
        if (EsVacia()) {
            System.out.println("No existen piezas ensambladas.");
        }
        else{
            while (tope != null) {
                if (tope.EsDefectuosa) {
                    System.out.println("Pieza defectuosa encontrada");
                    System.out.println(tope.toString());
                    Pop();
                    break;
                }
                else{
                    System.out.print("Pieza retirada: ");
                    Pop();
                    System.out.println(tope.toString());
                }
            }
        }
    }

    
}
