// 3. Sensor de Temperatura (Control de Calidad)
// Una máquina industrial registra la temperatura cada 10 minutos y guarda los datos
//  en un arreglo.

// El Problema: Al final del día, el supervisor quiere saber cuál fue la temperatura más 
// alta registrada para asegurarse de que la máquina no se recalentó.

// Algoritmo a usar: Búsqueda Lineal de Máximo. Debes recorrer todo el arreglo comparando
//  cada valor para encontrar el mayor de todos.

public class EjercicioARRAY3 {
    public static void main(String[] args){
        int[] temperaturas = {
            45, 12, 78, 3, 90, 56, 23, 67, 1, 34,
            89, 21, 54, 10, 99, 6, 72, 18, 40, 81,
            29, 5, 63, 14, 77, 2, 95, 38, 50, 100};

        int maximo=0;
        
        for(int i=0; i < temperaturas.length ;i++){

            if (temperaturas[i]>maximo) {
                maximo=temperaturas[i];
            }
        }
        System.out.println("La temperatura mas alta registrada fue: "+ maximo);

    }
}
