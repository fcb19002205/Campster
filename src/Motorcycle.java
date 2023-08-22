
public class Motorcycle extends Vehicle implements Drivible {

    boolean hasSidecar;
    public Motorcycle(String make, String model, int year, double price, boolean hasSidecar) {
        super(make, model, year, price);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void start() {
        System.out.println("Motorcycle engine started...");
    }

    @Override
    public void accelerate(double speed) {
        System.out.println("Motorcycle accelerate to " + speed);
    }

    @Override
    public void brake() {
        System.out.println("Motorcycle is braking...");
    }
}
