public class Gato extends Felino{

    public Gato() {
        System.out.println("Soy un nuevo gato lololo");
    }

    public void SerExtremadamenteMolesto()
    {
        System.out.println("Soy un gato, es lo que hago. Miau");
    }

    public void Moverse()
    {
        System.out.println("Sonidos de gato, sonidos de gato");
    }
    public void Respirar() {

    }

    public String toString()
    {
        return getTipoanimal().toString()+" "+getHabitat();
    }
}




