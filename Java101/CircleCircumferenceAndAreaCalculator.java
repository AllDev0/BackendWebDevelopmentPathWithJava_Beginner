import java.util.Scanner;

public class CircleCircumferenceAndAreaCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PI = 3;
        double radius, area, circumference, centralAngle, segment;
        System.out.print("Enter the radius : ");   radius = input.nextDouble();
        System.out.print("Enter the central angle : "); centralAngle = input.nextDouble();
        area = PI * radius * radius;
        circumference = 2 * PI * radius;
        segment = area * centralAngle / 360;
        System.out.println("The area of circle : " + area);
        System.out.println("The circumference of circle : " + circumference);
        System.out.println("The segment's area of entered central angle : " + segment);
        input.close();
    }
}