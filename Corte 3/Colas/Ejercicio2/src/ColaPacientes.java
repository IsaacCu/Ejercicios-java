public class ColaPacientes {
    private Paciente salida;
    private Paciente entrada;
    private int tamaño;
    public ColaPacientes() {
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


    public void enqueue (Paciente nuevoPaciente){
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


    public Paciente dequeue() {
      if (IsEmpty()) {
          System.out.println("Cola vacía — no hay elemento para extraer");
          return null;
      }
      Paciente dato = salida;          
      salida = salida.Siguiente;   
      if (salida == null) {
          entrada = null;           
      }
      tamaño--;
      return dato;
    }

    public void ImprimirPaciente(Paciente pacienteatendido){
        System.out.println("Cedula:"+pacienteatendido.Cedula+"|Nombre Completo:"+pacienteatendido.NombreCompleto+"|Edad:"+pacienteatendido.Edad+"|Sintoma Principal:"+pacienteatendido.SintomaPrincipal);

    }

    public void imprimir(){
        if (IsEmpty()) {
            System.out.println("La cola esta vacia.");
        }
        else{
            Paciente actual = salida;
            while (actual!= null) {
                ImprimirPaciente(actual);
                actual = actual.Siguiente;
            }
        }
    }

    public void AtenderTodos(){
        if (IsEmpty()) {
            System.out.println("La cola esta vacia.");
        }
        else{
            System.out.println("-- Pacientes atendidos --");
            int pacientesatendidos = 0;
            Paciente actual = salida;
            while (actual!= null) {
                ImprimirPaciente(dequeue());
                pacientesatendidos++;
                actual = salida;
            }
            System.out.println("Pacientes atendidos:"+pacientesatendidos);
        }
    }
}
