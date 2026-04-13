public class Consultorio {
    Paciente cabeza;
    Paciente cola;

    public Consultorio(){
        this.cabeza = null;
        this.cola = null;
    }

    public void agregar_paciente(Paciente nuevo){
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } 
        else {
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
            cola = nuevo;

            if (nuevo.nivelUrgencia == 5 && cabeza != nuevo) {
                if (nuevo == cola) {
                    cola = nuevo.anterior;
                    cola.siguiente = null;
                }

                Paciente segundo = cabeza.siguiente;

                cabeza.siguiente = nuevo;
                nuevo.anterior = cabeza;

                nuevo.siguiente = segundo;

                if (segundo != null) {
                    segundo.anterior = nuevo;
                }
            }
        }
    }

    public void paciente_mayor_edad(){
        if (cola == null) {
            System.out.println("No hay pacientes");
            return;
        }
        Paciente actual = cola;
        Paciente mayor = cola;

        while (actual != null) {
            if (actual.edad > mayor.edad) {
                mayor = actual;
            }
            actual = actual.anterior;
        }

        System.out.println("Nombre: " + mayor.nombre + 
                           "; Edad: " + mayor.edad + 
                           "; Urgencia: " + mayor.nivelUrgencia);
    }
}