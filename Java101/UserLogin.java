import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String storedUsername = "javadev", storedPassword = "patika123";
        String inputUsername, inputPassword;
        boolean flag = true;
        int counter = 0;

        while (flag) {
            System.out.print("Username : ");  inputUsername = input.next();
            System.out.print("Password : "); inputPassword = input.next();
            if (storedUsername.equals(inputUsername) && storedPassword.equals(inputPassword)) {
                System.out.println("You have successfully logged in!");
                flag = false;
            } else{
                counter++;
                if (counter >= 5 && counter < 10) {
                    System.out.println("You have failed to login " + counter + " times");
                    System.out.print("Do you want to reset your password? (Y or N) : ");  char answer = input.next().toCharArray()[0];
                    switch (answer) {
                        case 'y':
                        case 'Y':
                            System.out.print("Enter new password : ");  inputPassword = input.next();
                            storedPassword = inputPassword;
                            System.out.println("Your new password : " + storedPassword);
                            counter = 0;
                            break;
                        case 'n':
                        case 'N':
                            System.out.println("If you enter your password incorrectly 10 times, your account will be blocked.");
                            System.out.println("You entered your password incorrectly " + counter + " times. Remaining try : " + (10 - counter));
                            break;
                    
                        default:
                            System.out.println("Invalid input.");
                            break;
                    }

                } else if (counter == 10) {
                    System.out.println("Your account has been blocked!");
                    flag = false;
                } else{
                    System.out.println("\033c");
                    System.out.println("Username or Password is incorrect! Try again.");
                    System.out.println("*".repeat(50));
                }
            }
        }

        input.close();
    }
}
