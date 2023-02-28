
public class Main {

    public static void main(String[] args) {
		/*Clase 1 - “Desarrollador Java inicial”
		Introducción a Algoritmos y Java
		1. Vamos a practicar operaciones básicas con números
		a. Utilizando la sentencia while, imprima todos los números entre 2 variables “a”
		y “b”. Su código puede arrancar (por ejemplo):
		int numeroInicio = 5;
		int numeroFin = 14;*/

        //Comentario ironico
        //comentario paradoxico

        int numeroInicial = 2;
        int numeroFin = 900;
        int marcador = numeroInicial;
        boolean soloPares = true;
        while (marcador<=numeroFin)
        {
            //Todos los numeros:
            //System.out.println(marcador);

            //Pares:
            if (soloPares && marcador%2 == 0)
            {
                System.out.println(marcador);
            }
            //Enumerador:
            marcador++;
        }



        /*for (int nuevoMarcador = numeroFin; nuevoMarcador >= 0; nuevoMarcador--)
        {
            System.out.println(nuevoMarcador);
        }
        /*
        float ingresos = 299000;
        int superficie = 20;
        int energia = 900;

        if ( (ingresos <= 748382.07) &&
                ( superficie <= 30) &&
                (energia <= 3330) )
               {System.out.println("Categoría A");}
        else if((ingresos <= 1112459.83) &&
         (superficie <= 45) &&
         (energia <= 5000) ) {
         System.out.println("Categoría B");
         }
        else {//categoria jota lololo
             }
        */
    }
}

/*

2*/