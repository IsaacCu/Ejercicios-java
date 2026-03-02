// Ejercicio 4 — Perfil de usuario
// Pide al usuario los datos de su perfil: nombre, edad, ciudad, correo 
// y si acepta términos y condiciones. Muestra un resumen indicando el tipo 
// de dato que se usó para cada campo.

// Datos de entrada: String, int, String, String, boolean

import java.util.Scanner;

public class EjercicioIMPUT4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.println("Ingrese su ciudad: ");
        String ciudad = sc.nextLine();

        System.out.println("Ingrese su correo: ");
        String correo = sc.nextLine();

        System.out.println("Acepta T&C: ");
        boolean terminos = sc.nextBoolean();

        if (terminos == true) {
            System.out.println("==== Perfil Creado ====");
            System.out.println("Nombre: "+ nombre);
            System.out.println("Edad: "+ edad);
            System.out.println("Ciudad: "+ ciudad);
            System.out.println("Correo: "+ correo);
            System.out.println("T&C: "+ terminos);
        }
        else{
            System.out.println("Debe aceptar los terminos y condiciones");
        }

        
    }
    
}
