// Ejercicio 9 — Notas de un curso
// Un profesor tiene las notas de 4 estudiantes en un arreglo. El coordinador recibe una referencia al mismo arreglo para revisarlas.

// El coordinador corrige la nota del estudiante 2 (índice 1) de 2.5 a 3.0.
// Muestra que el arreglo del profesor también refleja el cambio.
// Añade comentarios explicando el concepto de referencia en memoria.

public class Ejercicio9 {
    public static void main(String[] args) {
        double[] notas= {3.0,2.5,4.0,5.0};
        double[] enlaceNotas=notas;
        System.out.println("Nota de alumno 2: " + notas[1]);
        enlaceNotas[1]=3.0;
        System.out.println("Nota de alumno 2 despues de revision: " + notas[1]);
        //Lo que ocurre aca es lo mismo que vimos en el ejercicio 7, al ser arreglos
        // y compararlos los vinculamos y los cambios que ocurran en uno se veran tambien
        //en el otro.
    }
    
}
