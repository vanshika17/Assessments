import java.util.Scanner;

//Implement proxy design for accessing Record of a student and allow the access only to Admin.
class StudentDetails {
    private int id;
    private int marks;
    private String name;

    public StudentDetails(int id, int marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentDetails{" +
                "id=" + id +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}
interface infoReader{
    void info();
}
class StudentInfo implements infoReader{
    protected StudentDetails student;

    public StudentInfo(StudentDetails student) {
        this.student = student;
    }

    @Override
    public void info() {
        System.out.println("student details are :"+student.toString());
    }
}
class StudentProxy extends StudentInfo{
    String designation;
    public StudentProxy(StudentDetails student,String designation) {
        super(student);
        this.designation=designation;
    }

    @Override
    public void info() {
        if(designation.equals("admin"))
        System.out.println("student details are :"+student.toString());
        else
            System.out.println("Permission denied");
    }
}
public class ProxyPattern {
    public static void main(String[] args) {
        System.out.println("Enter your designation ");
        Scanner scanner=new Scanner(System.in);
        String designation= scanner.next();
        StudentDetails studentDetails=new StudentDetails(1,80,"Vanshika");
        StudentInfo studentInfo=new StudentProxy(studentDetails,designation);
        studentInfo.info();
    }
}
