import java.util.Scanner;

public class ExerLowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int entered = (int) (scan.next().charAt(0));

        if (entered >= 65 && entered <= 90) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
