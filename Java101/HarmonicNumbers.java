import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double result = 0.0;
        System.out.print("Enter the n : ");    n = input.nextInt();
        for(int i=1; i<=n; i++){
            result += (1.0 / i);
        }
        System.out.println("Result : " + result);
        input.close();
    }
}
