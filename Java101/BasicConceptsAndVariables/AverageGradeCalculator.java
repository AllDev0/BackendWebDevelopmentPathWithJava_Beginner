import java.util.Scanner;

public class AverageGradeCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, physics, chemistry, turkish, history, music;
        
        System.out.print("Enter your math grade : "); 
        math = input.nextInt();
        
        System.out.print("Enter your physics grade : "); 
        physics = input.nextInt();
        
        System.out.print("Enter your chemistry grade : "); 
        chemistry = input.nextInt();
        
        System.out.print("Enter your turkish grade : "); 
        turkish = input.nextInt();
        
        System.out.print("Enter your history grade : "); 
        history = input.nextInt();
        
        System.out.print("Enter your music grade : "); 
        music = input.nextInt();

        double averageGrade = (math + physics + chemistry + turkish + history + music) / 6.0;
        
        System.out.println("Your average grade is " + averageGrade);
        String result = (averageGrade >= 60) ? "You passed!" : "You failed!";
        System.out.println(result);
        input.close();
    }
}