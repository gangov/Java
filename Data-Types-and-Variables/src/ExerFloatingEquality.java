import java.util.Scanner;

public class ExerFloatingEquality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double first = Double.parseDouble(scan.nextLine());
        double second = Double.parseDouble(scan.nextLine());

        if (Math.abs(first - second) > 0.000001) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
