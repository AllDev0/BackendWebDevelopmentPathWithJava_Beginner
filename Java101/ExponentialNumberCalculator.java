import java.util.Scanner;

public class ExponentialNumberCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, exponent, result = 1;
        System.out.print("Enter the base number : ");   base = input.nextInt();
        System.out.print("Enter the exponent number : ");   exponent = input.nextInt();
        for(int i=1; i<= exponent; i++){
            result *= base;
        }
        System.out.println("Result : " + result);
        input.close();
    }
}