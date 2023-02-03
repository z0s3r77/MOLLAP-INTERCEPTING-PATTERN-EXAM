package edu.craptocraft.filtres;

public class Autenticacio  implements Filtre{


    public Autenticacio(){}

    @Override
    public void execucio(String tasca) {
        System.out.println("Autenticación OK para "+tasca);
    }
    
}
