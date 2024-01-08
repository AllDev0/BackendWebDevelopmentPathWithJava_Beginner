import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r;
        System.out.print("Enter n : "); n = input.nextInt();
        System.out.print("Enter r : "); r = input.nextInt();
        int result = factorialCalculator(n) / (factorialCalculator(r)  * (factorialCalculator(n-r)));
        System.out.println("Result : " + result);
        input.close();
    }

    private static int factorialCalculator(int num){
        if(num <= 1 )
            return 1;
        else
            return num*factorialCalculator(num - 1);
    }
}
