import java.util.Scanner;

public class SimpleInventario {
     static  String[] articulos = new String[5];

    public  static void AgregarArticulo(){
        int i =0;
        while (i <= articulos.length) {
            String articulo = articulos[i]=obtenerNombreArticulo();
            i++;

        }

    }

        public static String obtenerNombreArticulo() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el nombre de articulo: ");
            String nombredeArticulo = new String();
            System.out.println("Usted a ingresado el articulo" + nombredeArticulo);
            return nombredeArticulo;

        }

    public static void removerArticuloint(int id) {
        if (id > 0.00) {
            System.out.println("Articulo Removido");
        }
    }

    public static double obtenerPrecioArticulo(String articulo) {
        double precio = (Math.random() * 5000) + 100;
        if (articulo.startsWith("A") || articulo.startsWith("D")) {
            return precio;
        } else if (articulo.startsWith("C") || articulo.startsWith("M")) {
            return precio * 0.8;
        } else {
            return precio;


        }
    }
    public static void modificarArticulo() {
        String nombreArticulo = obtenerNombreArticulo();
        double precioArticulo = obtenerPrecioArticulo(nombreArticulo);
        if (precioArticulo >= 150 && precioArticulo <= 250) {
            precioArticulo *= 1.02;
        } else if (precioArticulo >= 250 && precioArticulo <= 500) {
            precioArticulo *= 1.08;
        } else {
            precioArticulo *= 1.15;
        }

        System.out.println("Nuevo precio del articulo " + nombreArticulo + " es: " + precioArticulo);
    }


    public static void imprimirinventario () {
        System.out.println("Ingrese su nombre");
        Scanner scanner = new Scanner(System.in);
        String usuario = new String();
        System.out.println("Bienvenido " + usuario);
        System.out.println("Articulos Registrados: + Articulos");
        for (String articulo: articulos){
            System.out.println(articulos);
        }

    }

    public static void main (String[]args){
        imprimirinventario();
    }
}






