import java.util.Scanner;

public class RecursiveFibonacciSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, first = 0, second = 1, temp;
        System.out.print("Enter the number for index of last digit of Fibonacci Sequence : ");    num = input.nextInt();
        for(int i=0; i<num; i++){
            System.out.print(fib(i) + " ");
        }
        input.close();
    }

    private static int fib(int num){
        if (num == 0 || num == 1) {
            return num;
        }

        return fib(num - 1) + fib(num - 2);
    }
}
