public class Ejercicio6 {
        public static void main(String[] args) {
            String turnoActual="001";
            String turnoenPantalla= turnoActual;
            turnoenPantalla="003";

            System.out.println("Turno actual: " +  turnoActual);
            System.out.println("Turno en Pantalla: " + turnoenPantalla);

            //como podemos observar, al ejecutar el codigo la variable turnoActual
            //no se modifica, y esto es porque la variable turnoenpantalla no esta
            //ligada a turnoActual, a pesar de que se igualaron, esto pasa porque solo se creo
            //una copia de la variable turnoActual en turnoenPantalla y esto no las liga.
    }
    
}
