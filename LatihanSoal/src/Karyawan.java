public class Karyawan { // Nomor 1
    private String Nama; // Nomor 1
    private String IdKaryawan; // Nomor 1
    private double GajiPokok; // Nomor 2
    private String Divisi; // Nomor 3


    public Karyawan(String Nama, String IdKaryawan, double GajiPokok, String Divisi) { // Nomor 1

        this.Nama = Nama;
        this.IdKaryawan = IdKaryawan;
        this.GajiPokok = GajiPokok;
        this.Divisi = Divisi;
        
    }

    public String getNama() { // Nomor 1
        return Nama;
    }

    public String getIdKaryawan() { // Nomor 1
        return IdKaryawan;
    }

    public double getGajiPokok() { // Nomor 2
        return GajiPokok;
    }

    public void setGajiPokok(double gaji) { // Nomor 2
        if (gaji > 0) {
            this.GajiPokok = gaji;
        } else {
            System.out.println("Gaji Pokok tidak boleh negatif");
        }
    } 

    public void tampilkanDataKaryawan (){ // Nomor 3
        System.out.println("Nama: " + Nama);
        System.out.println("ID Karyawan: " + IdKaryawan);
        System.out.println("Gaji Pokok: " + GajiPokok);
        System.out.println("Divisi: " + Divisi);
    }
}