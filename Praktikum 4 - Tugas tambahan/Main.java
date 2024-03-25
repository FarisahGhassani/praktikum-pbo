/*  
*   Nama      = Farisah Ghassani Hasyyati
*   NIM       = 24060122140137
*   Nama File = Main.java 22/3/2024 
*   Deskripsi = Program class Main
*/

package bk.main;

import bk.buku.Buku;
import bk.bukuFiksi.BukuFiksi;
import bk.bukuNonFiksi.BukuNonFiksi;

public class Main {

    public static void main(String[] args) {
        Buku buku1 = new BukuFiksi("The Great Gatsby", "F. Scott Fitzgerald", "1925", 180, 50000, "Fiksi, Drama");
        Buku buku2 = new BukuNovel("1984", "George Orwell", "1949", 328, 60000, "Fiksi Ilmiah, Distopia");
        Buku buku3 = new BukuNonFiksi("The Power of Habit: Why We Do What We Do in Life and Business", "Charles Duhigg", "2012", 371, 125000, "Psikologi, Pengembangan Diri, Bisnis");
        Buku buku4 = new BukuAkademik("Introduction to Machine Learning with Python", "Andreas C. Müller, Sarah Guido", "2016", 392, 200000, "Machine Learning, Ilmu Komputer");
        
        
        System.out.println("**Buku Fiksi**");
        buku1.view();
        System.out.println();
        
        System.out.println("**Buku Novel**");
        buku2.view();
        System.out.println();
        
        System.out.println("**Buku Non-Fiksi**");
        buku3.view();
        System.out.println();
        
        System.out.println("**Buku Akademik**");
        buku4.view();
        System.out.println();
        }
}