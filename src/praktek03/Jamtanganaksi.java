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
        
        System.out.println(j.getMerk());
        System.out.println(j.getUkuran());
        System.out.println(j.getTahun());
        System.out.println(j.getBahan());
        System.out.println(j.getBentuk());
        System.out.println(j.getHarga());
    }
}
