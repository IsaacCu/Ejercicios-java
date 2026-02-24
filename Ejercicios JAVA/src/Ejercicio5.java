public class Ejercicio5 {
    //Conversor de unidades
    //Una aplicación de cocina necesita convertir unidades:
    public static void main(String[] args) {
        System.out.println("==== Calculadora de una tienda ====");

        double tazas;
        double mililitros;
        double litros;


        tazas=1;
        mililitros=tazas*236.588;
        litros=mililitros/1000;
        


        System.out.println("Numero de tazas:" + tazas);
        System.out.println("Equivalente en Mililitros(ml):" + mililitros);
        System.out.println("Equivalente en Litros(lt):" + litros);
    }
}
