package java_practice.static_variable;

public class StaticVariable {
    public static void main(String[] args) {

        Student student  = new Student(100, "student 1");
        Student student2 = new Student(101, "Student 2");
        Student student3 = new Student(102, "Student 3");
        Student student4 = new Student(103, "Student 4");

        System.out.println("---------- Sudent 1 ----------");
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
    }
}
