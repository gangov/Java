import java.util.Scanner;

public class ExerTownName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        int population = Integer.parseInt(scan.nextLine());
        int square = Integer.parseInt(scan.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.", name, population, square);
    }
}
