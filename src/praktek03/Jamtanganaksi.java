package praktek03;

public class Jamtanganaksi {
    public static void main(String[] args) {
        JamTangan j = new JamTangan();
       j.setMerk("swiss army");
       j.setUkuran("5 cm");
       j.setTahun("2016");
       j.setBahan("karet");
       j.setBentuk("persegi panjang");
       j.setHarga(150000);
        
        j.cetakInfo();
    }
}
