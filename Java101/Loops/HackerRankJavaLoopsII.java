import java.util.Scanner;

public class HackerRankJavaLoopsII {
    public static void main(String []argh){
        Scanner input = new Scanner(System.in);
        int t=input.nextInt();
        for(int i=0;i<t;i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();
            int result = a;
            for(int j=0; j<n; j++){
                result += ((Math.pow(2, j))*b);
                System.out.print(result + " ");
            }
            System.out.println();
        }
        input.close();
    }
}