/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/*
 * Nama : Farisah Ghassani Hasyyati
 * NIM  : 24060122140137
 * Nama File : Airplane.java
 * Deskripsi : File class dari Airplane
*/

public abstract class Airplane extends Vehicle implements IFlyer{
    private double maxLoad;
    
    public Airplane (double maxLoad){
        this.maxLoad = maxLoad;
    }
    
    public double calcFuelEfficiency(){
        return 0;
    }
    
    public double calcTripDistance(){
        return 0;
    }
}
