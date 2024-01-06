import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringJoiner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, size = 3;
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i=0; i<size; i++){
            System.out.print("Enter number" + i + " : "); num = input.nextInt();
            nums.add(num);
        }
        
        Collections.sort(nums);

        StringJoiner joiner = new StringJoiner(" < ");
        for(Integer e : nums){
            joiner.add(e.toString());
        }

        System.out.println(joiner.toString());
        input.close();
    }
}
