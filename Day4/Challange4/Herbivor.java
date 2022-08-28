package Day4.Challange4;

public class Herbivor extends Animal {
    public void setJenisMakanan() {
        super.setJenisMakanan("tumbuhan");
    }

    public void setGigiBinatang() {
        super.setGigiBinatang("tumpul");
    }

    public String getJenisMakanan() {
        return super.getJenisMakanan();
    }

    public String getGigiBinatang() {
        return super.getGigiBinatang();
    }

    public void identifyMyself(String namaBinatang) {
        System.out.println("Hi I'm a herbivor, My Name is " + namaBinatang + ", My Food is " + this.getJenisMakanan() + ", I have " + this.getGigiBinatang() + " teeth");
    }

}
