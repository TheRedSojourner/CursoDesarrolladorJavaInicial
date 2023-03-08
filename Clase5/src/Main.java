public class Main {
    public static void main(String[] args) {

        Carrito miCarrito = new Carrito();

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


        /*Producto atun = new Producto();
        atun.SetNombre("Atun");
        Producto salame = new Producto();
*/



        miCarrito.productos.add(atun);
        miCarrito.productos.add(salame);
        miCarrito.productos.add(jabon);
        miCarrito.productos.add(jabon);


        miCarrito.ListarProductos();
        miCarrito.CambiameElNombreDeUnaMarca("Otro nombre", "jabonosa");
        miCarrito.ListarProductos();


    }
}