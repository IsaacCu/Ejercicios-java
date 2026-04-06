public class Historial {
    Lectura cabeza;
    public Historial(){
        this.cabeza = null;
    }
    public void agregar_lectura(Lectura nuevaLectura){
        if (cabeza == null) {
            this.cabeza = nuevaLectura;
        }
        else{
            nuevaLectura.siguiente = cabeza;
            cabeza = nuevaLectura;
        }
    }
    public void buscarMayorLectura(){
        if (cabeza == null) {
            System.out.println("El historial se encuentra vacio.");   
        }
        else{
            Lectura actual = cabeza;
            Double bandera = cabeza.temperatura;
            while (actual != null) {
                if (actual.temperatura>bandera) {
                    bandera = actual.temperatura;
                }
                actual = actual.siguiente;
            }
            actual = cabeza;
            while (actual != null) {
                if (actual.temperatura == bandera) {
                    System.out.println("La lectura mas alta en el historial fue:");
                    System.out.println("ID sensor:"+actual.idSensor+", Temperatura:"+actual.temperatura+", Presion:"+actual.presion+", Hora:"+actual.hora);
                    return;
                }
                actual= actual.siguiente;
            }        
        }
    }
}
