package method_parameter;

public class EvenToTheMoon {
    public static void main(String[] args) {
       System.out.println(getWeight(300));
    }
    public static double getWeight(int earthWeight) {
        double weightMoon = 0.17 * earthWeight;
        return weightMoon;
    }
}
