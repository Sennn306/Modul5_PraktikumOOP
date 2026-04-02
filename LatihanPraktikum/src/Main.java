public class main{
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        mhs.nama = "ujang";
        // mhs.nim = "123456";
        mhs.setNim("123456");
        
        System.out.println(mhs.nama);
        System.out.println(mhs.nim);
    }
}