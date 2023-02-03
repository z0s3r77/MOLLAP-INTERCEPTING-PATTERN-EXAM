package edu.craptocraft.clients;

import edu.craptocraft.administrador.ProgramadorTasques;


public class Mollapp implements Client {

    private ProgramadorTasques programadorTasques;


    @Override
    public void enviarPeticio(String peticio) {
        programadorTasques.executarTasques(peticio);
        
    }

    @Override
    public void setProgramadorTasques(ProgramadorTasques programadorTasques) {
        this.programadorTasques = programadorTasques;
    }
    
}
