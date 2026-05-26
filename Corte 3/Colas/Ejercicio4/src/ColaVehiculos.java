public class ColaVehiculos {
    private Vehiculo salida;
    private Vehiculo entrada;
    private int tamaño;
    public ColaVehiculos() {
        this.salida = null;
        this.entrada = null;
        this.tamaño = 0;
    }


    public boolean IsEmpty(){
        return salida == null;
    }


    public int Size(){
        return tamaño;
    }


    public void enqueue (Vehiculo nuevoPaciente){
        if (IsEmpty()) {
            salida = nuevoPaciente;
            entrada = nuevoPaciente;
        }
        else{
            entrada.Siguiente = nuevoPaciente;
            entrada = nuevoPaciente;
        }
        tamaño ++;
    }


    public Vehiculo dequeue() {
      if (IsEmpty()) {
          System.out.println("Cola vacía — no hay elemento para extraer");
          return null;
      }
      Vehiculo dato = salida;          
      salida = salida.Siguiente;   
      if (salida == null) {
          entrada = null;           
      }
      tamaño--;
      return dato;
    }

    public void ImprimirPaciente(Vehiculo vehiculo){
        System.out.println("Placa:"+vehiculo.Placa+"|Tipo de Vehiculo:"+vehiculo.TipoVehiculo+"|Tarifa:"+vehiculo.Tarifa+"|Es Exento:"+vehiculo.EsExento);

    }

    public void imprimir(){
        if (IsEmpty()) {
            System.out.println("La cola esta vacia.");
        }
        else{
            Vehiculo actual = salida;
            while (actual!= null) {
                ImprimirPaciente(actual);
                actual = actual.Siguiente;
            }
        }
    }

    public void CerrarTurnos(){
        if (IsEmpty()) {
            System.out.println("La cola esta vacia.");
        }
        else{
            double tarifa = 0;
            Vehiculo actual = salida;
            while (actual!= null) {
                if (dequeue().EsExento == true) {
                    tarifa+=actual.Tarifa;
                }
                actual = salida;
            }
            System.out.println("Tarifa recogida al final:"+tarifa);
        }
    }
}
