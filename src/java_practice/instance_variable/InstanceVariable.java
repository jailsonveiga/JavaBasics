package java_practice.instance_variable;

public class InstanceVariable {
    public static void main(String[] args) {

        Employee employee = new Employee();

        // Before assigning values to employee object
        System.out.println(employee.empName);
        System.out.println(employee.id);
        System.out.println(employee.age);

        employee.empName = "Jay";
        employee.id = 100;
        employee.age = 28;

        // After assigning values to employee object
        System.out.println(employee.empName);
        System.out.println(employee.id);
        System.out.println(employee.age);

    }
}
