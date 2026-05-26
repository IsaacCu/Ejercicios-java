public class Vehiculo {
    String Placa;
    String TipoVehiculo;
    double Tarifa;
    boolean EsExento;
    Vehiculo Siguiente;

    public Vehiculo(String placa, String tipoVehiculo, double tarifa, boolean esExento) {
        Placa = placa;
        TipoVehiculo = tipoVehiculo;
        Tarifa = tarifa;
        EsExento = esExento;
        Siguiente = null;
    }
}
