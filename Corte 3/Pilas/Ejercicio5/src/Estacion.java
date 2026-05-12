public class Estacion {
    String NombrePunto;
    int Profundidad;
    double NivelOxigeno;
    Estacion Siguiente;
    public Estacion(String nombre,int profundidad, double nivelOxigeno) {
        NombrePunto = nombre;
        Profundidad = profundidad;
        NivelOxigeno = nivelOxigeno;
        Siguiente = null;
    }

    @Override
    public String toString(){
        return "[Nombre Punto: "+NombrePunto+"|Profundidad: "+Profundidad+"|Nivel Oxigeno: "+NivelOxigeno+"]";
    }
}
