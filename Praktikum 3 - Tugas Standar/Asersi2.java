/* Nama : Farisah Ghassani Hasyyati 
/* File : Asersi2.java
 * Deskripsi : Program penggunaan Asersi 
 */
class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}


public class Asersi2 {
    public static void main (String[] args) {
        double jariJari = -2;
        assert(jariJari>0) : "jari jari tidak boleh nol!";
    Lingkaran l = new Lingkaran(jariJari);
    double kelilingLingkaran = l.hitungKeliling();
    System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

/*PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2
Ya, pada inputan nilai jari jari program diatas tertulis -2, sementara syarat dari fungsi tersebut jari jari harus bernilai lebih dari nol. Maka fungsi assert diatas akan memeriksa apakah jari jari > 0, dan jika tidak memenuhi program akan mrmbrikan keluaran "jari jari tidak boleh nol"
 */