import java.util.Scanner;
import java.lang.Math;

public class num13 {
    public static void main(String[] Strings) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num a: ");
        double Num_a = in.nextDouble();
        System.out.print("Enter num b: ");
        double Num_b = in.nextDouble();
        System.out.print("Enter num c: ");
        double Num_c = in.nextDouble();

        double det = Num_b * Num_b - 4.0 * Num_a * Num_c;

        System.out.println("--------------------------------------------------------------------");

        if (det > 0.0) {
            double count1 = (-Num_b + Math.pow(det, 0.5)) / (2.0 * Num_a);
            double count2 = (-Num_b - Math.pow(det, 0.5)) / (2.0 * Num_a);
            System.out.println("Root equates to " + count1 + " and " + count2);
        } else if (det == 0.0) {
            double count1 = -Num_b / (2.0 * Num_a);
            System.out.println("Root equates to " + count1);
        } else {
            System.out.println("These roots are not real.");
        }

        in.close();
    }

    // x1 = NaN || x2 = -Infinity//
}