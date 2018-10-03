import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double people = Integer.parseInt(scan.nextLine());
        double capacity = Integer.parseInt(scan.nextLine());

        double courses = Math.ceil(people / capacity);
        System.out.println(Math.round(courses));
    }
}
