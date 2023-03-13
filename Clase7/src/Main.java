import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal();

        animal1.SetTipoAnimal(TIPOANIMAL.ANFIBIO);

        Vertebrado verty = new Vertebrado();
        Invertebrado inverty = new Invertebrado();


        ArrayList<Animal> animales = new ArrayList<Animal>();
        animales.add(verty);
        animales.add(inverty);
        int num = 0;



        for (int i = 0; i <animales.size() ; i++) {
            animales.get(i).Moverse();

        }

        for (Animal ani: animales) {
            ani.Moverse();

        }
        int i = 0;
        do {
            System.out.println("Entramos viejo, ooo");
            i++;
        }
        while (i< animales.size());






    }
}