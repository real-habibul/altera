package Day4.Challange4;

public class Animal {
    String namaBinatang;
    String jenisMakanan;
    String gigiBinatang;

    public void setNamaBinatang(String namaBinatang) {
        this.namaBinatang = namaBinatang;
    }

    public void setJenisMakanan(String jenisMakanan) {
        this.jenisMakanan = jenisMakanan;
    }

    public void setGigiBinatang(String gigiBinatang) {
        this.gigiBinatang = gigiBinatang;
    }

    public String getNamaBinatang() {
        return namaBinatang;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    public String getGigiBinatang() {
        return gigiBinatang;
    }

    public void introduction() {
        System.out.println("Hi i'm Parent of All Animal, My Name is Binatang");
    }
}
