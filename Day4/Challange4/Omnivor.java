package Day4.Challange4;

public class Omnivor extends Animal{
    public void setJenisMakanan() {
        super.setJenisMakanan("semua");
    }

    public void setGigiBinatang() {
        super.setGigiBinatang("tajam dan tumpul");
    }

    public String getJenisMakanan() {
        return super.getJenisMakanan();
    }

    public String getGigiBinatang() {
        return super.getGigiBinatang();
    }

    public void identifyMyself(String namaBinatang) {
        System.out.println("Hi I'm a Omnivor, My Name is " + namaBinatang + ", My Food is " + this.getJenisMakanan() + ", I have " + this.getGigiBinatang() + " teeth");
    }
}
