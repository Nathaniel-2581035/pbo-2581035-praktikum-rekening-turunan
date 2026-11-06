public class Giro extends Rekening {
    private int batasOverdraft;

    public Giro(String nomor, String pemilik, int saldo, int batasOverdraft) {
        super(nomor, pemilik, saldo);
        this.batasOverdraft = batasOverdraft;
    }

    @Override
    public boolean tarik (int jumlah) {
        if (jumlah <= 0 || saldo - jumlah < -batasOverdraft) {
            System.out.println("Tarik ditolak: melebihi batas overdraft" + formatRupiah(batasOverdraft));
            return false;
        }
        saldo -= jumlah;
        return true;
    }

    @Override
    public void cetakInfo () {
        super.cetakInfo();
        System.out.println("Jenis: Giro(batas overdraft " + formatRupiah(batasOverdraft) + ")");
    }
}
