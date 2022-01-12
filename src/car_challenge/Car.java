package car_challenge;

public class Car {
    public String make;
    public String model;
    public int mileage;
    public float gasTankPercent;

    public Car(String make, String model, int mileage, float gasTankPercent) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }

    @Override
    public String toString() {
        return
                "Make: " + make +
                ", Model: " + model +
                ", Mileage: " + mileage +
                ", GasTankPercent: " + gasTankPercent;

    }
}
