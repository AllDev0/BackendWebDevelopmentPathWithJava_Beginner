import java.util.Scanner;

public class ATMProject {
    static Scanner input = new Scanner(System.in);
    static String username = "", password = "";
    public static void main(String[] args) {
        String inputUsername, inputPassword;
        int remainingTry = 3;
        boolean flag = true, isShowed = false;
        while (flag) {
            if (!isShowed) {
                getUserInfos();
                isShowed = true;
            } else{
                if (remainingTry == 0) {
                    System.out.println("Your account has been blocked! Please contact your bank.");
                    flag = false;
                } else{
                    System.out.print("Enter your username : ");  inputUsername = input.next();
                    System.out.print("Enter your password : ");  inputPassword = input.next();
                    if(inputUsername.equals(username) && inputPassword.equals(password)){
                        System.out.println("\033c");
                        System.out.println("Authenticating...");
                        try {
                            Thread.sleep(1500);
                        } catch (InterruptedException exception) {
                            Thread.currentThread().interrupt();
                        } finally{
                            System.out.println("You have successfully logged in!");
                            try{
                                Thread.sleep(500);
                            } catch (InterruptedException exception){
                                Thread.currentThread().interrupt();
                            }
                        }
                        double balance = 0.0;
                        System.out.print("\033c");
                        while (flag) {
                            int choice;
                            double amountOfDeposit, amountOfWithdraw;
                            System.out.println("*".repeat(50));
                            System.out.println("1) Deposit\n2) Withdraw\n3) Check Balance\n4) Exit");
                            System.out.print("Your choice : "); choice = input.nextInt();
                            switch (choice) {
                                case 1:
                                    System.out.print("Enter the amount you want to deposit : ");    amountOfDeposit = input.nextDouble();
                                    if (amountOfDeposit > 0.0) {
                                        balance += amountOfDeposit;
                                        System.out.println("The deposit was made successfully!");
                                        System.out.println("Your new balance : " + balance);
                                    } else{
                                        System.out.println("The amount you want to deposit cannot be less than or equal to 0");
                                    }
                                    break;
                                case 2:
                                    System.out.print("Enter the amount you want to withdraw : ");    amountOfWithdraw = input.nextDouble();
                                    if (amountOfWithdraw > 0.0) {
                                        if (balance >= amountOfWithdraw) {
                                            balance -= amountOfWithdraw;
                                            System.out.println("The withdraw was made successfully!");
                                            System.out.println("Your new balance : " + balance);
                                        } else{
                                            System.out.println("You cannot withdraw more than your bank balance.");
                                        }
                                    } else{
                                        System.out.println("The amount you want to deposit cannot be less than or equal to 0");
                                    }
                                    break;
                                case 3:
                                    System.out.println("Your Balance : " + balance);
                                    break;
                                case 4:
                                    flag = false;
                                    break;
                            
                                default:
                                System.out.println("Invalid Choice!");
                                    break;
                            }
                        }

                    } else{
                        remainingTry--;
                        if (remainingTry != 0) {
                            System.out.println("\033c");
                            System.out.println("Wrong username or password! Please try again.");
                            System.out.println("Remaining try : " + remainingTry);
                        }
                    }
                }
            }
        }

        input.close();
    }

    private static void getUserInfos(){
        System.out.println("Welcome to the PATIKA BANK.");
            try {
                Thread.sleep(500);
            } catch(InterruptedException exception){
                Thread.currentThread().interrupt();
            } finally {
                try{
                    Thread.sleep(500);
                } catch(InterruptedException exception){
                    Thread.currentThread().interrupt();
                } finally{
                    System.out.println("First of all, you must create an account.");
                    System.out.print("Enter your username : "); username = input.next();
                    System.out.print("Enter your password : "); password = input.next();
                    System.out.println("\033c");
                    System.out.println("Your account has been created!");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException exception) {
                        Thread.currentThread().interrupt();
                    } finally{
                        System.out.println("\033c");
                    }
                }
            }
        //input.close();
    }
}
