import java.util.Scanner;

public class AdvancedCalculator {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        boolean flag = true;

        while (flag) {
            System.out.println("*".repeat(50));
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("5) Power");
            System.out.println("6) Factorial");
            System.out.println("7) Modular Arithmetic");
            System.out.println("8) Calculate the perimeter of rectangle");
            System.out.println("9) Exit");
            System.out.print("\nSelect your choice : ");    choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\033c");
                    addition();
                    break;
                case 2:
                    System.out.println("\033c");
                    subtraction();
                    break;
                case 3:
                    System.out.println("\033c");
                    multiplication();
                    break;
                case 4:
                    System.out.println("\033c");
                    division();
                    break;
                case 5:
                    System.out.println("\033c");
                    pow();
                    break;
                case 6:
                    System.out.println("\033c");
                    factorial();
                    break;
                case 7:
                    System.out.println("\033c");
                    modularArithmetic();
                    break;
                case 8:
                    System.out.println("\033c");
                    perimeterOfRectangle();
                    break;
                case 9:
                    flag = false;
                    break;
            
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        input.close();
    }


    private static void addition (){
        double num1, num2;
        System.out.print("Enter num1 : ");  num1 = input.nextDouble();
        System.out.print("Enter num2 : ");  num2 = input.nextDouble();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    private static void subtraction (){
        double num1, num2;
        System.out.print("Enter num1 : ");  num1 = input.nextDouble();
        System.out.print("Enter num2 : ");  num2 = input.nextDouble();
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    private static void multiplication (){
        double num1, num2;
        System.out.print("Enter num1 : ");  num1 = input.nextDouble();
        System.out.print("Enter num2 : ");  num2 = input.nextDouble();
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }

    private static void division (){
        double num1, num2 = 0.0;
        System.out.print("Enter num1 : ");  num1 = input.nextDouble();
        boolean isValid = false;
        while (!isValid) {
            System.out.print("Enter num2 : ");  num2 = input.nextDouble();
            if (num2 == 0) {
                System.out.println("Divider can not be 0.");

            } else{
                isValid = true;
            }
        }
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }

    private static void pow(){
        //return Math.pow(num1, num2);
        int result = 1;
        double num1, num2;
        System.out.print("Enter base number : ");  num1 = input.nextDouble();
        System.out.print("Enter exponent number : ");  num2 = input.nextDouble();
        for(int i=1; i<=num2; i++){
            result *= num1;
        }

        System.out.println("Result : " + result);
    }

    private static void factorial(){
        int result = 1, num;
        System.out.print("Enter the number : ");    num = input.nextInt();
        for(int i=1; i<=num; i++){
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    private static void modularArithmetic(){
        int num1, num2;
        System.out.print("Enter num1 : ");  num1 = input.nextInt();
        System.out.print("Enter num2 : ");  num2 = input.nextInt();
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }

    private static void perimeterOfRectangle(){
        double longEdge, shortEdge;
        System.out.print("Enter the long edge of rectangle : ");  longEdge = input.nextDouble();
        System.out.print("Enter the long edge of rectangle : ");  shortEdge = input.nextDouble();
        System.out.println("Perimeter of the rectangle : " + 2 * (longEdge + shortEdge));
    }

}
