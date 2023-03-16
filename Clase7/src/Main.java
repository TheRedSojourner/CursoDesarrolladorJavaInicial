import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Clase 7: Herencia, polimorfismo, un poco de casteo, y foreach ya que estamos

        /*Animal animal1 = new Animal();

        animal1.SetTipoAnimal(TIPOANIMAL.DOMESTICO);


*/


        Gato gatito = new Gato();
        Tigre tigrito = new Tigre();
        Perro aquaPerro = new Perro(HABITAT.OCEANICO);
        Lobo lobito = new Lobo();
        Lobo lobazo = new Lobo();
        Lobo wolverine = new Lobo();
        Gato kdjgdkflgj = new Gato();
        gatito.SetTipoAnimal(TIPOANIMAL.DOMESTICO);
        gatito.setHabitat(HABITAT.MONTAÑOSO);

        //lobito.toString();



        lobito.SetTipoAnimal(TIPOANIMAL.NODOMESTICO);
        lobazo.SetTipoAnimal(TIPOANIMAL.DOMESTICO);


        System.out.println(lobazo.getTipoanimal());;

        ArrayList<Animal> animales = new ArrayList<Animal>();

        animales.add(gatito);
        animales.add(tigrito);
        animales.add(aquaPerro);
        animales.add(lobito);
        animales.add(kdjgdkflgj);
        animales.add(wolverine);


        gatito.SerExtremadamenteMolesto();



        for (int i = 0; i <animales.size() ; i++) {
            animales.get(i).Moverse();

            Animal esteAnimal = animales.get(i);


            if (esteAnimal.getClass() == Gato.class)
            {
                ((Gato)animales.get(i)).SerExtremadamenteMolesto();
            }
            else if (animales.get(i).getClass().equals(Lobo.class))
            {
                ((Lobo)esteAnimal).Aullar();
            }

        }

        System.out.println(gatito.toString());
        /*
        ArrayList<Double> doubles = new ArrayList<>();
        doubles.add(5.3);
        doubles.add(1.0);
        doubles.add(5.6);
        doubles.add(1.3);
        doubles.add(3.3);



        for (Double dobby: doubles) {
            dobby++;
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
*/


        CalcuulameEstoviejo();
    }

    public static void CalcuulameEstoviejo()
    {

        int[][] masNums = new int[5][10];
        int[][][][] multiDimensional = new int[10][10][10][10];
        int contador = 0;


        /*for (int i = 0; i <masNums.length ; i++) {
            for (int j = 0; j <masNums[0].length ; j++) {
                masNums[i][j] = i+j;
                System.out.println("estas son las coordenadas "+i+" "+j);
            }
        }*/

        for (int i = 0; i < multiDimensional.length ; i++) {
            for (int j = 0; j <multiDimensional[0].length ; j++) {
                for (int k = 0; k < multiDimensional[0][0].length ; k++) {
                    for (int l = 0; l <multiDimensional[0][0][0].length; l++) {
                        System.out.println("estas son las coordenadas "+i+" "+j+" "+k+" "+l);
                        contador++;
                    }
                }
            }
        }
        System.out.println(contador);
    }
}