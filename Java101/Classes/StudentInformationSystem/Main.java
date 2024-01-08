package Java101.Classes.StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("\033c");
        System.out.println("*".repeat(100));
        Teacher t1 = new Teacher("Enes", "546540", "MAT");
        Teacher t2 = new Teacher("Ahmet", "123456", "PHY");
        Teacher t3 = new Teacher("Burcu", "777777", "CHEM");

        Course c1 = new Course("Mathematics", "MAT101", "MAT");
        Course c2 = new Course("Physics", "PHY101", "PHY", t2);
        Course c3 = new Course("Chemistry", "CHEM101", "CHEM");

        c1.getCourseTeacherInfos();
        c2.getCourseTeacherInfos();
        c3.getCourseTeacherInfos();
        System.out.println("*".repeat(100));
        c1.assignTeacher(t1);
        c3.assignTeacher(t3);
        System.out.println("*".repeat(100));
        c1.getCourseTeacherInfos();
        c2.getCourseTeacherInfos();
        c3.getCourseTeacherInfos();
        System.out.println("*".repeat(100));

        Student s1 = new Student("CAN", c1, c2, c3, 0);
        s1.isPassed();
        System.out.println("*".repeat(100));
        s1.math.c_note = 90;
        s1.physics.c_note = 80;
        s1.chemistry.c_note = 70;
        s1.isPassed();
        System.out.println("*".repeat(100));
        s1.math.teacher.getTeacherInfos();
    }
}
