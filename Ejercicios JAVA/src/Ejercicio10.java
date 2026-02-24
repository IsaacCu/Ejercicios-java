public class Ejercicio10 {
    public static void main(String[] args) {
        int[] configuracion = {1920,1080,60};
        int[] copiaConfiguracion = {0,0,0};
        copiaConfiguracion[0]=configuracion[0];
        copiaConfiguracion[1]=configuracion[1];
        copiaConfiguracion[2]=configuracion[2];
        System.out.println("Configuracion: " + configuracion[0] + "," + configuracion[1] + "," + configuracion[2]);
        copiaConfiguracion[1]=0;
        System.out.println("Configuracion: " + configuracion[0] + "," + configuracion[1] + "," + configuracion[2]);

        // en este caso los cambios hechos en la copia no afectan a la original ya que no la asignamos directamente
        //solo copiamos los datos de la configuracion en nuestro nuevo arreglo.

    }
    
}
