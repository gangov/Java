import java.util.Scanner;

public class ExerDataTypeFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            var inputVar = scan.nextLine();
            if (inputVar.equalsIgnoreCase("END")) {
                break;
            } else if (inputVar.matches("^\\d+(\\d+)?")) {
                System.out.printf("%s is integer type", inputVar);
                System.out.println();
            } else if (inputVar.matches("^\\d+(\\.\\d+)?")) {
                System.out.printf("%s is floating point type", inputVar);
                System.out.println();
            } else if (inputVar.matches("[A-Za-z]{1}")) {
                System.out.printf("%s is character type", inputVar);
                System.out.println();
            } else if (inputVar.toLowerCase().matches("(^[a-z]+$)")) {
                System.out.printf("%s is string type", inputVar);
                System.out.println();
            } else if (inputVar.matches("(true|false)")) {
                System.out.printf("%s is boolean type", inputVar);
                System.out.println();
            }
        }
    }
}
