package Day4.Challange1;

public class Flower {
    public static void main(String[] args) {
        Flower flower1 = new Flower();
        Flower flower2 = new Flower();
        Flower flower3 = new Flower();
        Flower flower4 = new Flower();

        flower1.setJenis("bangkai");
        flower2.setJenis("anggrek");
        flower3.setJenis("mawar");
        flower4.setJenis("melati");

        flower1.setWarna("merah");
        flower2.setWarna("putih");
        flower3.setWarna("merah");
        flower4.setWarna("kuning");

        flower1.setNumOfPetal(4);
        flower2.setNumOfPetal(6);
        flower3.setNumOfPetal(12);
        flower4.setNumOfPetal(4);

        flower1.showIdentity();
        flower2.showIdentity();
        flower3.showIdentity();
        flower4.showIdentity();
    }

    protected String jenis;
    protected String warna;
    protected Integer numOfPetal;

    public String getJenis() {
        return jenis;
    }

    public String getWarna() {
        return warna;
    }

    public Integer getNumOfPetal() {
        return numOfPetal;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setNumOfPetal(Integer numOfPetal) {
        this.numOfPetal = numOfPetal;
    }

    public void showIdentity() {
        System.out.println("Saya Bunga dengan detail, Jenis :" + this.getJenis() + ", color: " + this.getWarna() + ", num of petal: " + this.getNumOfPetal());
    }
}
