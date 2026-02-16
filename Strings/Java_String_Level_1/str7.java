import java.util.Scanner;

public class Main {

    public static void generate(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    public static void handle(String text) {
        try {
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
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
