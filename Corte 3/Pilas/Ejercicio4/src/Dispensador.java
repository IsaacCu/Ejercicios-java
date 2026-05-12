public class Dispensador {
    Medicamento tope;
    int tamaño;
    public Dispensador() {
        this.tope = null;
        this.tamaño = 0;
    }

    public boolean EstaVacia(){
        return tope == null;
    }

    public int GetTamaño(){
        return tamaño;
    }

    public void Push(Medicamento nuevoMedicamento){
        nuevoMedicamento.Siguiente = tope;
        tope = nuevoMedicamento;
        tamaño++;
    }

    public Medicamento Pop(){
        if (EstaVacia()) {
            return null;
        }
        else{
            Medicamento aux = tope;
            tope = tope.Siguiente;
            aux.Siguiente = null;
            return aux;
        }
    }

    public void ValidarDespacho(){
        if (EstaVacia()) {
            System.out.println("No hay medicamentos en el dispensador.");
        }
        else{
            while (tope!= null) {
                if (tope.DiasParaVencer<10) {
                    System.out.println("Medicamento retirado: ");
                    System.out.println(tope.toString());
                    Pop();
                }
                else{
                    System.out.println("Medicamento en buen estado: ");
                    System.out.println(tope.toString());
                    break;
                }
            }
        }
    }
}
