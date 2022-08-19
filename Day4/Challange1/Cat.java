package Day4.Challange1;

public class Cat extends Binatang {
    public static void main(String[] args) {
        Binatang cat1 = new Binatang();
        Binatang cat2 = new Binatang();
        Binatang cat3 = new Binatang();
        Binatang cat4 = new Binatang();

        cat1.setName("Kucing");
        cat1.setFurColor("Hitam");
        cat1.setNumOfLeg(4);

        cat2.setName("Kucing");
        cat2.setFurColor("Putih");
        cat2.setNumOfLeg(3);

        cat3.setName("Kucing");
        cat3.setFurColor("Hitam Putih");
        cat3.setNumOfLeg(4);

        cat4.setName("Kucing");
        cat4.setFurColor("Poleng poleng");
        cat4.setNumOfLeg(3);

        cat1.showIdentity();
        cat2.showIdentity();
        cat3.showIdentity();
        cat4.showIdentity();

    }
}
