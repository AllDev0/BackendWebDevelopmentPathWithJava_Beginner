import java.util.Scanner;

public class EventSuggestor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double temperature;
        System.out.print("Enter the temperature : "); temperature = input.nextDouble();
        if (temperature < 5) {
            System.out.println("You can ski.");
        } else if (temperature >= 5 && temperature < 10) {
            System.out.println("You can go to the cinema.");
        } else if (temperature >= 10 && temperature < 15) {
            System.out.println("You can go to the cinema or on a picnic.");
        } else if(temperature >= 15 && temperature < 25){
            System.out.println("You can go on a picnic.");
        } else{
            System.out.println("You can go swimming.");
        }

        input.close();
    }
}
