package Day4.Challange3;

public class Main {
    public static void main(String[] args) {
        PedalBikes pedalBikes = new PedalBikes("Pedal Bikes", "no engine", 2);
        MotorBikes motorBikes = new MotorBikes("Motor Bikes", "with engine", 2);
        pedalBikes.identifyMyself();
        motorBikes.identifyMyself();
    }
}
