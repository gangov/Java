import java.util.Scanner;

public class ExerSnowballs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        int snowballSnow = 0;
        int snowballTime = 0;
        int snowballQuality = 0;
        long snowballValue = 0;

        for (int i = 0; i < count; i++) {
            int snowballSnowTemp = Integer.parseInt(scan.nextLine());
            int snowballTimeTemp = Integer.parseInt(scan.nextLine());
            int snowballQualityTemp = Integer.parseInt(scan.nextLine());
            long snowballValueTemp = 0;

            snowballValueTemp = (long) Math.pow((snowballSnowTemp / snowballTimeTemp), snowballQualityTemp);

            if (snowballValue <= snowballValueTemp) {
                snowballSnow = snowballSnowTemp;
                snowballTime = snowballTimeTemp;
                snowballQuality = snowballQualityTemp;
                snowballValue = snowballValueTemp;
            }
        }

        System.out.printf("%d : %d = %d (%d)"
                , snowballSnow, snowballTime, snowballValue, snowballQuality);
    }
}

