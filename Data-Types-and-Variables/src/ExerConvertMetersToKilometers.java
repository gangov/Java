import java.util.Scanner;

public class ExerConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double meters = Double.parseDouble(scan.nextLine());
        System.out.printf("%.2f", meters / 1000);
    }
}
