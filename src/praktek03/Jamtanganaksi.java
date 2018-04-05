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
       //gak bisaa j.setJenisJam(); 
        j.cetakInfo();
        
        System.out.println(j.getMerk());
        System.out.println(j.getUkuran());
        System.out.println(j.getTahun());
        System.out.println(j.getBahan());
        System.out.println(j.getBentuk());
        System.out.println(j.getHarga());
        
        
        Jam jm = new Jam();
        
        jm.setMerk("DW");
        jm.setUkuran("4 cm");
        jm.setTahun("2015");
        jm.setBahan("Kanvas");
        jm.setBentuk("Persegi");
        jm.setHarga(120000);
        jm.setJenisJam("Jam Tangan");
        jm.cetakInfo();
        System.out.println("Jenis \t:"+jm.getJenisJam());
        jm.throttle();
        
        
    }
}
