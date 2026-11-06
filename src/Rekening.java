public class Rekening {
    private String nomor;
    private String pemilik;
    protected int saldo;

    public Rekening(String nomor, String pemilik, int saldo) {
        this.nomor = nomor;
        this.pemilik = pemilik;
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean setor(int jumlah) {
        if (jumlah <= 0) {
            return false;
        }
        saldo = jumlah + saldo;
        return true;
    }

    public boolean tarik(int jumlah) {
        if (jumlah <= 0 || jumlah > saldo) {
            return false;
        }
        saldo = saldo - jumlah;
        return true;
    }

    public void cetakInfo() {
        System.out.println(nomor + " | " + pemilik + " | " + formatRupiah(saldo));
    }

    protected static String formatRupiah(int angka) {
        boolean negatif = angka < 0;
        String digit = String.valueOf(Math.abs(angka));
        String hasil = "";
        int hitung = 0;
        for (int i = digit.length() - 1; i >= 0; i--) {
            hasil = digit.charAt(i) + hasil;
            hitung++;
            if (hitung % 3 == 0 && i > 0) {
                hasil = "." + hasil;
            }
        }
        return (negatif ? "-Rp" : "Rp") + hasil;
    }
}


