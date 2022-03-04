import java.util.Scanner;

public class num9 {
    public static void main(String[] Strings) {

        Scanner inputtemp = new Scanner(System.in);

        System.out.print("Input temperature in Celsius: ");
        double celsius = inputtemp.nextDouble();

        System.out.println("--------------------------------------------------------------------");

        double fahrenheit = ((9 * celsius / 5.0) + 32.0);
        System.out.println(celsius + " degree celsius is equal to " + fahrenheit + " in Fahrenheit");

        inputtemp.close();
    }

}
