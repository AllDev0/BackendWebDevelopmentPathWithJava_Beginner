import java.util.Scanner;

public class VATCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float price = 0;
        boolean isValidPrice = false;
        
        while (!isValidPrice) {
            System.out.print("Enter price of the product : ");  price = input.nextFloat();
            if (price < 0) {
                System.out.print("\033c");
                System.out.println("Invalid price. Price cannot be smaller than 0.");
            } else{
                isValidPrice = true;
            }
        }

        double vatRate = (price > 1000) ? 0.08 : 0.18;
        System.out.println("The price is without VAT : " + price);
        System.out.println("The price is with VAT : " + (price + price * vatRate));
        System.out.println("The VAT price is : " + price*vatRate);
    }
}
