import java.util.Scanner;

public class ExerPokemon {
    public static void  main(String[] args) {
        Scanner scan = new Scanner(System.in);

        long powerN = Integer.parseInt(scan.nextLine());
        long distanceM = Integer.parseInt(scan.nextLine());
        long exhaustionFactorY = Integer.parseInt(scan.nextLine());

        long poked = 0;
        long originalPowerN = powerN / 2;

        while (powerN >= distanceM) {
            poked++;
            powerN -= distanceM;
            if (powerN == originalPowerN && exhaustionFactorY!= 0) {
                if (powerN / exhaustionFactorY >= 0){
                    powerN /= exhaustionFactorY;
                }
            }
        }

        System.out.println(powerN);
        System.out.println(poked);
    }
}
