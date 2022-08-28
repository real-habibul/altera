package Day4.Challange4;

public class Carnivor extends Animal{
    public void setJenisMakanan() {
        super.setJenisMakanan("daging");
    }

    public void setGigiBinatang() {
        super.setGigiBinatang("tajam");
    }

    public String getJenisMakanan() {
        return super.getJenisMakanan();
    }

    public String getGigiBinatang() {
        return super.getGigiBinatang();
    }

    public void identifyMyself(String namaBinatang) {
        System.out.println("Hi I'm a Carnivor, My Name is " + namaBinatang + ", My Food is " + this.getJenisMakanan() + ", I have " + this.getGigiBinatang() + " teeth");
    }

}
