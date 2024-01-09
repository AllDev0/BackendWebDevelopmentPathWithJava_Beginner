package Java101.Arrays;

import java.util.Scanner;

public class TransposeOfTheMatrix {
    public static void main(String[] args) {
        System.out.println("\033c");
        Scanner input = new Scanner(System.in);
        int row, col;
        System.out.print("Enter the row : ");   row = input.nextInt();
        System.out.print("Enter the col : ");   col = input.nextInt();

        int matrix[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                int num;
                System.out.print("Enter the number for ["+i+"]["+j+"] : ");   num = input.nextInt();
                matrix[i][j] = num;
            }
        }

        int transpose[][] = new int[col][row];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        for(int subList[] : transpose){
            for(int n : subList){
                System.out.print(n + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
