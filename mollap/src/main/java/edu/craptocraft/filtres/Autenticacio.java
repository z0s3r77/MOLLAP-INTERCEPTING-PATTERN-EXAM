package edu.craptocraft.filtres;

public class Autenticacio implements Filtre {



    @Override
    public void execucio(String peticio) {
        System.out.println("Autenticación OK para "+peticio);
    }
    
}
