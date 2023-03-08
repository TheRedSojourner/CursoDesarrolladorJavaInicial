public class Producto {
    public Producto(String descripcion, int peso, double precio, String marca)
    {
        if (peso>500)
        {
            throw new IllegalArgumentException("Este producto pesa demasiado viejo ");
        }

        this.descripcion = descripcion;
        pesoKg = peso;
        this.precio = precio;
        this.marca = marca;

    }
    private String descripcion;
    private Integer pesoKg;
    private Double precio;
    private String marca;
    private static final Double minPrecio = 0.1;

    public String GetMarca()
    {
        return marca;
    }

    public void SetMarca(String marca)
    {
        this.marca = marca;
    }


}
