import java.math.BigDecimal;
import java.util.Scanner;

public class SumRealNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbers = Integer.parseInt(scan.nextLine());

        BigDecimal total = new BigDecimal("0");

        for (int i = 0; i < numbers; i++) {
        //    BigDecimal tempNum = ;
            total = total.add(scan.nextBigDecimal());
        }

        System.out.println(total);
    }
}



