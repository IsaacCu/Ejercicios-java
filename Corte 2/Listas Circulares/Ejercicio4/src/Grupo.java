public class Grupo {
    String nombreReserva;
    int numeroPersonas;
    boolean esVIP;
    int minutosEsperando;

    Grupo siguiente;
    public Grupo(String nombreReserva, int numeroPersonas, boolean esVIP, int minutosEsperando){
        this.nombreReserva = nombreReserva;
        this.numeroPersonas = numeroPersonas;
        this.esVIP = esVIP;
        this.minutosEsperando = minutosEsperando;
        this.siguiente = null;
    }
    
}
