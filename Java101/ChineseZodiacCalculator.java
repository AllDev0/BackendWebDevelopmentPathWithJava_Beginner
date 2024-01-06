import java.util.Scanner;

public class ChineseZodiacCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int birthYear;
        System.out.print("Enter your birth year : ");   birthYear = input.nextInt();
        switch (birthYear % 12) {
            case 0:
                System.out.println("Your Chinese Zodiac Horoscope : Monkey");
                break;
            case 1:
                System.out.println("Your Chinese Zodiac Horoscope : Rooster");
                break;
            case 2:
                System.out.println("Your Chinese Zodiac Horoscope : Dog");
                break;
            case 3:
                System.out.println("Your Chinese Zodiac Horoscope : Pig");
                break;
            case 4:
                System.out.println("Your Chinese Zodiac Horoscope : Rat");
                break;
            case 5:
                System.out.println("Your Chinese Zodiac Horoscope : Ox");
                break;
            case 6:
                System.out.println("Your Chinese Zodiac Horoscope : Tiger");
                break;
            case 7:
                System.out.println("Your Chinese Zodiac Horoscope : Rabbit");
                break;
            case 8:
                System.out.println("Your Chinese Zodiac Horoscope : Dragon");
                break;
            case 9:
                System.out.println("Your Chinese Zodiac Horoscope : Snake");
                break;
            case 10:
                System.out.println("Your Chinese Zodiac Horoscope : Horse");
                break;
            case 11:
                System.out.println("Your Chinese Zodiac Horoscope : Goat");
                break;
            default:
            System.out.println("Something went wrong!");
                break;
        }
        
        input.close();
    }
}
