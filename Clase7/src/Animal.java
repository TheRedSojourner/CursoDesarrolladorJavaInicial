public abstract class Animal{

    private double peso;
    private HABITAT habitat;
    private TIPOANIMAL tipoanimal;
    private int numeroDePatas = 4;

    public void SetTipoAnimal(TIPOANIMAL tipoanimal)
    {
        this.tipoanimal = tipoanimal;
    }

    public TIPOANIMAL getTipoanimal() {
        return tipoanimal;
    }

    public void Moverse()
    {
        System.out.println("Soy un animal que se mueve ooooo");
    }

    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    public abstract void Respirar();


    public void setHabitat(HABITAT habitat) {
        this.habitat = habitat;
    }

    public HABITAT getHabitat() {
        return habitat;
    }
}
