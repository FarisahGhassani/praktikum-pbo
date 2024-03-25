/*  
*   Nama      = Farisah Ghassani Hasyyati
*   NIM       = 24060122140137
*   Nama File = bukuFiksi.java 
*   Deskripsi = Program class bukuFiksi
*/

package bk.BukuFiksi;

import bk.buku.Buku;

public class bukuFiksi extends Buku {
    private String genre;

    public bukuFiksi(String judul, String penulis, String tahunTerbit, int jumlahHalaman, double harga, String genre) {
        super(judul, penulis, tahunTerbit, jumlahHalaman, harga);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void view() {
        super.view();
        System.out.println("Genre: " + genre);
    }
}