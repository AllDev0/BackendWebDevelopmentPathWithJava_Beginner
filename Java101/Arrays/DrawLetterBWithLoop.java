package Java101.Arrays;

public class DrawLetterBWithLoop {
    public static void main(String[] args) {
        /*
         * 
         * j1 j2 j3 j4 j5 j6 j7 j8
         * ＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿＿
         * ｜
         * ｜
         * i1 ｜ 0 0 0 0 0 0 1 1
         * ｜
         * i2 ｜ 0 1 1 1 1 1 0 1
         * ｜
         * i3 ｜ 0 1 1 1 1 1 1 0
         * ｜
         * i4 ｜ 0 0 0 0 0 0 0 0
         * ｜
         * i5 ｜ 0 0 0 0 0 0 0 0
         * ｜
         * i6 ｜ 0 1 1 1 1 1 1 0
         * ｜
         * i7 ｜ 0 1 1 1 1 1 0 1
         * ｜
         * i8 ｜ 0 0 0 0 0 0 1 1
         * 
         */

        int row = 8, col = 8;
        String[][] letter = new String[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (
                    (i == 0 && (j == 6 || j == 7)) ||
                    (i == 1 && (j >= 1 && j <= 5 || j == 7)) ||
                    (i == 2 && (j >= 1 && j <= 6)) ||
                    (i == 5 && (j >= 1 && j <= 6)) ||
                    (i == 6 && (j >= 1 && j <= 5 || j == 7)) ||
                    (i == 7 && (j == 6 || j == 7))
                ) 
                {
                    letter[i][j] = " ";
                } else {
                    letter[i][j] = "*";
                }
            }
        }

        // Print the pattern
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(letter[i][j] + " ");
            }
            System.out.println();
        }
    }
}
