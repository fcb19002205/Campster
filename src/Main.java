public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Honda", "Civic", 2020, 25000.00, 5);
        car1.start();
        car1.accelerate(200);
        car1.brake();

        Motorcycle motorcycle1 = new Motorcycle("Yamaha", "C600", 2020, 11000.00, false);
        motorcycle1.start();
        motorcycle1.accelerate(230);
        motorcycle1.brake();

    }
}