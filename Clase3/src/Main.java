import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //Clase 3: Listas y arreglos
        //Clase 4: Funciones y file system

        /*Utilizando solo tipos primitivos, String (solo usar método length), vectores,
            iteraciones simples y condicionales, genere una clase por ejercicio que posea los
            siguientes métodos:
        a. Dado un String y una letra, que cuente la cantidad de apariciones de la letra en
        el String*/

        CountThisCharacter('a', "Una Frase De Ejemplo");

        /*
        b. Dados 3 números y un orden (ascendente o decreciente) que ordene los
        mismos y los retorne en un vector de 3*/
        GetVectorAfterOrdering(55, 32, 199, false);

        /*
        c. dado un vector de números, y un número X, que sume todos los números > X y
        retorne el resultado*/

        SumarTodosLosNumerosMayorA(100);

        /*
        2. Genere una clase que tenga los métodos para realizar la codificación y decodificación
        de un string, dado un número de desplazamiento.
● Por ejemplo, con desplazo de 1:
“hola que tal” -> “ipmbarvfaubm”
        h -> i
        o -> p
● con desplazo de 2
“hola que tal” -> “jqncbswgbvcn”
        h -> j
        o -> q
        En el ejemplo estoy usando este abecedario: "abcdefghijklmnñopqrstuvwxyz "
        Para este ejercicio puede usar todos los métodos de String, tanto de instancia (por
        ejemplo length) como de clase, por ejemplo String.valueOf(arr) # donde
        arr es un char[]. Tenga a mano los javadocs del mismo

         */
    }

    public static void CountThisCharacter(char caracterBuscado, String frase)
    {
        String nuestroPrimerString;

        int contador = 0;
        for (int i = 0; i <frase.length() ; i++) {
            if (frase.charAt(i) == caracterBuscado)
            {
                contador++;
            }
        }
        System.out.println("Encontramos "+ contador + " veces el caracter "+caracterBuscado);
    }

    public static void GetVectorAfterOrdering(int num1, int num2, int num3, boolean ascending)
    {
        int[] nuestroVector = new int[3];
        nuestroVector[0] = num1;
        nuestroVector[1] = num2;
        nuestroVector[2] = num3;
        if (ascending)
        {
            Arrays.sort(nuestroVector);
        } else
        {
            //Si queremos ordenar un array en order descendiente, es un poco mas complicado
            //primero ordenamos el array usando Sort
            Arrays.sort(nuestroVector);
            //Luego, tenemos que invertir las posiciones del array una a una hasta la mitad.

            for(int i = 0; i < nuestroVector.length / 2; i++)
            {
                int temp = nuestroVector[i];
                nuestroVector[i] = nuestroVector[nuestroVector.length - i - 1];
                nuestroVector[nuestroVector.length - i - 1] = temp;
            }
        }

        for (int i = 0; i <nuestroVector.length ; i++) {
            System.out.println(nuestroVector[i]);
        }
    }

    public static void SumarTodosLosNumerosMayorA(int x)
    {
        /* c. dado un vector de números, y un número X, que sume todos los números > X y
        retorne el resultado*/
        int[] nuestroArray = new int[5];
        nuestroArray[0] = 99;
        nuestroArray[1] = 1;
        nuestroArray[2] = 444;
        nuestroArray[3] = 3456;
        nuestroArray[4] = 4;

        int suma = 0;
        for (int i = 0; i <nuestroArray.length ; i++) {
            if (nuestroArray[i]>x)
            {
                suma += nuestroArray[i];
            }
        }

        

         System.out.println("La suma de todos los numeros mayores a X ("+x+") dentro del array da como total: "+suma);
    }
}