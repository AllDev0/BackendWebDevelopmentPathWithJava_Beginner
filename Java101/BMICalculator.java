import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height, weight, bmi;
        System.out.print("Enter your height in meters (Eg: 1.84) : ");  height = input.nextDouble();
        System.out.print("Enter your weight in kilograms (Eg: 82.4) : "); weight = input.nextDouble();
        bmi = weight / height / height;
        System.out.println("Body Mass Index : " + bmi);
        input.close();
    }
}
