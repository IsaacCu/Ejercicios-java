// Ejercicio 4 — Placa de un vehículo
// El RUNT almacena datos básicos de vehículos. Modela la información de un carro con:

// Placa (String)
// Año de fabricación (int)
// Cilindraje en cc (int)
// Precio de compra (double)
// Inicial del color (char)
// Si tiene SOAT vigente (boolean)
// Muestra todos los datos en consola.

public class Ejercicio4 {
    
    public static void main(String[] args) {
        System.out.println("==== Placa de un vehiculo ====");


        String placa;
        int modelo;
        int cilindraje;
        Double precio;
        char inicial = 'N';
        Boolean soat;
        String vigencia;


        placa="USA00I";
        modelo=2026;
        cilindraje=1000;
        precio=99999.9;
        soat=false;

        if (soat==true){
            vigencia="En vigencia";
        }
        else{
            vigencia="No vigente";
        }


        System.out.println("Placa:" + placa);
        System.out.println("Modelo:" + modelo);
        System.out.println("Cilindraje en CC:" + cilindraje);
        System.out.println("Precio de compra:" + precio);
        System.out.println("Inicial del color:" + inicial);
        System.out.println("SOAT:" + vigencia);
    }
}
