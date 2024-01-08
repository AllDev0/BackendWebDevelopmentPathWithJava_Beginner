import java.util.Scanner;

public class TaximeterCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perKM = 2.2, startingCost = 10.0, minCost = 20.0, distance, expectedCost;
        System.out.print("Enter the distance : ");  distance = input.nextDouble();
        expectedCost = ((startingCost + distance*perKM) >= minCost) ? (startingCost + distance*perKM) : minCost;
        System.out.println("The Cost : " + expectedCost);
        input.close();
    }
}
