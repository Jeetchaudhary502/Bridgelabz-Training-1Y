import java.util.Scanner;

public class Main {

    public static void generate(String s) {
        System.out.println(s.charAt(s.length()));
    }

    public static void handle(String s) {
        try {
            System.out.println(s.charAt(s.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            generate(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception generated in generate()");
        }

        handle(text);

        
    }
}
