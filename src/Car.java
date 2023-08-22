public class Car extends Vehicle implements Drivible {

    int numOfDoors;


    public Car(String make, String model, int year, double price, int numOfDoors) {
        super(make, model, year, price);
        this.numOfDoors = numOfDoors;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    @Override
    public void start() {
        System.out.println("Car engine started...");
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("Car accelerate to " + speed);
    }

    @Override
    public void brake() {
        System.out.println("Car braking...");
    }
}
