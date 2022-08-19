package Day4.Challange3;

public class Vehicles {
    public String name;
    public String withEngine;

    public Vehicles(String name, String withEngine) {
        this.name = name;
        this.withEngine = withEngine;
//        if (withEngine) {
//            this.withEngine = Boolean.valueOf("with engine");
//        } else {
//            this.withEngine = Boolean.valueOf("no engine");
//        }
    }

    public String getName() {
        return name;
    }

    public String getWithEngine() {
        return withEngine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWithEngine(String withEngine) {
        this.withEngine = withEngine;
    }

    public void identifyMyself() {
        System.out.println("I am a vehicle");
    }


}

