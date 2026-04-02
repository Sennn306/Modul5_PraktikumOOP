public class Barang {
    private String IdBarang;
    private String NamaBarang;
    private int Stok;
    private double HargaSatuan;
    private String Kategori;


    public Barang(String IdBarang, String NamaBarang) {
        this.IdBarang = IdBarang;
        this.NamaBarang = NamaBarang;
        this.Stok = 0;
        this.HargaSatuan = 0.0;
        this.Kategori = "";
    }

    public String getIdBarang() {
        return IdBarang;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public int getStok() {
        return Stok;
    }

    public double getHargaSatuan() {
        return HargaSatuan;
    }

    public void setHargaSatuan(double Harga) {
        if (Harga >= 0) {
            this.HargaSatuan = Harga;
        } else {
            System.out.println("Harga tidak valid.");
        }
    }

    public void tambahStok(int jumlah) {
        Stok += jumlah;
    }

    public void setJumlahStok(int jumlah) {
        Stok = jumlah;
    }

    public void kurangiStok(int jumlah) {
        if(Stok > jumlah) {
            Stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi.");
        }
    }

    public void setKategori(String Kategori) {
        this.Kategori = Kategori;
    }

    public void TampilkanDetailBarang(){
        System.out.println("ID Barang: " + IdBarang);
        System.out.println("Nama Barang: " + NamaBarang);
        System.out.println("Stok: " + Stok);
        System.out.println("Harga Satuan: " + HargaSatuan);
    }



}