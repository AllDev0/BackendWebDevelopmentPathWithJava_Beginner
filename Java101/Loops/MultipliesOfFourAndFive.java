import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class MultipliesOfFourAndFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, counter = 1;
        boolean flag = true;
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Enter the number : ");    number = input.nextInt();
        while (flag) {
            int powOf4 = (int) Math.pow(4, counter);
            int powOf5 = (int) Math.pow(5, counter);
            if (powOf4 <= number) {
                list.add(Integer.valueOf(powOf4));
            }

            if (powOf5 <= number) {
                list.add(Integer.valueOf(powOf5));
            }

            if (powOf4 > number) {
                flag = false;
            }

            counter++;
        }
        StringJoiner joiner = new StringJoiner(", ");
        for(Integer e : list){
            joiner.add(e.toString());
        }
        System.out.println(joiner.toString());
        input.close();
    }
}
