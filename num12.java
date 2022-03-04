import java.lang.Math;

public class num12 {
    public static void main(String[] args) {
        System.out.println("Number\tSquare\tCube");

        for (int x = 0; x <= 10; x++) {
            System.out.println(x + "\t" + (int) Math.pow(x, 2) + "\t" + (int) Math.pow(x, 3));
            ;
        }
    }
}