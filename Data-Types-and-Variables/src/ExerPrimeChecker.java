import java.util.Scanner;

public class ExerPrimeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int limit = Integer.parseInt(scanner.nextLine());
        
        for (int i = 2; i <= limit; i++) {
            boolean checkPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    checkPrime = false;
                    break;
                }
            }
            System.out.printf("%d -> %b%n", i, checkPrime);
        }
    }
}

