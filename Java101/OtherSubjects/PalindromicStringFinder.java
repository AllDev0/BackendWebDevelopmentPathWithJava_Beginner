package Java101.OtherSubjects;

public class PalindromicStringFinder {
    public static void main(String[] args) {
        String str = "kavak";
        System.out.println(isPalindrome(str) ? (str + " is a palindromic string.") : (str + "is not a palindromic string."));
    }

    private static boolean isPalindrome(String str){
        return str.equals(reverseString(str));
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
