import java.util.Scanner;

class conditionalStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            int Marks = sc.nextInt();

            if (Marks < 50) {
                System.out.println("Failed");
            } else if (Marks < 60) {
                System.out.println("D grade");
            } else if (Marks < 70) {
                System.out.println("C grade");
            } else if (Marks < 80) {
                System.out.println("B grade");
            } else if (Marks < 90) {
                System.out.println("A grade");
            } else if (Marks <= 100) {
                System.out.println("O grade");
            } else {
                System.out.println("Invalid");
            }
        }    
}
}
