import java.util.Scanner;

public class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();

        System.out.print("Masukkan sisi Bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
    }
}


/* apa yang terjadi apablia kelas BujurSangkar tidak membuat implementasi
metode abstrak yang ada pada kelas BangunDatar ? jelaskan !
class turunannya harus mengimplementasiin kelas abstraknya
*/