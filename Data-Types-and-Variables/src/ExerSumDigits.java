import java.util.Scanner;

public class ExerSumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int total = 0;

        while (number != 0) {
            total += number % 10;
            number /= 10;
        }

        System.out.println(total);
    }
}
