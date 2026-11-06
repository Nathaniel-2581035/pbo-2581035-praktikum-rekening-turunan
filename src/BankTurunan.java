public class BankTurunan {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan("101", "Ani", 1_000_000, 2.5);
        Giro giro = new Giro("201", "Budi", 200_000, 500_000);

        System.out.println("Tabungan tarik 1.500.000: " + (tabungan.tarik(1_500_000) ? "berhasil" : "ditolak"));
        System.out.println("Giro tarik 500.000: " + (giro.tarik(500_000) ? "berhasil" : "ditolak"));
        System.out.println("Giro tarik 300.000: " + (giro.tarik(300_000) ? "berhasil" : "ditolak"));
        System.out.println("Giro setor 100.000: " + (giro.setor(100_000) ? "berhasil" : "ditolak"));

        int bunga = tabungan.tambahBunga();
        System.out.println("Bunga tabungan: " + Rekening.formatRupiah(bunga));
        System.out.println();

        tabungan.cetakInfo();
        giro.cetakInfo();

    }
}