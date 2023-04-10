import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //https://regex101.com

        final String regex = ".* (([a-z]|[0-9])+@[a-z]+\\.[a-z]+).* ([0-9]+)$";

        final String string = "Maria es docente, su email es maria123@gmail.com y su DNI es 31605906";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);

        final Matcher matcher = pattern.matcher(string);


        matcher.find();

        System.out.println("Full match: " + matcher.group(0));

        for (int i = 1; i <= matcher.groupCount(); i++) {
            System.out.println("Group " + i + ": " + matcher.group(i));
        }
    }
}