import java.util.Scanner;

public class PalindromicNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter the number you want to check whether is a palindrome number : ");    num = input.nextInt();
        System.out.println(isPalindrome(num) ? (num + " is a palindromic number") : (num + " is not a palindromic number"));
        input.close();
    }

    private static boolean isPalindrome(int num){
        String numStr = String.valueOf(num);
        return numStr.equals(reverseString(numStr));
    }

    private static String reverseString(String str){
        String result = "";
        char c;
        for(int i=str.length()-1; i>=0; i--){
            c = str.charAt(i);
            result += c;
        }

        return result;
    }
}