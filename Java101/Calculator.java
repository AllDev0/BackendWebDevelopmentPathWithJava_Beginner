import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            int choice;
            double num1 = 0, num2 = 0;
            System.out.println("1) Addition\n2) Subtraction\n3) Multiplication\n4) Division");
            System.out.print("Select operation : ");    choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\033c");
                    System.out.println("The choice : 1) Addition");
                    System.out.print("Enter number1 : "); num1 = input.nextDouble();
                    System.out.print("Enter number2 : "); num2 = input.nextDouble();
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    System.out.println("*".repeat(50));
                    break;
                case 2:
                    System.out.println("\033c");
                    System.out.println("The choice : 2) Subtraction");
                    System.out.print("Enter number1 : "); num1 = input.nextDouble();
                    System.out.print("Enter number2 : "); num2 = input.nextDouble();
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    System.out.println("*".repeat(50));
                    break;
                case 3:
                    System.out.println("\033c");
                    System.out.println("The choice : 3) Multiplication");
                    System.out.print("Enter number1 : "); num1 = input.nextDouble();
                    System.out.print("Enter number2 : "); num2 = input.nextDouble();
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    System.out.println("*".repeat(50));
                    break;
                case 4:
                    System.out.println("\033c");
                    System.out.println("The choice : 4) Division");
                    System.out.print("Enter number1 : "); num1 = input.nextDouble();
                    boolean isDivisionValid = false;
                    while (!isDivisionValid) {
                        System.out.print("Enter number2 (Divider can not be 0!) : "); num2 = input.nextDouble();
                        isDivisionValid = (num2 != 0);
                        while (!isDivisionValid) {
                            System.out.print("Divider can not be 0. Enter number2 other than 0: "); num2 = input.nextDouble();
                            isDivisionValid = (num2 != 0);
                        }
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                        System.out.println("*".repeat(50));
                    }
                    break;
                default:
                    System.out.println("\033c");
                    System.out.println("Invalid choice : " + choice);
                    System.out.println("*".repeat(50));
                    break;
            }
        }

        input.close();
    }
}
