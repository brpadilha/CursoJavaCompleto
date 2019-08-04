import java.util.Locale;


/**
 * Programa
 */
public class Programa {

    public static void main(String[] args) {
        char gender = 'F'; //%c
        int age = 32; //%d
        double balance = 10.35784; //%2f
        String name = "Maria"; //%s

        System.out.print("Good Morning!");
        System.out.println("Good afternoon!");
        System.out.println("Good night!");
        System.out.println("------------------------");
        System.out.printf("%.2f%n", balance);
        System.out.printf("%.4f%n", balance);

        Locale.setDefault(Locale.US); //coloca as letras com padrão americano
        System.out.printf("%.4f", balance);

        System.out.println("--------------");
        System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins%n ", name, age, gender, balance);
    }
}