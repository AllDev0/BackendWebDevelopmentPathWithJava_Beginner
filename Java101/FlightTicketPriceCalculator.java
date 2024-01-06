import java.util.Scanner;

public class FlightTicketPriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int distance, age, flightType;

        System.out.print("Enter distance : ");  distance = input.nextInt();
        if (distance <= 0) {
            System.out.println("You entered invalid distance.");
            input.close();
            return;
        }
        System.out.print("Enter age : "); age = input.nextInt();
        System.out.print("Enter flight type (1-One Way | 2-Round Trip) : "); flightType = input.nextInt();
        
        double discountRate = 0.0;

        if (age >= 0 && age < 12) {
            discountRate = 0.5;
        } else if(age >= 12 && age <= 24){
            discountRate = 0.1;
        } else if (age >= 25 && age <= 65) {
            discountRate = 0.0;
        } else if(age > 65){
            discountRate = 0.3;
        } else{
            discountRate = 0.0;
            System.out.println("Invalid age");
            input.close();
            return;
        }
        
        double totalCost = distance * 0.1;
        double discountedCost = totalCost - (totalCost * discountRate);
        if (flightType == 1) {
            System.out.println("Total Cost : " + discountedCost);
        } else if (flightType == 2) {
            discountedCost = (discountedCost - (discountedCost * 0.2)) * 2;
            System.out.println("Total Cost : " + discountedCost);
        } else{
            System.out.println("Invalid Flight Type");
            input.close();
            return;
        }

        input.close();
    }
}
