import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, total = 0;
        System.out.print("Enter the number : ");    num = input.nextInt();

        for(int i=1; i<=num/2; i++){
            if (num % i == 0) {
                total += i;
            }
        }

        System.out.println(num + ((num == total) ? " is a perfect number." : " is not a perfect number."));
        input.close();
    }
}
