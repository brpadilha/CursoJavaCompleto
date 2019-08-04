import java.util.Locale;
import java.util.Scanner;

/**
 * entradaDeDados2
 */
public class entradaDeDados2 {
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt(); //35
        sc.nextLine(); //flush - limpeza de stream de entrada
        String name = sc.nextLine(); //Bob Brown
        char gender = sc.next().charAt(0); //F
        String s = sc.next(); //b5
        char letter = s.charAt(0); //pega só o b
        int digit = Integer.parseInt(s.substring(1));  //pega só o 5 e transforma em inteiro.

        double n2 = sc.nextDouble();

        //Maria F 23 1.68
        String name2 = sc.next();
        char ch =sc.next().charAt(0);
        int age = sc.nextInt();
        double height = sc.nextDouble();


        System.out.println("-----");
        System.out.println(n1);
        System.out.println(name);
        System.out.println(gender);
        System.out.println(letter);
        System.out.println(digit);
        System.out.println(n2);
        System.out.println(name2);
        System.out.println(ch);
        System.out.println(age);
        System.out.println(height);

        sc.close();
    }
}