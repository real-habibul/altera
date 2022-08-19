package Day4.Challange1;

public class Binatang {
    protected String furColor;
    protected Integer numOfLeg;
    public String name;
    private String jenis;
    protected String makanan;

    public java.lang.String getName() {
        return name;
    }

    public String getFurColor() {
        return furColor;
    }

    public Integer getNumOfLeg() {
        return numOfLeg;
    }

    public String getJenis() {
        return jenis;
    }

    public String getMakanan() {
        return makanan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setNumOfLeg(Integer numOfLeg) {
        this.numOfLeg = numOfLeg;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public void showIdentity() {
        if (this.getName() == "Kucing") {
            System.out.println("Saya " + this.getName() + " dengan detail, Warna Bulu: " + this.getFurColor() + " dengan jumlah kaki: " + this.getNumOfLeg());
        } else if (this.getName() == "Ikan") {
            System.out.println("Saya " + this.getName() + " dengan detail, Jenis: " + this.getJenis() + " makanan: " + this.getMakanan());
        } else {
            System.out.println("untuk saat ini hanya support hewan Kucing dan Ikan");
        }
    }
}
