import java.util.Scanner;

public class ArmstrongNumberFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, length, result = 0;
        System.out.print("Enter the number : ");    number = input.nextInt();
        String numStr = String.valueOf(number);
        length = numStr.length();
        for (int i = 0; i < length; i++){
            int index = Character.getNumericValue(numStr.charAt(i));
            result += Math.pow(index, length);
        }
        System.out.println("Result : " + result);
        if (result == number) {
            System.out.println("The entered number is an Armstrong number!");
        } else{
            System.out.println("The entered number is not an Armstrong number!");
        }
        input.close();
    }
}
