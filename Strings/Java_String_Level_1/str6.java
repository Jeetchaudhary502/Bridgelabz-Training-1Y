import java.util.Scanner;

public class Main {

    public static void generate(String s) {
        System.out.println(s.substring(5, 2));
    }

    public static void handle(String s) {
        try {
            System.out.println(s.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        try {
            generate(text);
        } catch (RuntimeException e) {
            System.out.println("Exception generated in generate()");
        }

        handle(text);

    }
}
