import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, first = 0, second = 1, temp;
        System.out.print("Enter the number for index of last digit of Fibonacci Sequence : ");    num = input.nextInt();
        System.out.print(first + " " + second + " ");
        for(int i=0; i<num-2; i++){
            temp = first + second;
            first = second;
            second = temp;
            System.out.print(second + " ");
        }
        input.close();
    }
}
