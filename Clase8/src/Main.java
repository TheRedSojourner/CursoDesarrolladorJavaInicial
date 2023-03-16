import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i = 0;
        int j = 0;
        //int otroNum = i/j;

        IntentaDividirPorZeroViejo(0, 0);
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
}