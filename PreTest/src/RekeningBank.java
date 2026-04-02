public class RekeningBank {
    private String nomorRekening;
    private double saldo;

    public RekeningBank(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        this.saldo = saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double upSaldo){
        if (upSaldo > 0) {
            this.saldo = upSaldo;
        } else {
            System.out.println("Saldo tidak boleh negatif");
        }
    }
}