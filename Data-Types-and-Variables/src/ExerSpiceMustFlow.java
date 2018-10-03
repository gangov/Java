import java.util.Scanner;

public class ExerSpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long starting = Integer.parseInt(scan.nextLine());
        long days = 0;
        long yielded = 0;

        if (starting < 100) {
            System.out.println(0);
            System.out.println(0);
        } else {
            while (starting >= 100) {
                days += 1;
                yielded += starting;
                starting -= 10;
                yielded -= 26;
            }

            yielded -= 26;

            System.out.println(days);
            System.out.println(yielded);
        }
    }
}