package java_practice.local_variable;

public class LocalVariable {
    public static void main(String[] args) {
        VariableLocal variableLocal = new VariableLocal();
        int sum = variableLocal.sum(10);

        System.out.println("Sum of first 10 numbers -> " + sum);
    }
}
