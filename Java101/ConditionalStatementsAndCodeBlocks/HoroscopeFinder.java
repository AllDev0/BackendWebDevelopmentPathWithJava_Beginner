import java.util.Scanner;

public class HoroscopeFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String date;
        System.out.print("Enter your birthday (Eg: 04.02.1998 or 04/02/1998): ");   date = input.nextLine();
        int day = Integer.parseInt(date.substring(0, 2));
        int month = Integer.parseInt(date.substring(3, 5));
        switch (month) {
            case 1:
                if (day >= 1 && day <= 21) {
                    System.out.println("Your horoscope is Capricorn.");
                } else if(day >= 22 && day <= 31){
                    System.out.println("Your horoscope is Aquarius.");
                } else {
                    System.out.println("Invalid day.");
                }
                break;
            case 2:
                if (day >= 1 && day <= 19) {
                    System.out.println("Your horoscope is Aquarius.");
                } else if(day >= 20 && day <= 29){
                    System.out.println("Your horoscope is Pisces.");
                } else {
                    System.out.println("Invalid day.");
                }
                break;
            case 3:
                if (day >= 1 && day <= 20) {
                    System.out.println("Your horoscope is Pisces.");
                } else if(day >= 21 && day <= 31){
                    System.out.println("Your horoscope is Aries.");
                } else {
                    System.out.println("Invalid day.");
                }
                break;
            case 4:
                if (day >= 1 && day <= 20) {
                    System.out.println("Your horoscope is Aries.");
                } else if(day >= 21 && day <= 30){
                    System.out.println("Your horoscope is Taurus.");
                } else {
                    System.out.println("Invalid day.");
                }
                break;
            case 5:
                if (day >= 1 && day <= 21) {
                    System.out.println("Your horoscope is Taurus.");
                } else if(day >= 22 && day <= 31){
                    System.out.println("Your horoscope is Gemini.");
                } else {
                    System.out.println("Invalid day.");
                }
                break;
            case 6:
                if (day >= 1 && day <= 22) {
                    System.out.println("Your horoscope is Gemini.");
                } else if(day >= 23 && day <= 30){
                    System.out.println("Your horoscope is Cancer.");
                } else {
                    System.out.println("Invalid day.");
                }
                break;
            case 7:
                if (day >= 1 && day <= 22) {
                    System.out.println("Your horoscope is Cancer.");
                } else if(day >= 23 && day <= 31){
                    System.out.println("Your horoscope is Leo.");
                } else {
                    System.out.println("Invalid day.");
                }
                break;
            case 8:
                if (day >= 1 && day <= 22) {
                    System.out.println("Your horoscope is Leo.");
                } else if(day >= 23 && day <= 31){
                    System.out.println("Your horoscope is Virgo.");
                } else {
                    System.out.println("Invalid day.");
                }
                break;
            case 9:
                if (day >= 1 && day <= 22) {
                    System.out.println("Your horoscope is Virgo.");
                } else if(day >= 23 && day <= 30){
                    System.out.println("Your horoscope is Libra.");
                } else {
                    System.out.println("Invalid day.");
                }
                break;
            case 10:
                if (day >= 1 && day <= 22) {
                    System.out.println("Your horoscope is Libra.");
                } else if(day >= 23 && day <= 31){
                    System.out.println("Your horoscope is Scorpio.");
                } else {
                    System.out.println("Invalid day.");
                }
                break;
            case 11:
                if (day >= 1 && day <= 21) {
                    System.out.println("Your horoscope is Scorpio.");
                } else if(day >= 22 && day <= 30){
                    System.out.println("Your horoscope is Sagittarius.");
                } else {
                    System.out.println("Invalid day.");
                }
                break;
            case 12:
                if (day >= 1 && day <= 21) {
                    System.out.println("Your horoscope is Sagittarius.");
                } else if(day >= 22 && day <= 31){
                    System.out.println("Your horoscope is Capricorn.");
                } else {
                    System.out.println("Invalid day.");
                }
                break;
        
            default:
                System.out.println("Invalid month");
                break;
        }

        input.close();
    }
}
