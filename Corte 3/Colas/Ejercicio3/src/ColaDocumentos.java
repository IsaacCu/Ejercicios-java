public class ColaDocumentos {
    private Documento salida;
    private Documento entrada;
    private int tamaño;
    public ColaDocumentos() {
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


    public void enqueue (Documento nuevoPaciente){
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


    public Documento dequeue() {
      if (IsEmpty()) {
          System.out.println("Cola vacía — no hay elemento para extraer");
          return null;
      }
      Documento dato = salida;          
      salida = salida.Siguiente;   
      if (salida == null) {
          entrada = null;           
      }
      tamaño--;
      return dato;
    }

    public void ImprimirDocumentos(Documento documento){
        System.out.println("Nombre del Archivo:"+documento.NombreArchivo+"|Usuario:"+documento.Usuario+"|Numero de Paginas:"+documento.NumeroPaginas+"|Es a Color:"+documento.EsColor);

    }

    public int TotalPaginas(){
        if (IsEmpty()) {
            System.out.println("La cola esta vacia.");
            return 0;
        }
        else{
            int totalPaginas = 0;
            Documento actual = salida;
            while (actual!= null) {
                totalPaginas += actual.NumeroPaginas;
                actual = actual.Siguiente;
            }
            return totalPaginas;
        }
    }

    public void imprimir(){
        if (IsEmpty()) {
            System.out.println("La cola esta vacia.");
        }
        else{
            Documento actual = salida;
            while (actual!= null) {
                ImprimirDocumentos(actual);
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
            Documento actual = salida;
            while (actual!= null) {
                ImprimirDocumentos(dequeue());
                pacientesatendidos++;
                actual = salida;
            }
            System.out.println("Pacientes atendidos:"+pacientesatendidos);
        }
    }
}
