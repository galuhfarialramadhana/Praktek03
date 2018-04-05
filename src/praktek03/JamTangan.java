package praktek03;

public class JamTangan {
    private String merk;
    private String ukuran;
    private String tahun;
    private String bahan;
    private String bentuk;
    private double harga;
    
    
    void cetakInfo(){
        System.out.println("Merk \t: "+merk+"\n"+
                           "Ukuran \t: "+ukuran+"\n"+
                           "Tahun \t: "+tahun+"\n"+
                           "Bahan \t: "+bahan+"\n"+
                           "Bentuk \t: "+bentuk+"\n"+
                           "Bahan \t: "+bahan+"\n"+
                            "Harga \t: "+harga);
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }

    public String getBentuk() {
        return bentuk;
    }

    public void setBentuk(String bentuk) {
        this.bentuk = bentuk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    
}