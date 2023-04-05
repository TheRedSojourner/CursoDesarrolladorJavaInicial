import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carrito miCarrito = new Carrito();
        /*Producto jabon = new Producto();
        Producto jamon = new Producto();
        Producto japon = new Producto();
        System.out.println(jabon.GetMarca());

        String nombreCualquiera = "un nombre para nuestra variable";

        jabon.SetMarca(nombreCualquiera);
        System.out.println(nombreCualquiera);

        jamon.SetMarca("MegaJamon");

        System.out.println(jabon.GetMarca());
        //Scanner scanner = new Scanner(System.in);
        // System.out.println((jabon.SetMarca(scanner.nextLine())));

*/

        Producto japon = new Producto("El Pais entero de Japon", 1, 10, "Japon");

        Producto jabon = new Producto(
                "Esto es un jabon, viejo",
                50,
                0.1,
                "jabonosa");
        Producto atun = new Producto(
                "Esto es una lata de atun",
                77,
                0.01,
                "Atunoso");
        Producto salame = new Producto(
                "Este es uno de mis estudiantes",
                90,
                2147483647,
                "Salamoso");


        String unaMarca = salame.GetMarca();
        System.out.println(unaMarca);


        /*Producto atun = new Producto();
        atun.SetNombre("Atun");
        Producto salame = new Producto();
*/



        miCarrito.productos.add(atun);
        miCarrito.productos.add(salame);
        miCarrito.productos.add(jabon);

        miCarrito.productos.get(2).SetMarca("Cambiame la marca");


        miCarrito.ListarProductos();
        //miCarrito.CambiameElNombreDeUnaMarca("Otro nombre", "jabonosa");
        miCarrito.ListarProductos();


    }


}