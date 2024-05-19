public class Main {
    public static void main(String[] args) {
        // Deklarasi variabel K bertipe Ulat
        Ulat K = new Ulat();
        // Deklarasi variabel anu bertipe Data dengan parameter Kupu
        Data<Kupu> anu = new Data<>();

        anu.setIsi(K);
        anu.getIsi().gerak();

       
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();

        
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}