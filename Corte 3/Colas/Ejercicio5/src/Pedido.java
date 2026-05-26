public class Pedido {
    String NumeroPedido;
    String Cliente;
    double TotalPagar;
    boolean Cancelado;
    Vehiculo Siguiente;

    public Pedido(String numeropedido, String cliente, double totalPagar, boolean cancelado) {
        NumeroPedido = numeropedido;
        Cliente = cliente;
        TotalPagar = totalPagar;
        Cancelado = cancelado;
        Siguiente = null;
    }
}
