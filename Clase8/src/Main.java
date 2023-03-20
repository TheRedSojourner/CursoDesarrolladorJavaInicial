import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.zip.ZipEntry;

public class Main {
    public static void main(String[] args) {


        CarritoCompra carrito = new CarritoCompra();
        Producto zanahoria = new Producto(0);
        Producto abejas = new Producto(99999);

        MostrameLasListas(zanahoria);

        //carrito.AgregameUnItemAlCarrito(zanahoria);

        try {
            carrito.AgregameUnItemAlCarrito(zanahoria);
            carrito.AgregameUnItemAlCarrito(abejas);
        } catch (NoHayStockException e) {
            System.out.println("No hay stock de al menos uno de los productos");
        }

        /*for (int i = 0; i <carrito.productos.size() ; i++) {
            carrito.productos.get(i).getClass();
        }*/






        int i = 5;
        int j = 0;
        //int otroNum = i/j;

        //IntentaDividirPorZeroViejo(5, 0);
        //IntentaUsarUnInputViejo();


        System.out.println("Llegamos a esta linea");
    }

    public static void IntentaDividirPorZeroViejo(int i, int j)
    {
        try
        {
            int num = i/j;
        } catch (ArithmeticException e)
        {
            System.out.println("Caught Exception while trying to divide 100 by zero : "+e.toString());
        }
    }

    public static void IntentaUsarUnInputViejo()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribime un int, viejo");

        try
        {
            int num = scanner.nextInt();
            scanner.reset();
            int num2 = scanner.nextInt();


        }catch (InputMismatchException e)
        {
            System.out.println("Input mismatch viejo");
            System.err.println("Esto es lo mismo pero es un error viejo");
        }

        /*try
        {
            int num = scanner.nextInt();
            scanner.reset();
            int num2 = scanner.nextInt();


        }catch (ArithmeticException e)
        {
            System.out.println("Input mismatch viejo");
            System.err.println("Esto es lo mismo pero es un error viejo");
        }*/

    }

    public static void MostrameLasListas(Producto zanahoria)
    {





        ArrayList<Producto> lista = new ArrayList<Producto>();
        ArrayList<Producto> laMismaLista = lista;
        ArrayList<Producto> cloneList = new ArrayList<>(lista);


        HashSet<ArrayList> unHashSet = new HashSet<>();
        //FIRST IN FIRST OUT
        Queue<Producto> unaCola = new LinkedList<>();
        //LAST IN LAST OUT
        Stack<Producto> unaPila = new Stack<>();

        unHashSet.add(lista);

        for (int i = 0; i < unHashSet.size() ; i++) {
            System.out.println(i);
        }

        lista.add(zanahoria);
        lista.add(zanahoria);
        lista.add(zanahoria);
        lista.add(zanahoria);
        lista.add(zanahoria);
        lista.add(zanahoria);

        for (ArrayList listas: unHashSet) {
            //Asi iteramos sobre un hash

        }
        
        Map<String, Producto> unMap = new HashMap<>();
        unMap.put("Departamento 500", zanahoria);
        unMap.get("Departamento 500").Gritame();







        /*// Declaración de un Map (un HashMap) con clave "Integer" y Valor "String". Las claves pueden ser de cualquier tipo de objetos, aunque los más utilizados como clave son los objetos predefinidos de Java como String, Integer, Double ... !!!!CUIDADO los Map no permiten datos atómicos
        Map<Integer, String> nombreMap = new HashMap<Integer, String>();
        nombreMap.size(); // Devuelve el numero de elementos del Map
        nombreMap.isEmpty(); // Devuelve true si no hay elementos en el Map y false si si los hay
        nombreMap.put(K clave, V valor); // Añade un elemento al Map
        nombreMap.get(K clave); // Devuelve el valor de la clave que se le pasa como parámetro o 'null' si la clave no existe
        nombreMap.clear(); // Borra todos los componentes del Map
        nombreMap.remove(K clave); // Borra el par clave/valor de la clave que se le pasa como parámetro
        nombreMap.containsKey(K clave); // Devuelve true si en el map hay una clave que coincide con K
        nombreMap.containsValue(V valor); // Devuelve true si en el map hay un Valor que coincide con V
        nombreMap.values(); // Devuelve una "Collection" con los valores del Map*/

    }
}