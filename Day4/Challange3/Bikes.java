package Day4.Challange3;

public class Bikes extends Vehicles {
    protected Integer wheelCount;

    public Integer getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(Integer wheelCount) {
        this.wheelCount = wheelCount;
    }

    public Bikes(String name, String withEngine, Integer wheelCount) {
        super(name, withEngine);
        this.wheelCount = wheelCount;
    }

    public void identifyMyself() {
        System.out.println("Hi i'm Bike, My Name is " + this.getName() + ", My Engine Status is " + this.getWithEngine() + ", I have " + this.getWheelCount() + " Wheel(s)");
    }
}
