public class Perro extends Canino implements SuperInterfaz{


    String raza;
    public Perro(HABITAT habitat)
    {
        setHabitat(habitat);
    }
    public void Respirar() {

        raza = "labrador";

    }
    public void UnaAccion()
    {

    }

    public void Moverse()
    {
        System.out.println("Perro peroroeproeproeproepropeor");
    }
}
