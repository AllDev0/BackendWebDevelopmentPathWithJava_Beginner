import java.util.ArrayList;
import java.util.Scanner;

public class PassingTheClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, physics, turkish, chemistry, music;
        ArrayList<Integer> lessons = new ArrayList<>();
        
        System.out.print("Enter your math grade : "); 
        math = input.nextInt();
        if(math >=0 && math <= 100)lessons.add(math);
        
        System.out.print("Enter your physics grade : "); 
        physics = input.nextInt();
        if(physics >=0 && physics <= 100)lessons.add(physics);

        System.out.print("Enter your turkish grade : "); 
        turkish = input.nextInt();
        if(turkish >=0 && turkish <= 100) lessons.add(turkish);
        
        System.out.print("Enter your chemistry grade : "); 
        chemistry = input.nextInt();
        if(chemistry >=0 && chemistry <= 100) lessons.add(chemistry);
                
        System.out.print("Enter your music grade : "); 
        music = input.nextInt();
        if(music >=0 && music <= 100) lessons.add(music);

        double averageGrade = (lessons.stream().mapToInt(Integer::intValue).sum()) / lessons.size();
        
        System.out.println("Your average grade is " + averageGrade);
        String result = (averageGrade >= 55) ? "You passed the lesson!" : "You failed!";
        System.out.println(result);
        input.close();
    }
}
