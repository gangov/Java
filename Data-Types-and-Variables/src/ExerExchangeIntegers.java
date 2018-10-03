import java.util.Scanner;

public class ExerExchangeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = Integer.parseInt(scan.nextLine());
        int second = Integer.parseInt(scan.nextLine());
        int spare = 0;

        System.out.println("Before:");
        System.out.printf("a = %d", first);
        System.out.println();
        System.out.printf("b = %d", second);
        System.out.println();

        spare = first;
        first = second;
        System.out.println("After:");
        System.out.printf("a = %d", first);
        System.out.println();
        System.out.printf("b = %d", spare);

    }
}
