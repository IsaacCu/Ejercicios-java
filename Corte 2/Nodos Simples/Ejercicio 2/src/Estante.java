public class Estante {
    Producto cabeza;
    public Estante(){
        this.cabeza = null;
    }

    public void Ordenar(Producto nuevProducto){
        if (cabeza == null) {
            cabeza = nuevProducto;
        }
        else{
            if (nuevProducto.diasParaVencer<=3) {
                nuevProducto.siguiente = cabeza;
                cabeza=nuevProducto;
            }
            else{
                Producto iterando = cabeza;
                while (iterando.siguiente != null) {
                    iterando=iterando.siguiente;
                }
                iterando.siguiente = nuevProducto;
            }
        }
    }
    public void Imprimir(){
        Producto iterando = cabeza;
        System.out.println("=================================================");
        System.out.println("               Productos por vencer              ");
        System.out.println("=================================================");
        while (iterando.siguiente != null) {
            if (iterando.diasParaVencer<5) {
                System.out.println(iterando.nombre + " vence en " + iterando.diasParaVencer);
            }
            iterando=iterando.siguiente;
        }
        if (iterando.diasParaVencer < 5) {
            System.out.println(iterando.nombre + " vence en " + iterando.diasParaVencer);
        }
    }
}
