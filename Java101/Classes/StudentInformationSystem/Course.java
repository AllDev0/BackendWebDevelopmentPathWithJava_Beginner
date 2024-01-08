package Java101.Classes.StudentInformationSystem;

public class Course {
    String c_name;
    String c_code;
    String c_prefix;
    int c_note;
    Teacher teacher;

    public Course(String c_name, String c_code, String c_prefix, Teacher teacher){
        this.c_name = c_name;
        this.c_code = c_code;
        this.c_prefix = c_prefix;
        this.c_note = 0;
        this.teacher = teacher;
    }

    public Course(String c_name, String c_code, String c_prefix){
        this.c_name = c_name;
        this.c_code = c_code;
        this.c_prefix = c_prefix;
        this.c_note = 0;
        this.teacher = null;
    }

    public void assignTeacher(Teacher teacher){
        if (this.c_prefix.equals(teacher.t_branch)) {
            this.teacher = teacher;
            System.out.println("Teacher " + teacher.t_name + " was assigned to the " + this.c_name + " course.");
        } else{
            System.out.println("Teacher " + teacher.t_name + " could not be assigned to the " + this.c_name + " course.");
        }
    }

    public void getCourseTeacherInfos(){
        if (this.teacher != null) {
            System.out.println("The teacher of the " + c_name + " course is " + this.teacher.t_name + ".");
        } else{
            System.out.println("No teacher was assigned to the " + c_name + " course.");
        }
    }

    public void setCourseNote(int note){
        if (note >= 0 && note <= 100) {
            this.c_note = note;
        } else{
            System.out.println("Invalid note.");
        }
    }
}
