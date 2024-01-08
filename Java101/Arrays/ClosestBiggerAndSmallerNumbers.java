package Java101.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestBiggerAndSmallerNumbers {
    public static void main(String[] args) {
        System.out.println("\033c");
        Scanner input = new Scanner(System.in);
        int number, closestSmaller, closestBigger;
        System.out.print("Enter the number : ");    number = input.nextInt();
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int[] sortedList = Arrays.copyOf(list, list.length);
        Arrays.sort(sortedList);
        closestSmaller = sortedList[0];
        closestBigger = sortedList[sortedList.length-1];
        for(int n : list){
            if (number > n && n > closestSmaller) {
                closestSmaller = n;
            }

            if (number < n && n < closestBigger) {
                closestBigger = n;
            }
        }
        System.out.println("Closest Smaller Number : " + closestSmaller);
        System.out.println("Closest Bigger Number : " + closestBigger);

        input.close();
    }
}
