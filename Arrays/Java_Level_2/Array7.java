import java.util.Scanner;

class BMI2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {

            double weight;
            do {
                weight = sc.nextDouble();
            } while (weight <= 0);

            double height;
            do {
                height = sc.nextDouble();
            } while (height <= 0);

            personData[i][0] = weight;
            personData[i][1] = height;
        }

        for (int i = 0; i < number; i++) {
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi;

            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println(
                "Height: " + personData[i][1] +
                " Weight: " + personData[i][0] +
                " BMI: " + personData[i][2] +
                " Status: " + weightStatus[i]
            );
        }

    }
}
