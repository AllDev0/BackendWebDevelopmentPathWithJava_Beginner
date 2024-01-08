import java.util.Scanner;

public class GCDAndLCMFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter the num1 : ");  num1 = input.nextInt();
        System.out.print("Enter the num2 : ");  num2 = input.nextInt();
        System.out.println("GCD : " + findGCD(num1, num2));
        System.out.println("LCM : " + findLCM(num1, num2));
        input.close();
    }

    private static int findGCD(int num1, int num2){
        int counter = 2, gcd = 1;
        while(counter < (num1 > num2 ? num1 : num2)){
            if(num1 % counter == 0 && num2 % counter == 0){
                gcd *= counter;
                num1 /= counter;
                num2 /= counter;
            } else{
                counter++;
            }
        }

        return gcd;
    }

    private static int findLCM(int num1, int num2){
        return (num1 * num2) / findGCD(num1, num2);
    }
}
