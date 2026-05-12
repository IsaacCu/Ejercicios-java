public class Camion {
    String Placa;
    String Conductor;
    double PesoToneladas;
    Camion Siguiente;
    public Camion(String placa, String conductor,double pesoToneladas) {
        Placa = placa;
        Conductor = conductor;
        PesoToneladas = pesoToneladas;
        Siguiente = null;
    }

    @Override
    public String toString(){
        return "["+Placa+"|"+Conductor+"|"+PesoToneladas+"]";
    }
}
