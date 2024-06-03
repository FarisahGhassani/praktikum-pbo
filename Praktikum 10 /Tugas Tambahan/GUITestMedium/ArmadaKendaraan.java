/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ghasa
 */
import java.util.*;

public class ArmadaKendaraan {
    private List<Vehicle> allArmada = new ArrayList<>();
    
    public void tambahArmada(List< ? extends Vehicle> armada){
        allArmada.addAll(armada);
    }
    
    public List<Vehicle> getAllArmada(){
        return allArmada;
    }
}
