public class Animal {
    String nombre;
    double altura;
    double longitud;
    TIPOANIMAL tipoanimal;

    public void SetTipoAnimal(TIPOANIMAL tipoanimal)
    {
        this.tipoanimal = tipoanimal;
    }

    public void Moverse()
    {
        System.out.println("Soy un animal que se mueve ooooo");
    }
}
