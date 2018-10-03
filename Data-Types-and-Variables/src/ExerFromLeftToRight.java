import java.util.Scanner;

public class ExerFromLeftToRight {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rows; i++) {
            String input = scan.nextLine();
            SplitString(input);
        }
    }

    public static void SplitString(String inputString) {
        String[] numbers = inputString.split(" ");
        long leftPart = Long.parseLong(numbers[0]);
        long rightPart = Long.parseLong(numbers[1]);

        if (leftPart > rightPart) {
            System.out.println(ReturnSum(leftPart));
        } else {
            System.out.println(ReturnSum(rightPart));
        }
    }

    public static long ReturnSum(long number) {
        int total = 0;
        while (number != 0) {
            total += number % 10;
            number = number / 10;
        }
        return total;
    }
}
