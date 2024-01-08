package Java101.Classes.StudentInformationSystem;

public class Student {
    String s_name;
    String s_no;
    Course math;
    Course physics;
    Course chemistry;
    double average;

    public Student(String s_name, Course math, Course physics, Course chemistry, double average){
        this.s_name = s_name;
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
        this.average = average;
    }

    public void isPassed(){
        calculateAverage();
        if (average >= 54.5) {
            System.out.println(s_name + " is passed the class with " + average + " average.");            
        } else{
            System.out.println(s_name + " is failed with " + average + " average.");
        }
    }

    private void calculateAverage(){
        this.average = (this.math.c_note + this.physics.c_note + this.chemistry.c_note) / 3.0;
    }
}
