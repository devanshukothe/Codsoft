package Studentmanagement;

public class Student {
    private String name;
    private int rollNumber;
    private String grade;
    private String address;

    public Student(String name, int rollNumber, String grade, String address) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getGrade() {
        return grade;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", grade='" + grade + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
