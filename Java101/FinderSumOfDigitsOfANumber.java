import java.util.Scanner;

public class FinderSumOfDigitsOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, length, result = 0;
        System.out.print("Enter the num : ");   number = input.nextInt();
        String numStr = String.valueOf(number);
        length = numStr.length();
        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            result += digit;
        }
        
        System.out.println("Sum of digits : " + result);
        input.close();
    }
}