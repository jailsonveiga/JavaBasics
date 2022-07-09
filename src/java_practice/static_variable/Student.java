package java_practice.static_variable;

public class Student {

    private int rollNo;
    private String name;
    private static String college = "ABC"; // static variable

    public Student(int rollNo, String name) {
        super();
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student [rollNo = " + rollNo + ", name = " + name + ", college = " + college + "]";
    }
}
