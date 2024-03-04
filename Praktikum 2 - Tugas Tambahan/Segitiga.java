public class Segitiga {

    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getAlas() {
        return alas;
    }

    public double getTinggiSegitiga() {
        return tinggi;
    }

    public double hitungLuasSegitiga() {
        return 0.5 * getAlas() * getTinggiSegitigainggi();
    }
    public double getSisiMiring(){
        return Math.sqrt(Math.pow(getAlas()/2, b:2) + Math.pow(getTinggiSegitiga(), b:2));
    }
}