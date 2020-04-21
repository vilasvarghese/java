package multithreading;

public class Student {

    private int studentID;
    private String studentName;
    private static int collegeID = 1000;

    public Student(){
    }

    public Student(int id, String name){
        this.studentID = id;
        this.studentName = name;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public static void setCollegeID(int collegeID) {
        Student.collegeID = collegeID;
    }

    public int getStudentID() {
        return studentID;
    }

    public static int getCollegeID() {
        return collegeID;
    }

    public void setStudentName(String name){
        this.studentName = name;
    }



    public static void updateCollegeId(int i){
        collegeID = i;
    }


    public static void main(String arg[]){

        Student student1 = new Student();
        Student student2 = new Student();
        System.out.println(Student.collegeID);

        System.out.println(student1.getStudentName());
        System.out.println(student2.getStudentName());

        Student student3 = new Student(1000, "Abin");
        Student student4 = new Student(2000,"Alan");

        System.out.println(student3.getStudentName());
        System.out.println(student4.getStudentName());
        Student.updateCollegeId(10000);
        student4.setStudentName("Alan Philomon");
        System.out.println(student4.getStudentName());

        System.out.println(Student.collegeID);
    }

}
