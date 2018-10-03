import java.util.Scanner;

public class ContactNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine();
        String second = scan.nextLine();
        String delimiter = scan.nextLine();

        System.out.printf("%s%s%s", first, delimiter, second);
    }
}
