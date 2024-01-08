package Java101.Classes.StudentInformationSystem;

public class Teacher {
    String t_name;
    String t_phoneNo;
    String t_branch;

    public Teacher(String t_name, String t_phoneNo, String branch){
        this.t_name = t_name;
        this.t_phoneNo = t_phoneNo;
        this.t_branch = branch;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_phoneNo(String t_phoneNo){
        this.t_phoneNo = t_phoneNo;
    }

    public String getT_phoneNo() {
        return t_phoneNo;
    }

    public String getT_branch() {
        return t_branch;
    }
    
    void getTeacherInfos(){
        System.out.println("Teacher Name : " + getT_name());
        System.out.println("Teacher Phone No : " + getT_phoneNo());
        System.out.println("Teacher Branch : " + getT_branch());
    }
}
