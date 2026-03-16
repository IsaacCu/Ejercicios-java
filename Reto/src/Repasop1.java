import java.util.Scanner;

public class Repasop1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("--  Ingrese el numero de productos  --  ");
        int can = sc.nextInt();
        Productos[] productos = new Productos[can];

        for(int i = 0;i<productos.length; i++){
            System.out.println("-Ingrese el ID del producto "+ (i+1)+": ");
            int idIndi= sc.nextInt();
            System.out.println("-Ingrese el nombre del producto "+ (i+1)+": ");
            String nombreIndi= sc.next();
            System.out.println("-Ingrese el precio del producto "+ (i+1)+": ");
            double precioIndi= sc.nextDouble();
            System.out.println("-Ingrese el stock del producto "+ (i+1)+": ");
            int stockIndi= sc.nextInt();

            productos[i] = new Productos(idIndi, nombreIndi, precioIndi, stockIndi);
        }
        System.out.println("-- Lista Inicial --");
        for (Productos i : productos) {
            i.imprimir();
        }
        int n = productos.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Productos temp = productos[i];
                int j;
                for (j = i; j >= gap && productos[j - gap].id > temp.id; j -= gap) {
                    productos[j] = productos[j - gap];
                }
                productos[j] = temp;
            }
        }
        
        System.out.println("-- Lista Ordenada --");

        for (Productos i : productos) {
            i.imprimir();
        }
        System.out.println(" -- Ingrese el Id a buscar -- ");
        int idBuscar= sc.nextInt();

        int inicio = 0;
        int fin = productos.length- 1;
        int pasos=0;
        int ubicacionEncontrada=-1;

        while (inicio<=fin) {

            pasos++;
            int mitad=inicio+(fin-inicio)/2;
            if (productos[mitad].id==idBuscar) {
                ubicacionEncontrada=mitad;
                break;
            }

            if (productos[mitad].id<idBuscar) {
                inicio=mitad+1;
            }

            else {
                fin=mitad-1;
            } 
        }

        if (ubicacionEncontrada != -1) {
            System.out.println("Se encontraron los datos");
            productos[ubicacionEncontrada].imprimir();
        } 
        else {
            System.out.println("El ID " + idBuscar + " no existe en la base de datos.");
            System.out.println("Se agotaron los " + pasos + " pasos de búsqueda.");
        }
        sc.close();
    }


    public static class Productos{
        public int id;
        public String nombre;
        public double precio;
        public int stock;

        public Productos(int id,String nombre,double precio,int stock){
            this.id=id;
            this.nombre=nombre;
            this.precio=precio;
            this.stock=stock;
        }

        public void imprimir(){
            System.out.println("/ID: "+ this.id + " /NOMBRE: " + this.nombre + " /PRECIO: "+this.precio+" /STOCK: "+this.stock+" /");
        }

    }
}
