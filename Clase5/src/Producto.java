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


    private String descripcion = "Esta es una descripcion, viejo. Acordate de cambiarla despues";
    private Integer pesoKg;
    public Double precio;
    private String marca;
    private static final Double minPrecio = 0.1;

    /*public void CambiameElPrecioMinimo(double precio)
    {
        minPrecio = precio;
    }*/


    public String GetMarca()
    {
        return marca;
    }

    public String MostrameUnaMarcaYDevolvelaYaQueEstamos()
    {
        System.out.println(marca);
        return marca;
    }

    public String SetMarca(String marca)
    {
        if (marca == "MarcaMarcosa")
        {
            System.out.println("Esta marca ya no existe viejo, basta");
        } else {
            this.marca = marca;
        }
        return this.marca;
    }

    public void HacerAlgo()
    {
        descripcion += "AAAAAAAAAA";
        System.out.println(descripcion);
    }

    public String GetDescripcion()
    {
        return descripcion;
    }

    public void MostrameTuDescripcion()
    {
        System.out.println(descripcion);
    }

    public void MostrameTuPrecioMinimo()
    {
        System.out.println("Este objeto es: "+this.getClass()+" y el precio es:"+ minPrecio);
    }


}
