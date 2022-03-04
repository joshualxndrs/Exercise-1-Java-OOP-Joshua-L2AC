import java.util.Scanner;

public class num11 {
    public static void main(String[] args) {
        int x, y, z;

        Scanner inputnum = new Scanner(System.in);

        System.out.println("Select the first number to swap (x): ");
        x = inputnum.nextInt();
        System.out.println("Select the first number to swap (y): ");
        y = inputnum.nextInt();

        System.out.println("--------------------------------------------------------------------");

        z = y;
        y = x;
        x = z;

        System.out.println("The result of the swap between x and y are: " + x + "(x)" + " and " + y + "(y) .");
        inputnum.close();
    }
}
