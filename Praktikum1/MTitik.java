/*  
*   Nama File = MTiitik.java
*   Penulis   = Farisah Ghassani Hasyyati
*   Deskripsi = Program class MTitik
*/

public class MTitik{
    public static void main(String[] args){
        
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        Titik t3;
        t3 = new Titik(5,6);

        System.out.println("Jumlah objek titik : " + Titik.getCounterTitik());
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")" );
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")" );
        System.out.println("t3(" + t3.getAbsis() + ", " + t3.getOrdinat() + ")" );

        //Jarak titik ke pusat
        System.out.println("Jarak t1(" + t1.getAbsis() + "," + t1.getOrdinat() + ") ke pusat adalah" + t1.getJarakPusat());
    
        //Refleksi sumbu x
        t1.refleksiX();
        System.out.println("Refleksi sumbu X t1 (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
    
        //Refleksi sumbu y 
        t1.refleksiY();
        System.out.println("Refleksi sumbu Y t1 (" + t1.getAbsis() + "," + t1.getOrdinat() +")");   

        //KESIMPULAN 
        /*#Perbedaan access modifier public dan private adalah pada pembatasan aksesibilitasnya. 
         * Kode public contohnya yang digunakan pada method 'setAbsis','getOrdinat', 'getCounterTitik', dll dapat diakses dan dimanipulasi dari luar kelas tersebut.
         * Sedangkan kode private yang digunakan pada atribut 'absis', 'getJarakPusat', 'refleksiX' dan lainnya tidak dapat diakses ataupun dimanipulasi kelas lain yang tujuannya untuk melindungi atributnya.
         */
    }


}
