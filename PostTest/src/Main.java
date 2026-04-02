public class Main {
    public static void main(String[] args) throws Exception {
        Barang barang1 = new Barang("B001", "Pensil"); // ini buat ngisi data awal
        barang1.setJumlahStok(10); // ini buat ngisi data awal dulu
        barang1.setKategori("Peralatan Sekolah");

        //Testing
        //barang1.Stok(50); // Test ngubah stok barang tanpa setter
        /*Line 8 yakni barang1.Stok(50); ini akan menyebabkan error, karena mencoba mengubah value dari stok tanpa setter, padahal
        stok barang ini bersifat privat, jika ingin mengubahnya, perlu menggunakan setq*/


        barang1.setHargaSatuan(-5000); // Test ngubah harga barang tidak sesuai kategori
        System.out.println("Output setelah coba ngubah harga barang tidak sesuai kategori");
        barang1.TampilkanDetailBarang(); // Output setelah coba ngubah harga barang tidak sesuai kategori
        System.out.println("--------------------------------------------------\n");

        barang1.kurangiStok(12); // Test kurangi stok barang
        System.out.println("Output setelah coba ngubah kurangi stok barang sampai minus");
        barang1.TampilkanDetailBarang(); // Output setelah coba ngubah kurangi stok barang
        System.out.println("--------------------------------------------------\n");

        // Menampilkan data yang benar
        barang1.setJumlahStok(10); // ini buat ngisi data awal dulu
        barang1.setKategori("Peralatan Sekolah");
        barang1.setHargaSatuan(5000);
        System.out.println("Output detail barang yang valid");
        barang1.TampilkanDetailBarang(); // Output detail barang
        
    }
}