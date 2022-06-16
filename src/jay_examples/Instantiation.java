package jay_examples;

public class Instantiation {
    public static void main (String[] args) {

        //Create a new object instance and passing the arguments value and store the value into student
        Students student = new Students("Jay", 22);

        ////Create a new object instance and passing the arguments value and store the value into student1
        Students student1 = new Students("Bob", 23);

        ////Create a new object instance and passing the arguments value and store the value into grade
        Grades grade = new Grades(90);

        //Display the text and the values from student.name and student.age and use the + operator to join the text together and display on the screen
        System.out.println("The student name is? " + student.name + " and he is " + student.age);

        ////Display the text and the values from student1.name, student1.age and the grade.grade and use the + operator to join the text together and display on the screen
        System.out.println("The student name is? " + student1.name + " he is " + student1.age + " and is grade is? " + grade.grade);
    }

    //Create a class type parameter Students
    public static class Students {

        String name;
        int age;

        //Create the Students constructor
        public Students(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    ////Create a class type parameter Grades
    public static class Grades {
        int grade;

        ////Create the Grades constructor
        public Grades(int g) {
            this.grade = g;
        }
    }
}
