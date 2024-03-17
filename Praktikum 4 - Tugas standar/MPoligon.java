package org.main;

import org.bangundatar.*;

public class MPoligon {
    public static void main(String[] args) {
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " + persegi.hitungLuas());
    
        Segitiga segitiga1 = new Segitiga(2, 3, 3);

        segitiga1.printInfo();
        System.out.println("Luas Segitiga : " + segitiga1.hitungLuas());
    }
}
