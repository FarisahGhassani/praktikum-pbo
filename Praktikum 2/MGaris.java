/*
 * Nama : Farisah Ghassani Hasyyati
 * NIM : 24060122140137
 * Nama file : MGaris.java
 * Deskripsi : Main class dari program titik
 */

 public class MGaris {
    public static void main(String[] args) {
        // Membuat objek garis
        Garis garis = new Garis();

        // Mendapatkan titik awal dan akhir garis
        Titik tAwal = garis.getTitikAwal();
        Titik tAkhir = garis.getTitikAkhir();

        // Menampilkan titik awal dan akhir garis
        System.out.println("Titik Awal(" + tAwal.getAbsis() + "," + tAwal.getOrdinat() + ")");
        System.out.println("Titik Akhir(" + tAkhir.getAbsis() + "," + tAkhir.getOrdinat() + ")");

        // Menampilkan panjang dan gradien garis
        System.out.println("Panjang Garis G = " + garis.getPanjang());
        System.out.println("Gradien Garis G = " + garis.getGradien());
        
        // Mendapatkan refleksi sumbu Y dari garis
        Garis gRefleksiY = garis.getRefleksiY();
        // Mendapatkan titik awal dan akhir dari garis yang direfleksikan terhadap sumbu Y
        Titik tAwalRefleksiY = gRefleksiY.getTitikAwal();
        Titik tAkhirRefleksiY = gRefleksiY.getTitikAkhir();

        // Menampilkan titik awal dan akhir garis yang direfleksikan terhadap sumbu Y
        System.out.println("Titik Awal (" + tAwalRefleksiY.getAbsis() + "," + tAwalRefleksiY.getOrdinat() + ")");
        System.out.println("Titik Akhir (" + tAkhirRefleksiY.getAbsis() + "," + tAkhirRefleksiY.getOrdinat() + ")");

        // Menampilkan apakah garis G tegak lurus dengan garis yang direfleksikan terhadap sumbu Y
        System.out.println("Garis G tegak lurus dengan garis GRefleksiY = " + garis.isTegakLurus(gRefleksiY));
    }
}
