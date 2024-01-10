import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowCount;
    int columnCount;
    int totalMineCount;
    private String gameBoard[][];
    private String map[][];

    public MineSweeper(int rowCount, int columnCount){
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        this.totalMineCount = (rowCount * columnCount) / 4;
        this.gameBoard = new String[rowCount][columnCount];
        this.map = new String[rowCount][columnCount];
    }

    public void run(){
        Scanner input = new Scanner(System.in);
        initGameBoard();
        setPlaceOfMines();

        int row, column, mineCounter = 0;
        boolean flag = true;
        while (flag) {
            displayBoard(gameBoard);

            System.out.print("Enter the row : ");   row = input.nextInt();
            System.out.print("Enter the column : ");   column = input.nextInt();

            if (row >= 0 && column >= 0 && row <= rowCount && column <= columnCount) {
                if(gameBoard[row][column] == " -"){
                    continue;
                }

                if (!map[row][column].equals(" *")) {
                    mineCounter = checkMines(row, column);
                    gameBoard[row][column] = " " + mineCounter;
                }

                else if (map[row][column].equals(" *")){                    
                    System.out.println("You hit the mine in the [" + row + "]" + "[" + column + "]");
                    displayBoard(map);
                    flag = false;
                }

                if (totalMineCount == isSuccesful()) {
                    System.out.println("Congratulations! You have successfully completed the game.");
                    displayBoard(gameBoard);
                    flag = false;
                }

            }
        }
    }

    private void initGameBoard(){
        for(int i = 0; i< gameBoard.length; i++){
            for(int j = 0; j< gameBoard[i].length; j++){
                gameBoard[i][j] = " X";
                map[i][j] = " X";
            }
        }
    }

    private void setPlaceOfMines(){
        Random random = new Random();
        int row, column, count = 0;
        while (count < totalMineCount) {
            row = random.nextInt(rowCount);
            column = random.nextInt(columnCount);

            if (map[row][column] != " *") {
                map[row][column] = " *";
                count++;
            }
        }
    }

    private void displayBoard(String board[][]){
        System.out.print("      ");
        for (int c = 0; c < board.length; c++) {
            if (c > 10) {
                System.out.print(" " + c);
            } else
                System.out.print("  " + c);
        }
        System.out.println();
        System.out.print("      ");
        for (int i = 0; i < board.length; i++) {
            System.out.print("  -");
        }

        System.out.println();

        for (int i = 0; i < board.length; i++) {
            if (i >= 10)
                System.out.print(i + "- [ ");
            else
                System.out.print(i + " - [ ");
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(" " + board[i][j]);
            }
            System.out.println(" ] ");
            System.out.println();
        }
    }

    private int checkMines(int row, int column){
        int tempRow, tempColumn, counter = 0;
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++) {
                tempRow = row + i;
                tempColumn = column + j;

                if (tempColumn >= 0 && tempRow >= 0 && tempRow < rowCount && tempColumn < columnCount) {
                    if (map[tempRow][tempColumn] == " *") {
                        counter++;
                    }
                    if (map[tempRow][tempColumn] != " *" && gameBoard[tempRow][tempColumn] != " -") {
                        String eleman = gameBoard[tempRow][tempColumn];
                        try {
                            Integer.parseInt(eleman);

                        } catch (NumberFormatException e) {
                            gameBoard[tempRow][tempColumn] = " -";
                        }
                    }
                }
            }
        }
        return counter;
    }

    private int isSuccesful(){
        int cellCounter = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[0].length; j++) {
                if (gameBoard[i][j] == " X") {
                    cellCounter++;
                }
            }

        }
        return cellCounter;
    }

}