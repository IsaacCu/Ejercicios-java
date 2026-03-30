// Ejercicio 1 — Ficha de un estudiante
// Un sistema universitario necesita registrar la información básica de un estudiante:
// nombre completo, código (número entero), semestre actual, promedio acumulado y si está 
// matriculado o no.
// Declara las variables con los tipos de datos apropiados.
// Asigna valores de ejemplo.
// Imprime un reporte por consola con el siguiente formato

public class Ejercicio1 {
   
    public static void main(String[] args) {
        System.out.println("==== Ficha del estudiente ====");


        String nombre;
        int codigo;
        int semestre;
        Double promedio;
        Boolean matriculado;


        nombre="Isaac";
        codigo=200;
        semestre=3;
        promedio=3.85;
        matriculado=true;


        System.out.println("Nombre:" + nombre);
        System.out.println("Codigo:" + codigo);
        System.out.println("Semestre:" + semestre);
        System.out.println("Promedio:" + promedio);
        System.out.println("Matriculado:" + matriculado);
    }

}
