import java.util.Scanner;

public class Main {

    public static void generate(String[] arr) {
        System.out.println(arr[arr.length]);
    }

    public static void handle(String[] arr) {
        try {
            System.out.println(arr[arr.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        try {
            generate(names);
        } catch (RuntimeException e) {
            System.out.println("Exception generated in generate()");
        }

        handle(names);

    }
}
