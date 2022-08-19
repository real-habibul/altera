package Day4.Challange1;

public class Car {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        car1.setType("sedan");
        car1.setColor("merah");
        car1.setNumOfTire(4);

        car2.setType("truk");
        car2.setColor("hijau");
        car2.setNumOfTire(6);

        car3.setType("trontonan");
        car3.setColor("coklat");
        car3.setNumOfTire(12);

        car4.setType("angkot");
        car4.setColor("kuning");
        car4.setNumOfTire(4);

        car1.showIdentity();
        car2.showIdentity();
        car3.showIdentity();
        car4.showIdentity();


    }

    protected String type;
    protected String color;
    protected Integer numOfTire;

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public Integer getNumOfTire() {
        return numOfTire;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumOfTire(Integer numOfTire) {
        this.numOfTire = numOfTire;
    }

    public void showIdentity() {
        System.out.println("Saya Mobil dengan detail, Type :" + this.getType() + ", color: " + this.getColor() + ", num of tire: " + this.getNumOfTire());
    }

}
