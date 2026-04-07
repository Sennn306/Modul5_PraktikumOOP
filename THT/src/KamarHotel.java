public class KamarHotel {
    // Mengunci Atribut Kamar Hotel
    private String nomorKamar;
    private String tipeKamar;
    private int kapasitasMaksimal;
    private double hargaPerMalam;
    private boolean isTersedia;

    // Constructor Pertama Untuk Pendaftaran Kilat
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar); 
        this.kapasitasMaksimal = kapasitasMaksimal;
        this.hargaPerMalam = 0.0;
        this.isTersedia = true;
    }

    // Constructor Kedua Untuk Pendaftaran Lengkap
    public KamarHotel(String nomorKamar, String tipeKamar, int kapasitasMaksimal, double hargaPerMalam) {
        this.nomorKamar = nomorKamar;
        setTipeKamar(tipeKamar); 
        this.kapasitasMaksimal = kapasitasMaksimal;
        setHargaPerMalam(hargaPerMalam); 
        this.isTersedia = true;
    }

    // Getter yang diperlukan
    public String getNomorKamar() {
         return this.nomorKamar; }

    public String getTipeKamar() { 
        return this.tipeKamar; }

    public int getKapasitasMaksimal() { 
        return this.kapasitasMaksimal; }

    public double getHargaPerMalam() { 
        return this.hargaPerMalam; }

    public boolean getIsTersedia() { 
        return this.isTersedia; }

    // Setter yang diperlukan
    public void setTipeKamar(String tipeKamar) { // Set Tipe Kamar
        if (tipeKamar.equalsIgnoreCase("Reguler") || tipeKamar.equalsIgnoreCase("Premium") || tipeKamar.equalsIgnoreCase("Suite")) {
            this.tipeKamar = tipeKamar;
        } else {
            System.out.println("Tipe kamar tidak valid, akan diubah menjadi 'Reguler'.");
            this.tipeKamar = "Reguler";
        }
    }  

    public void setHargaPerMalam(double hargaPerMalam) { // Set Harga Per Malam
        if (hargaPerMalam >= 50000) {
            this.hargaPerMalam = hargaPerMalam;
        } else {
            System.out.println("Harga per malam kurang dari Rp50.000, akan diubah menjadi Rp50.000.");
            this.hargaPerMalam = 50000;
        }
    }

    // Metode Pemesanan
    public void pesanKamar() {
        if (this.isTersedia) {
            this.isTersedia = false;
            System.out.println("Kamar " + this.nomorKamar + " berhasil dipesan");
        } else {
            System.out.println("Kamar " + this.nomorKamar + " sudah terisi");
        }
    }


    public void pesanKamar(int jumlahTamu) { // Metode Pemesanan Overloading
        if (!this.isTersedia) {
            System.out.println("Kamar " + this.nomorKamar + " sudah terisi");
        } else if (jumlahTamu > this.kapasitasMaksimal) {
            System.out.println("Pemesanan belum berhasil, jumlah tamu melebihi kapasitas kamar (" + this.kapasitasMaksimal + " orang)");
        } else {
            this.isTersedia = false;
            System.out.println("Kamar " + this.nomorKamar + " berhasil dipesan untuk " + jumlahTamu + " tamu");
        }
    }

    public void batalPesan() { // Metode Batal Pemesanan
        this.isTersedia = true;
        System.out.println("Kamar " + this.nomorKamar + " telah dibatalkan");
    }

    // Metode Pembayaran
    public double hitungTotalBayar(int jumlahMalam) {
        return jumlahMalam * this.hargaPerMalam;
    }

    public double hitungTotalBayar(int jumlahMalam, String kodeVoucher) { // Metode Pembayaran Overloading
        double totalTagihan = hitungTotalBayar(jumlahMalam); 
        
        if (kodeVoucher.equals("PROMO") && jumlahMalam >= 3) {
            System.out.println("Voucher berhasil digunakan, mendapatkan diskon 20%");
            return totalTagihan * 0.8;
        } else {
            System.out.println("Kode invalid atau syarat minimal 3 malam tidak terpenuhi");
            return totalTagihan;
        }
    }

    // Menampilkan Informasi Kamar
    public void tampilkanInfoKamar() {
        System.out.println("Nomor Kamar : " + this.nomorKamar);
        System.out.println("Tipe Kamar  : " + this.tipeKamar);
        System.out.println("Kapasitas   : " + this.kapasitasMaksimal + " Orang");
        System.out.println("Harga/Malam : Rp" + this.hargaPerMalam);
        System.out.println("Status      : " + (this.isTersedia ? "Tersedia" : "Terisi"));
        System.out.println("-----------------------------------");
    }
}