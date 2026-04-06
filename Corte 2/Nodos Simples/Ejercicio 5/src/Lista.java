public class Lista {
    Cancion cabeza;
    public Lista(){
        this.cabeza = null;
    }

    public void agregar_acontinuacion(Cancion nuevaCancion){
        if (cabeza == null) {
            cabeza = nuevaCancion;  
        }
        else{
            nuevaCancion.siguiente = cabeza;
            cabeza = nuevaCancion;
        }
    }

    public void agregar_alfial(Cancion nuevaCancion){
        if (cabeza == null) {
            cabeza = nuevaCancion;
        }
        else{
            Cancion actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevaCancion;
        }
    }
    public void listaReproduccion(){
        System.out.println("========================================");
        System.out.println("         Lista de reproduccion          ");
        System.out.println("========================================");

        Cancion actual = cabeza;
        while (actual != null) {
            System.out.println("Cancion:"+actual.titulo+" - Artista:"+actual.artista+" - Duracion:"+actual.duracion+"seg. - Genero:"+actual.genero); 
            actual = actual.siguiente;
        }
    }

    public void tiempoReproducciom(){
        int tiempo = 0;
        Cancion actual = cabeza;
        while (actual != null) {
            tiempo += actual.duracion;
            actual = actual.siguiente;
        }
        int minutos = tiempo / 60;
        double segundos = tiempo % 60;
        System.out.println("Tiempo total de reprocuccion(MM:SS):"+ minutos +":"+segundos);
    }
}
