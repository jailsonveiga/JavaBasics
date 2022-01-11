package car_challenge;

public class CarPrivate {
    private String make;
    private String model;
    private int mileage;
    private float gasTankPercent;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public float getGasTankPercent() {
        return gasTankPercent;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setGasTankPercent(float gasTankPercent) {
        this.gasTankPercent = gasTankPercent;
    }
}
