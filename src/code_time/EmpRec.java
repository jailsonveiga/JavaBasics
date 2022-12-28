package code_time;

public class EmpRec {
    public static String name = "Amigo";
    public static String position = "Java developer";
    public static int salary = 10_000;

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        System.out.println(name);
        System.out.println(position);
        System.out.println(salary);
    }
}
