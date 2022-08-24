package Day4.Challange3;

public class Main {
    public static void main(String[] args) {
        PedalBikes pedalBikes = new PedalBikes("Pedal Bikes", "no engine", 2);
        MotorBikes motorBikes = new MotorBikes("Motor Bikes", "with engine", 2);
        pedalBikes.identifyMyself();
        motorBikes.identifyMyself();

        SportsCars sportsCars = new SportsCars("Sports Cars", "with engine", 4, "V8");
        PickupCars pickupCars = new PickupCars("Pickup Cars", "with engine", 4, "Solar");
        sportsCars.identifyMyself();
        pickupCars.identifyMyself();

        SportCarsB sportCarsB = new SportCarsB("Public Bus", "Trans Jakarta", "with engine", 4);
        SportCarsB sportCarsB1 = new SportCarsB("private Bus", "School Bus", "with engine", 4);
        sportCarsB.identifyMyself();
        sportCarsB1.identifyMyself();
    }

}
