package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon{

    private double alas, tinggi;

    public PersegiPanjang(double alas, double tinggi, int jumlahSisi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;

    }

    public double hitungLuas() {
        return alas * tinggi / 2;
    }

    public void printInfo() {

        System.out.println("Bangun Segitiga berupa "+this.getjumlahSisi() + "sisi");

    }

}