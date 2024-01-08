import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the number : ");    num = input.nextInt();
        System.out.println(isPrime(num) ? (num + " is a prime number.") : (num + " is not a prime number"));
        input.close();
    }

    private static boolean isPrime(int num){
        boolean isPrime = true;
        if (num < 2) {
            return false;
        } else{
            for(int i=2; i<=Math.sqrt(num); i++){
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            return isPrime;
        }
    }
}
