import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int limit = Integer.parseInt(scan.nextLine());

        for (int i = 97; i < limit + 97; i++) {
            for (int j = 97; j < limit + 97; j++) {
                for (int k = 97; k < limit + 97; k++) {
                    System.out.print(Character.toString((char) i));
                    System.out.print(Character.toString((char) j));
                    System.out.println(Character.toString((char) k));
                }
            }
        }
    }
}
