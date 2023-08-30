import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("No proporcionaste una cadena como argumento.");
            return;
        }

        String entrada = args[0];

        // Expresión regular 1: Validar "Hola mundo"
        String regex1 = "\\bHola mundo\\b";
        Pattern pattern1 = Pattern.compile(regex1);
        Matcher matcher1 = pattern1.matcher(entrada);
        if (matcher1.matches()) {
            System.out.println("La cadena SI es una coincidencia válida para la expresión 1.");
        } else {
            System.out.println("La cadena NO es una coincidencia válida para la expresión 1.");
        }

        // Expresión regular 2: Validar "Hola mundo" sin distinción de mayúsculas y minúsculas
        String regex2 = "(?i)Hola mundo";
        Pattern pattern2 = Pattern.compile(regex2);
        Matcher matcher2 = pattern2.matcher(entrada);
        if (matcher2.find()) {
            System.out.println("La cadena SI es una coincidencia válida para la expresión 2.");
        } else {
            System.out.println("La cadena NO es una coincidencia válida para la expresión 2.");
        }

        // Expresión regular 3: Validar palabras de la lista
        String regex3 = "\\b(Java|Python|Go|Pascal|Perl)\\b";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(entrada);
        if (matcher3.find()) {
            System.out.println("La cadena SI es una coincidencia válida para la expresión 3.");
        } else {
            System.out.println("La cadena NO es una coincidencia válida para la expresión 3.");
        }

        // Expresión regular 4: Validar correos de la Universidad de Sonora
        String regex4 = "^[A-Za-z0-9._%+-]+@(unison|uson)\\.mx$";
        Pattern pattern4 = Pattern.compile(regex4);
        Matcher matcher4 = pattern4.matcher(entrada);
        if (matcher4.matches()) {
            System.out.println("La cadena SI es una coincidencia válida para la expresión 4.");
        } else {
            System.out.println("La cadena NO es una coincidencia válida para la expresión 4.");
        }

        // Expresión regular 5: Validar nombres de archivo con formato específico
        String regex5 = "^ISI\\d{4}-(1|2)\\.(txt|csv)$";
        Pattern pattern5 = Pattern.compile(regex5);
        Matcher matcher5 = pattern5.matcher(entrada);
        if (matcher5.matches()) {
            System.out.println("La cadena SI es una coincidencia válida para la expresión 5.");
        } else {
            System.out.println("La cadena NO es una coincidencia válida para la expresión 5.");
        }
    }
}

//Beltran Calvo Brayan #222217084
