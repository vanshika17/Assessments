//Implement Builder pattern to create a student object with more than 6 fields.
class Student{
    String FirstName;
    int rollNo;
    int phoneNo;
    int Age;
    String City;
    int pincode;
    String LastName;

    public Student(StudentBuilder studentBuilder) {
        FirstName=studentBuilder.getFirstName();
        rollNo=studentBuilder.getRollNo();
        phoneNo=studentBuilder.getPhoneNo();
        Age=studentBuilder.getAge();
        City=studentBuilder.getCity();
        pincode=studentBuilder.getPincode();
        LastName=studentBuilder.getLastName();

    }

    @Override
    public String toString() {
        return "Student{" +
                "FirstName='" + FirstName + '\'' +
                ", rollNo=" + rollNo +
                ", phoneNo=" + phoneNo +
                ", Age=" + Age +
                ", City='" + City + '\'' +
                ", pincode=" + pincode +
                ", LastName='" + LastName + '\'' +
                '}';
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}


class StudentBuilder{
    String FirstName;
    int rollNo;
    int phoneNo;
    int Age;
    String City;
    int pincode;
    String LastName;

    public String getFirstName() {
        return FirstName;
    }

    public StudentBuilder setFirstName(String firstName) {
        this.FirstName = firstName;
        return this;
    }

    public int getRollNo() {
        return rollNo;
    }

    public StudentBuilder setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public StudentBuilder setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
        return this;
    }

    public int getAge() {
        return Age;
    }

    public StudentBuilder setAge(int age) {
        Age = age;
        return this;
    }

    public String getCity() {
        return City;
    }

    public StudentBuilder setCity(String city) {
        City = city;
        return this;
    }

    public int getPincode() {
        return pincode;
    }

    public StudentBuilder setPincode(int pincode) {
        this.pincode = pincode;
        return this;
    }

    public String getLastName() {
        return LastName;
    }

    public StudentBuilder setLastName(String lastName) {
        LastName = lastName;
        return this;
    }
    public Student build(){
        return new Student(this);
    }

}
public class BuilderPattern {
    public static void main(String[] args) {
        Student student = new StudentBuilder().
                setFirstName("Vanshika").
                setLastName("Garg").
                setPhoneNo(9899580).
                setRollNo(1529010150).
                setPincode(201001).
                setCity("gzb").
                setAge(20).build();
        System.out.println(student.toString());

    }
}
