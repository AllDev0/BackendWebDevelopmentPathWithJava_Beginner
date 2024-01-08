package Java101.Arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class SortArray {
    public static void main(String[] args) {
        System.out.println("\033c");
        Scanner input = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of list : ");  size = input.nextInt();
        int list[] = new int[size];
        for(int i=0; i<size; i++) {
            int num;
            System.out.print("Enter the number" + (i + 1) + " : ");   num = input.nextInt();
            list[i] = num;
        }
        Arrays.sort(list);
        StringJoiner joiner = new StringJoiner(" ");
        for(int n : list){
            joiner.add(String.valueOf(n));
        }
        System.out.println(joiner.toString());
        input.close();
    }
}
