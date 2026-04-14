public class Carrusel {
    Anuncio cabeza;
    Anuncio cola;

    public Carrusel(){
        this.cabeza = null;
        this.cola = null;
    }

    public void agregar(Anuncio nuevo){
        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
            cabeza.siguiente = cabeza;
        }
        else{
            cola.siguiente = nuevo;
            nuevo.siguiente = cabeza;
            cola = nuevo;
        }
    }

    public void reproducir(int ciclos){
        if (cabeza == null) {
            System.out.println("No hay anuncios.");
        }
        else{
            int tiempoTotal = 0;
            Anuncio actual = cabeza;

            for (int i = 0; i < ciclos; i++) {
                do {
                    actual.vecesRepetido++;
                    tiempoTotal += actual.duracionSegundos;

                    System.out.println("Mostrando anuncio: " + actual.titulo +
                                       " | Duracion: " + actual.duracionSegundos +
                                       "s | Categoria: " + actual.categoria);

                    actual = actual.siguiente;

                } while (actual != cabeza);
            }

            Anuncio temp = cabeza;
            Anuncio masRepetido = cabeza;

            do {
                if (temp.vecesRepetido > masRepetido.vecesRepetido) {
                    masRepetido = temp;
                }
                temp = temp.siguiente;
            } while (temp != cabeza);

            System.out.println("\nAnuncio mas repetido: " + masRepetido.titulo +
                               " (" + masRepetido.vecesRepetido + " veces)");

            System.out.println("Tiempo total en pantalla: " + tiempoTotal + " segundos");
        }
    }
}