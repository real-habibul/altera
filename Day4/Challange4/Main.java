package Day4.Challange4;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.introduction();

        Herbivor herbivor = new Herbivor();
        herbivor.setNamaBinatang("Herbivor");
        herbivor.setJenisMakanan();
        herbivor.setGigiBinatang();
        herbivor.identifyMyself("Herbivor");

        Carnivor carnivor = new Carnivor();
        carnivor.setNamaBinatang("Carnivor");
        carnivor.setJenisMakanan();
        carnivor.setGigiBinatang();
        carnivor.identifyMyself("Carnivor");

        Omnivor omnivor = new Omnivor();
        omnivor.setNamaBinatang("Omnivor");
        omnivor.setJenisMakanan();
        omnivor.setGigiBinatang();
        omnivor.identifyMyself("Omnivor");
    }
}
