// Ejercicio 8 — Historial de mensajes
// Un chat guarda el último mensaje enviado. Se usan dos variables String:

// ultimoMensaje = "Hola"
// copiaTexto = ultimoMensaje
// Luego copiaTexto se cambia a "¿Cómo estás?"
// Muestra ambas variables y explica en un comentario por qué ultimoMensaje no cambió 
// (inmutabilidad de String).

public class Ejercicio8 {

        public static void main(String[] args) {
        
        String ultimoMensaje = "Hola";
        String copiatexto = ultimoMensaje;
        copiatexto = "¿Como estas?"; 

        System.out.println("Ultimo mensaje: " + ultimoMensaje);
        System.out.println("Copia del texto: " + copiatexto);

        //En este caso yo creo que las variables no se vuelven dependientes una de la otra
        //porque estas no son objetos si no un tipo de dato.
    }
    
}
