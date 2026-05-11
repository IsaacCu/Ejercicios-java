public class Pieza {
    String NombrePieza;
    String NumeroSerie;
    boolean EsDefectuosa;
    Pieza Siguiente;

    public Pieza(String nombre, String numero, boolean defectuosa){
        NombrePieza = nombre;
        NumeroSerie = numero;
        EsDefectuosa = defectuosa;
        Siguiente = null;
    }
    
    @Override
    public String toString(){
        return "[" + NombrePieza + "|" + NumeroSerie + "|"+ EsDefectuosa + "]";
    }
}
