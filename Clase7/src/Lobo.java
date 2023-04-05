public class Lobo extends Canino{

    public Lobo(String nombre) {
        super(nombre);
    }

    public void Aullar()
    {
        System.out.println("Soy un lobo. Auuuuuuuuu");
    }

    public void Domesticar()
    {
        //super.tipoanimal = TIPOANIMAL.DOMESTICO;
        SetTipoAnimal(TIPOANIMAL.DOMESTICO);
    }

    public void CambiameElNumeroDePatas(int patas)
    {
        setNumeroDePatas(patas);
        DejameLadrarViejo();

    }

    public void Respirar()
    {
        System.out.println("Respiro, respiro");
    }


}
