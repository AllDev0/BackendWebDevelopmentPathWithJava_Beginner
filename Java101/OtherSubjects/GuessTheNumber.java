package Java101.OtherSubjects;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("\033c");
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            Random random = new Random();
            int randomNumber = random.nextInt(101);
            int right = 5, counter = 0;
            System.out.println("\033c");
            System.out.println("The number : " + randomNumber);
            while (counter < right) {
                int guess;
                System.out.print("Enter your guess : ");  guess = input.nextInt();
                ++counter;
                if (randomNumber == guess) {
                    System.out.print("You guessed the number correctly in " + counter + " try.");
                    String choice;
                    System.out.print("Would you like to play again? (YES or NO) : ");  choice = input.next().toUpperCase();
                    switch (choice) {
                        case "YES":
                        case "Y":
                            randomNumber = random.nextInt(101);
                            counter = 0;
                            break;
                        
                        case "NO":
                        case "N":
                            flag = false;
                            break;
                    
                        default:
                            break;
                    }
                } else{
                    if (counter == right) {
                        System.out.println("You didn't guess correctly. You no longer have the right to try.");
                        System.out.println("The number was " + randomNumber);
                        String choice;
                        System.out.print("Would you like to play again? (YES or NO) : ");  choice = input.next().toUpperCase();
                        switch (choice) {
                            case "YES":
                            case "Y":
                                break;
                            
                            case "NO":
                            case "N":
                                flag = false;
                                break;
                        
                            default:
                                break;
                        }
                        
                    } else{
                        System.out.println("You didn't guess correctly. Remaining try : " + (right - counter));
                        
                        if (randomNumber > guess) {
                            System.out.println("The number is greater than your guess (" + guess + ")");
                        } else{
                            System.out.println("The number is smaller than your guess (" + guess + ")");
                        }
                    }
                }

            }
        }
        input.close();
    }
}
