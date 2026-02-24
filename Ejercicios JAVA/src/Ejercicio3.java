// Ejercicio 3 — Sensor de temperatura
// Un sensor industrial registra temperaturas. El sistema recibe:

// Temperatura actual en Celsius (double)
// Nombre del sensor (String)
// Número de lectura (int)
// Si la temperatura supera el límite de 80°C, una variable boolean llamada enAlarma debe ser true.
// Imprime el estado del sensor con todos sus datos.

public class Ejercicio3 {
    public static void main(String[] args) {
       
        System.out.println("==== Calculadora de una tienda ====");

        Double temperatura;
        String nombresensor;
        int numerolectura;
        boolean enAlarma;


        temperatura=50.8;
        nombresensor="Sensor Principal";
        numerolectura=5;
        if (temperatura>80){
            enAlarma=true;
        }
        else{
            enAlarma=false;
        }
        
        


        System.out.println("Temperatura(Celsius):" + temperatura);
        System.out.println("Nombre del sensor:" + nombresensor);
        System.out.println("Numero de lactura:" + numerolectura);
        System.out.println("En alarma:" + enAlarma);
    }


    
}
