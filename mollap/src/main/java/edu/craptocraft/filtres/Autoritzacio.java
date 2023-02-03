package edu.craptocraft.filtres;

public class Autoritzacio implements Filtre {


    public Autoritzacio(){}


    @Override
    public void execucio(String tasca) {
        System.out.println("Autorización OK para "+tasca);        
    }
    
}
