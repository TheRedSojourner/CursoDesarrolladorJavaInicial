public abstract class Canino extends Animal{


    public Canino(String nombre)
    {

    }
    public void Moverse()
    {
        System.out.println("Este es un canino que se mueve oo");
    }
    private static void Ladrar() {System.out.println("miau miau");}

    public void DejameLadrarViejo()
    {
        Ladrar();

    }
}


