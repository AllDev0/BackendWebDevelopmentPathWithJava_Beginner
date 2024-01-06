import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        boolean isLeapYear = false;
        System.out.print("Enter the year : ");  year = input.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                } else{
                    isLeapYear = false;
                }
            } else{
                isLeapYear = true;
            }
        } else{
            isLeapYear = false;
        }
        
        System.out.println(isLeapYear ? (year + " is leap year"): (year + " is not leap year"));
        input.close();
    }
}
