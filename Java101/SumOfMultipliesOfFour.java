import java.util.Scanner;

public class SumOfMultipliesOfFour {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = -1, total = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("\033c");
            System.out.println("Total: " + total);
            System.out.print("Enter the number : ");   num = input.nextInt();
            if (num % 4 == 0) {
                total += num;
                System.out.println("The number is successfully added.");
                try{
                    Thread.sleep(1500);
                } catch(InterruptedException exception){
                    Thread.currentThread().interrupt();
                }
            } else{
                if (num % 2 == 1) {
                    System.out.println("Program is finishing...");
                    try{
                        Thread.sleep(1500);
                    } catch(InterruptedException exception){
                        Thread.currentThread().interrupt();
                    } finally{
                        System.out.println("Program is finished.");
                    }
                    
                    flag = false;
                } else {
                    System.out.println("The number could not be added.");
                    try{
                        Thread.sleep(1500);
                    } catch(InterruptedException exception){
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
}
