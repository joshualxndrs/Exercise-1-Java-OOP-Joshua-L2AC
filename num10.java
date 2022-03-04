import java.util.Scanner;

public class num10 {
    public static void main(String[] args) {
        Scanner input_num = new Scanner(System.in);
        System.out.print("Input Num a: ");
        double a = input_num.nextDouble();
        System.out.print("Input Num b: ");
        double b = input_num.nextDouble();
        System.out.print("Input Num c: ");
        double c = input_num.nextDouble();

        System.out.println("----------------------------------");

        double mean = (a + b + c) / 3.0;

        double variance = ((a - mean) * (a - mean) + (b - mean) * (b - mean) + (c - mean) * (c - mean)) / 3.0;
        double stand_dev = Math.sqrt(variance);

        System.out.println("Mean = " + mean);
        System.out.println("Variance = " + variance);
        System.out.println("Standard deviation = " + stand_dev);

        input_num.close();
    }
}
