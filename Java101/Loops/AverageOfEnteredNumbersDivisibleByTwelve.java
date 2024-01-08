import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfEnteredNumbersDivisibleByTwelve{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter the number : ");    number = input.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<=number; i++) {
            if (i % 12 == 0) {
                list.add(i);
            }
        }

        if (list.size()-1 > 0) {
            System.out.println("Average : " + ( (list.stream().mapToInt(Integer::intValue).sum()) / (list.size() - 1)));
        } else{
            System.out.println("There was no number divisible by 3 and 4");
        }
        input.close();
    }
}