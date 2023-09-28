import java.util.Scanner;

public class SimpleInventario {
    public static void ObtenerNombreArticulo(int id){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del articulo");
        String Nombre=(scanner.next());
        System.out.println("Usted ha ingresado el articulo" );


    }

    public static void obtenerArticulo(int id){System.out.println("Ingrese su nombre");
        Scanner scanner = new Scanner(System.in);
        String articuloExistente = scanner.next();
        System.out.println("Usted ha ingresado el articulo existente" +articuloExistente);





    }


        public static void imprimirInventario(){
            System.out.println("Ingrese su nombre");
            Scanner scanner = new Scanner(System.in);
            String usuario = scanner.next();
            System.out.println("Bienvenido" + usuario);




    }
    public static void main (String[] args) {
        imprimirInventario();
    }
}
