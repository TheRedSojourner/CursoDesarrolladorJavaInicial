import java.util.ArrayList;

public class CarritoCompra {

    ArrayList<Producto> productos = new ArrayList<>();
    public void AgregameUnItemAlCarrito(Producto producto) throws NoHayStockException {
            if (producto.stock>0)
            {
                productos.add(producto);
            } else
            {
                throw new NoHayStockException(producto);
            }
        }
}
