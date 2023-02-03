package edu.craptocraft.filtres;

public class Autoritzacio implements Filtre{

    @Override
    public void execucio(String peticio) {
        System.out.println("Autorización OK para "+peticio);        
    }
    
}
