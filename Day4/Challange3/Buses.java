package Day4.Challange3;

public class Buses extends Vehicles {

    protected Integer wheelCount;
    private String privateBus;

    public Buses(String privateBus, String name, String withEngine, Integer wheelCount) {
        super(name, withEngine);
        this.wheelCount = wheelCount;
        this.privateBus = privateBus;
    }

    public Integer getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(Integer wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String getPrivateBus() {
        return privateBus;
    }

    public void setPrivateBus(String privateBus) {
        this.privateBus = privateBus;
    }

    public void identifyMyself() {
        System.out.println("Hi i'm Bus "+ this.getPrivateBus() +" My Name is " + this.getName() + ", My Engine Status is " + this.getWithEngine() + ", I have " + this.getWheelCount() + " Wheel(s)");
    }
}
