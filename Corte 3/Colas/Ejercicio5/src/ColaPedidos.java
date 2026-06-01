public class ColaPedidos {
    private Pedido salida;
    private Pedido entrada;
    private int tamaño;
    public ColaPedidos() {
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


    public void enqueue (Pedido nuevoPaciente){
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


    public Pedido dequeue() {
      if (IsEmpty()) {
          System.out.println("Cola vacía — no hay elemento para extraer");
          return null;
      }
      Pedido dato = salida;          
      salida = salida.Siguiente;   
      if (salida == null) {
          entrada = null;           
      }
      tamaño--;
      return dato;
    }

    public void ImprimirPaciente(Pedido pedido){
        System.out.println("Numero Pedido:"+pedido.NumeroPedido+"|Cliente:"+pedido.Cliente+"|Total a Pagar:"+pedido.TotalPagar+"|Cancelado:"+pedido.Cancelado);

    }

    public void imprimir(){
        if (IsEmpty()) {
            System.out.println("La cola esta vacia.");
        }
        else{
            Pedido actual = salida;
            while (actual!= null) {
                ImprimirPaciente(actual);
                actual = actual.Siguiente;
            }
        }
    }

    public void procesarPedidos(){
        if (IsEmpty()) {
            System.out.println("La cola esta vacia.");
        }
        else{
            int despachados = 0;
            int cancelados = 0;
            Pedido actual = salida;
            while (actual!= null) {
                if (dequeue().Cancelado == true) {
                    cancelados++;
                }
                else{
                    ImprimirPaciente(actual);
                    despachados ++;
                }
                actual = salida;
            }
            System.out.println("Pedidos Cancelados en Total:"+cancelados);
            System.out.println("Pedidos Despachados en Total:"+despachados);

        }
    }
}
