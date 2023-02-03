package edu.craptocraft.targets;

public class Vehicle implements Target {

    @Override
    public void execucio(String peticio) {
        System.out.println("Puerta abierta para" + peticio+"!");        
    }
    
}
