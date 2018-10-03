import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int range = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= range; i++) {
            System.out.printf("%d -> ", i);
            Check(i);
            System.out.println();
        }
    }

    public static void Check (int number) {
        int total = 0;
        while (number != 0) {
            total += (number % 10);
            number /= 10;
        }
        if (total == 5 || total == 7 || total == 11) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}
