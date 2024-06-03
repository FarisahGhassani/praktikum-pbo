/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ghasa
 */

/*
 * Nama : Farisah Ghassani Hasyyati
 * NIM  : 24060122140137
 * Nama File : ProgramMedium.java
 * Deskripsi : File Main dari Program LatianMedium
 */


import java.util.*;
public class ProgramMedium {
    public static void main (String[] args){
        Truck truck = new Truck(10);
        System.out.println(truck);
        
        SeaPlane sPlane = new SeaPlane(10);
        System.out.println(sPlane);
        
        Helicopter copter = new Helicopter(10);
        System.out.println(copter);
        
        System.out.println("###################################################");
        
        List<Truck> armadaTruck = new ArrayList();
        List<SeaPlane> armadaSeaPlane = new ArrayList();
        List<Helicopter> armadaHelicopter = new ArrayList();
        
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("Jumlah Armada Truck : " + armadaTruck.size());
        armadaSeaPlane.add(sPlane);
        System.out.println("Jumlah Armada SeaPlane : " + armadaSeaPlane.size());
        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("Jumlah Armada Helicopter : " + armadaHelicopter.size());
        
        System.out.println("###################################################");
        
        ArmadaKendaraan armadaKendaraan = new ArmadaKendaraan();

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaSeaPlane);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
        
        
        
        
        
    }
}
