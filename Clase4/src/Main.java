import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        //MostraElSiguienteInputPorConsola();
        //boolean fueronIguales = Comparar();
        //CreameUnArchivo("x");
        ProgramaInterno();

        /*EscribirContenido(Paths.get("clase4/superarchivo.mp3") , "esto es mas contenido lolollllolol");
        String path = "C:\\Users\\Ice\\Desktop\\Java\\SuperArchivoDeTexto.txt";
        String otroPathValido = "C:/Users/Ice/Desktop/Java/SuperArchivoDeTexto.txt";
        String otroPathMas = "ArchivoRandom.txt";
        String yUnpathMas = "clase4/OtroMas.txt";

        System.out.println("Este es nuestro string path:" + path);
        System.out.println("Este es el contenido del archivo: "+ Files.readAllLines(Paths.get(path)));


        //Podemos usar el data type path en lugar de llamar Paths.get() cada vez que lo necesitemos
        Path unPath = Paths.get(yUnpathMas);
        System.out.println("Este es nuestro path guardado: "+ unPath);

        Files.writeString(Paths.get("ArchivoRandom.txt"), "hola\n que tal?\n");

        CrearArchivoConContenido(Paths.get("nuevo archivo.txt"), "Este es el contenido");
        CrearTemporal();


        int x = Sumar(5, 3);*/
        //System.out.println("Y al final, fueron iguales los numeros:" + fueronIguales);

    }

    public static int Sumar(int x, int i)
    {
        int resultado = x+i;
        if (resultado>5) {return resultado;}
        else{
            System.out.println(x);
            return resultado;
        }
    }

    public static boolean EsIgual(int x, int i)
    {
        return x == i;
    }

    public static void MostraStringPorConsola(String linea)
    {
        System.out.println(linea);
    }

    public static void MostraElSiguienteInputPorConsola()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor escriba su input");
        String linea = scanner.nextLine();
        System.out.println("Lo que escrbiste fue: "+linea);
    }

    private static void CrearArchivoConContenido(Path path, String contenido) throws IOException
    {
        if (!Files.exists(path))
        {
            Files.createFile(path);
            Files.writeString(path, contenido);
        }
    }

    public static void CrearTemporal() throws IOException
    {
        Path unTemporal = Files.createTempFile("unPrefijo",".txt");
        System.out.println(unTemporal);
    }

    public static void EscribirContenido(Path path, String contenido) throws IOException
    {
        Files.writeString(path,contenido);
    }

    public static boolean Comparar()
    {
        Scanner sncunnur = new Scanner(System.in);
        boolean sonIguales = false;
        int numero1;
        int numero2;
        System.out.println("Por favor integre su primer numero");
        numero1 = sncunnur.nextInt();
        System.out.println("Por favor integre su segundo numero");
        numero2 = sncunnur.nextInt();

        if (numero1 == numero2) sonIguales = true;
        return sonIguales;
    }

    public static void CreameUnArchivo(String path) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        String contenido = scanner.nextLine();

        Files.createFile(Paths.get(path));
        Files.writeString(Paths.get(path), contenido);
    }

    public static void ProgramaInterno()
    {
        boolean terminado = false;
        Scanner scanner = new Scanner(System.in);
        while (terminado == false)
        {
            System.out.println("Elija una opcion\n 1) Sumar\n 2) Restar \n 3) Salir");
            int input = scanner.nextInt();

            switch (input)
            {
                case 1:
                    System.out.println("Ingrese un segundo numero para sumar");
                    int i = scanner.nextInt();
                    Sumar(input, i);
                break;
                case 2: Restar(input);
                break;
                case 3: terminado = true;
                break;

                default: terminado = true;
                break;
            }

        }
    }

    public static void Restar(int x)
    {
        System.out.println(x-99);
    }

}