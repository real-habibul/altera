package Day4.Challange1;

public class Fish {
    public static void main(String[] args) {
        Binatang fish1 = new Binatang();
        Binatang fish2 = new Binatang();
        Binatang fish3 = new Binatang();
        Binatang fish4 = new Binatang();

        fish1.setName("Ikan");
        fish1.setJenis("paus");
        fish1.setMakanan("plankton");

        fish2.setName("Ikan");
        fish2.setJenis("cupang");
        fish2.setMakanan("cacing");

        fish3.setName("Ikan");
        fish3.setJenis("arwana");
        fish3.setMakanan("jangkrik");

        fish4.setName("Ikan");
        fish4.setJenis("sapu-sapu");
        fish4.setMakanan("pelet");

        fish1.showIdentity();
        fish2.showIdentity();
        fish3.showIdentity();
        fish4.showIdentity();
    }
}
