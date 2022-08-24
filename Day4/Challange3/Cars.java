package Day4.Challange3;

public class Cars extends Vehicles {

    protected Integer wheelCount;
    protected String engineType;

    public Cars(String name, String withEngine, Integer wheelCount, String engineType) {
        super(name, withEngine);
    }

    public Integer getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(Integer wheelCount) {
        this.wheelCount = wheelCount;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void identifyMyself() {
        System.out.println("Hi i'm Car, My Name is " + this.getName() + ", My Engine Status is " + this.getWithEngine() + ", I have " + this.getWheelCount() + " Wheel(s), My Engine Type = " + this.getEngineType());
    }
}
