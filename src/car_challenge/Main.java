package car_challenge;

public class Main {
    public static void main(String[] args) {
        Car carOne = new Car("Chevy", "Camaro 2SS", 10_000, 0.10F );
        Car carTwo = new Car("Ford", "Mustang GT", 30_000, 0.50F);
        Car carThree = new Car("Dodge", "Hellcat", 100, 0.00F);

        System.out.println("Car number 1: " + carOne.make + " " + carOne.model);
        System.out.println("Car number 2: " + carTwo.make + " " + carTwo.model);
        System.out.println("Car number 3: " + carThree.make + " " + carThree.model);

        System.out.println("---------------------------");

        //Private getter/setter
        CarPrivate carPrivateOne = new CarPrivate();
        CarPrivate carPrivateTwo = new CarPrivate();
        CarPrivate carPrivateThree  = new CarPrivate();

        carPrivateOne.setMake("Chevy");
        carPrivateTwo.setMake("Ford");
        carPrivateThree.setMake("Dodge");

        carPrivateOne.setModel("Camaro 2SS");
        carPrivateTwo.setModel("Mustang GT");
        carPrivateThree.setModel("Hellcat");

        System.out.println("Using Private getter/setter:");
        System.out.println("Car private number 1: " + carPrivateOne.getMake() + " " + carPrivateOne.getModel());
        System.out.println("Car private number 2: " + carPrivateTwo.getMake() + " " + carPrivateTwo.getModel());
        System.out.println("Car private number 3: " + carPrivateThree.getMake() + " " + carPrivateThree.getModel());

        System.out.println("------------------------------");

        // Using an Array
        System.out.println("Using for-loop:");
        Car[] carArr = new Car[] {carOne, carTwo, carThree};

        for (Car carTemp : carArr) {
            System.out.println("Car Inventory: " + carTemp.make + " " + carTemp.model);
        }
        System.out.println("--------------------");

        //Using toString() @Override
        System.out.println("Using toString:");
        System.out.println("Car number 1: " + "\n" + carOne +  "\n");
        System.out.println("Car number 2: " + "\n" + carTwo + "\n");
        System.out.println("Car number 3: " + "\n" + carThree + "\n");
    }
}
