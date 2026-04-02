public class RekeningBank{
    private String nomorRekening;
    private int saldo;

    RekeningBank(String nomorRekening, int saldo){
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public void setSaldo(int saldoBaru){
        if (saldoBaru < 0){
            System.out.println("Salah");
        } else {
            this.saldo = saldoBaru;
            System.out.println("Mantap");
        }
    }
}