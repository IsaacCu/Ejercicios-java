public class Cueva {
    Estacion tope;
    int tamaño;
    public Cueva() {
        this.tope = null;
        this.tamaño = 0;
    }

    public boolean EstaVacia(){
        return tope == null;
    }

    public int GetTamaño(){
        return tamaño;
    }

    public void Push(Estacion nuevaEstacion){
        nuevaEstacion.Siguiente = tope;
        tope = nuevaEstacion;
        tamaño++;
    }

    public void retrocederASuperficie(){
        Estacion actual = tope;
        while (actual!= null) {
            if (actual == tope) {
                System.out.print("SALIDA>");
            }
            if (actual.NivelOxigeno<10) {
                System.out.print("¡¡Uso de tanque de Emergencia requerido!!");
            }
            System.out.print(actual.toString());
            System.out.println("<<");
            actual = actual.Siguiente;       
        }
    }
    
}
