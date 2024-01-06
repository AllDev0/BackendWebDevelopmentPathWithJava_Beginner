import java.util.Scanner;

public class GreenGrocerCashBoxProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5.00;
        double purchasedPear, purchasedApple, purchasedTomato, purchasedBanana, purchasedEggplant, totalCost;

        System.out.print("Weight of pears purchased : ");   purchasedPear = input.nextDouble();
        System.out.print("Weight of apples purchased : ");   purchasedApple = input.nextDouble();
        System.out.print("Weight of tomatoes purchased : ");   purchasedTomato = input.nextDouble();
        System.out.print("Weight of bananas purchased : ");   purchasedBanana = input.nextDouble();
        System.out.print("Weight of eggplants purchased : ");   purchasedEggplant = input.nextDouble();

        totalCost = (purchasedPear * pearPrice) + (purchasedApple * applePrice) + (purchasedTomato * tomatoPrice) + (purchasedBanana * bananaPrice) + (purchasedEggplant * eggplantPrice);
        System.out.println("Total Cost : " + totalCost);
        input.close();
    }
}
