/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        double a;
        int b;
        
        a = 5.7;
        b = (int)a; //haverá perda de informação

        int c, d;
        double result;

        c = 5;
        d = 2;

        result = c / d;

        
        System.out.println(b);
        System.out.println(result);
    }
}