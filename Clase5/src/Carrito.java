import java.util.ArrayList;
public class Carrito {

    Producto[] productoss = new Producto[100];

    public ArrayList<Producto> productos = new ArrayList<Producto>();


    public void ListarProductos()
    {
        for (int i = 0; i < productos.size() ; i++) {
            System.out.println(productos.get(i).GetMarca());
        }
        System.out.println("--------------------------------");
    }

    public void CambiameElNombreDeUnaMarca(String nuevoNombre, String marca)
    {
        boolean encontrado = false;
        int indice = 0;

        while (!encontrado && indice < productos.size())
        {
            if (productos.get(indice).GetMarca().equals(marca))
            {
                productos.get(indice).SetMarca(nuevoNombre);
                encontrado = true;
            }
            indice++;
        }
    }

    public void RemovemeEstaMarca(String nuevoNombre, String marca)
    {
        Producto nuevoProducto = new Producto("Descripcion",
                20,
                50.3,
                "Marca marcosa");

        //Esto es mejor que sea un for
        int indice = 0;

        while (indice < productos.size())
        {
            if (productos.get(indice).GetMarca().equals(marca))
            {
                productos.remove(indice);
                productos.remove(nuevoProducto);
                indice--;
            }
            indice++;
        }
    }
 }
