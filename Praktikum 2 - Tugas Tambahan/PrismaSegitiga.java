public class PrismaSegitiga {

    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga alas, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }

    public double hitungVolumePrisma() {
        return alas.hitungLuas() * tinggiPrisma;
    }

    public double luasPermukaanPrisma() {
        return (2*alas.hitungLuasSegitiga() +((alas.getSisiMiring() + alas.getAlas() + alas.getTinggiSegitiga()) * tinggiPrisma));
    }
    
}