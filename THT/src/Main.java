public class Main {
    public static void main(String[] args) {

        // Membuat objek KamarHotel
        KamarHotel kamar1 = new KamarHotel("101", "Reguler", 2);
        KamarHotel kamar2 = new KamarHotel("201", "Suite", 2, 800000);

        // Testing 1
        System.out.println("\nTesting 1");
        kamar1.setTipeKamar("Presidential"); 
        kamar1.setHargaPerMalam(-10000);     

        // Testing 2 overloading
        System.out.println("\nTesting 2 Overloading");
        kamar2.pesanKamar(4); 
        kamar2.pesanKamar(2); 
        kamar2.pesanKamar();

        // Testing 3 Voucher
        System.out.println("\nTesting 3 Voucher");
        double tagihanKamar1 = kamar1.hitungTotalBayar(2, "PROMO");
        System.out.println("Total Tagihan Kamar 1: Rp" + tagihanKamar1);

        System.out.println();
        double tagihanKamar2 = kamar2.hitungTotalBayar(4, "PROMO");
        System.out.println("Total Tagihan Kamar 2: Rp" + tagihanKamar2);

        // Cetak struk
        System.out.println("\nSTRUK PEMESANAN KAMAR");
        kamar1.tampilkanInfoKamar();
        kamar2.tampilkanInfoKamar();
    }
}