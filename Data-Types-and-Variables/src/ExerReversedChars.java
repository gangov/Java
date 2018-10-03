import java.util.Scanner;

public class ExerReversedChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.next().charAt(0);
        char second = scan.next().charAt(0);
        char third = scan.next().charAt(0);

        System.out.printf("%c %c %c", third, second, first);
    }
}
