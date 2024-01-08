import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BiggestAndSmallestNumberFinder {
    /*
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count, num;
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter the number of numbers you want to enter : "); count = input.nextInt();
        for(int i=1; i<=count; i++) {
            System.out.print("Enter the number" + i + " : ");   num = input.nextInt();
            list.add(num);
        }
        Collections.sort(list);
        System.out.println("The smallest number : " + list.get(0));
        System.out.println("The biggest number : " + list.get(list.size()-1));

        input.close();
    }
    */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count, num;
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        System.out.print("Enter the number of numbers you want to enter : "); count = input.nextInt();
        for(int i=1; i<=count; i++) {
            System.out.print("Enter the number" + i + " : ");   num = input.nextInt();
            if (num > max) {
                max = num;
            }

            if (num < min) {
                min = num;
            }
        }
        
        System.out.println("The smallest number : " + min);
        System.out.println("The biggest number : " + max);

        input.close();
    }
}
