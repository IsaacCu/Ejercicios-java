public class Paciente {
    String Cedula;
    String NombreCompleto;
    int Edad;
    String SintomaPrincipal;
    Paciente Siguiente;

    public Paciente(String cedula, String nombre, int edad, String sintomaPrincipal) {
        Cedula = cedula;
        NombreCompleto = nombre;
        Edad = edad;
        SintomaPrincipal = sintomaPrincipal;
        Siguiente = null;
    }
}
