import java.util.Scanner;

public class ExponentialNumberCalculatorRecursively {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, exponent;
        System.out.print("Enter the base : ");  base = input.nextInt();
        System.out.print("Enter the exponent : ");  exponent = input.nextInt();
        System.out.println("Result : " + calculateExponentialNumber(base, exponent));
        input.close();
    }

    private static int calculateExponentialNumber(int base, int exponent){
        if (exponent == 0) {
            return 1;
        } else{
            return base * calculateExponentialNumber(base, exponent-1);
        }
    }
}
