public class Main {
    public static void main(String[] args) { // Nomor 4
        Karyawan karyawan1 = new Karyawan("Rizky", "K001", 2000000, "IT");
        karyawan1.tampilkanDataKaryawan(); // Test 1

        karyawan1.setGajiPokok(3000000); // Test ubah gaji
       
        karyawan1.tampilkanDataKaryawan(); // Test 2

        karyawan1.setGajiPokok(-1000000); // Test ubah gaji mines

        karyawan2.tampilkanDataKaryawan(); // Test 3
    }
}