import java.util.Scanner;

public class DiamondDrawer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lineCount;
        System.out.print("Enter the count of line : ");
        lineCount = input.nextInt();

        for (int i = 1; i <= lineCount; i++) {
            for (int j = 1; j <= (lineCount - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = lineCount - 1; i >= 1; i--) {
            for (int j = 1; j <= (lineCount - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}
