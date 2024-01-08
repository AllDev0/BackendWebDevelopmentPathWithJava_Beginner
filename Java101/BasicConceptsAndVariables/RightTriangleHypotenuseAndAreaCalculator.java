import java.util.Scanner;

public class RightTriangleHypotenuseAndAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double side1, side2, hypotenuse, circumference, area;
        System.out.print("Enter side1 of the right triangle (not hypotenuse) : "); side1 = input.nextDouble();
        System.out.print("Enter side2 of the right triangle (not hypotenuse) : "); side2 = input.nextDouble();
        hypotenuse = Math.sqrt(side1*side1 + side2*side2);
        System.out.println("The hypotenuse of the right triangle : " + hypotenuse);
        circumference = side1 + side2 + hypotenuse;
        // area = side1 * side2 / 2
        area = Math.sqrt((circumference/2 ) * (circumference/2 - side1) * (circumference/2 - side2) * (circumference/2 - hypotenuse));
        System.out.println("The area of the right triangle : " + area);

    }
}
