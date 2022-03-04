import java.util.Scanner;

public class num14 {
    public static void main(String[] args) {
        Scanner input_sec = new Scanner(System.in);
        System.out.print("Input seconds to be converted: ");

        int sec_input = input_sec.nextInt();
        int hour = sec_input / 3600;
        int min = (sec_input % 3600) / 60;
        int sec = (sec_input % 3600) % 60;

        System.out.println("--------------------------------------------------------------------");

        System.out.print(hour + " Hours: " + min + " Minutes :" + " " + sec + " Seconds ");
        System.out.print("\n");

        input_sec.close();
    }
}
