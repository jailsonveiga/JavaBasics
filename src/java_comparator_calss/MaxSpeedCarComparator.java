package java_comparator_calss;

import java.util.Comparator;

//Implement the Comparator to performing the sorting we need
public class MaxSpeedCarComparator implements Comparator<Car> {

    @Override
    //thakes 2 car object as input and compares their maximum speed by subtracting them
    public int compare(Car o1, Car o2) {
        return o1.getMaxSpeed() - o2.getMaxSpeed();
    }
}
