/* Nama : Farisah Ghassani Hasyyati 
File : AngkaSial.java
Deskripsi : Program penggunaan eksepsi menggunakan library java
 /* */
 public class AngkaSIal {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13) {
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "exception"
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka!!!");
        }
    }
}

/*
*Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
ya, buat angka yg 10, karena sebelum angka 13 (angka sial)
*Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
ya, catch akan dieksekusi karena pada as.cobaangka terdapat angka (13) dimana angka tersebut merupakan angka sial sehingga akan dilempar ke catch
 */