public class Medicamento {
    String Nombre;
    String Lote;
    int DiasParaVencer;
    Medicamento Siguiente;
    public Medicamento(String nombre, String lote,int diasparavencer) {
        Nombre = nombre;
        Lote = lote;
        DiasParaVencer = diasparavencer;
        Siguiente = null;
    }

    @Override
    public String toString(){
        return "[Nombre: "+Nombre+"|Lote: "+Lote+"|Dias para vencer: "+DiasParaVencer+"]";
    }
}

