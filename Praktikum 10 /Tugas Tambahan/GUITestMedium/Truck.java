/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


 /*
 * Nama : Farisah Ghassani Hasyyati
 * NIM  : 24060122140137
 * Nama File : Truck.java
 * Deskripsi : File class dari Truck
 */

public class Truck extends Vehicle{
    private double maxLoad;
    
    public Truck (double maxLoad){
        this.maxLoad = maxLoad;
    }
    
    public double calcFuelEfficency(){
        return 0;
    }
    
    public double calcTripDistance(){
        return 0;
    }
    
    @Override
    public String toString(){
        return "Truck adalah angkutan darat yang sangat handal";
    }
}
