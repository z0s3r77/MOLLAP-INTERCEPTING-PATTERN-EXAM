package edu.craptocraft.clients;

import edu.craptocraft.administrador.*;
public class Mollapp implements Client {


    ProgramadorTasques programador;

    @Override
    public void setProgramadorTasques(ProgramadorTasques programador) {
        this.programador = programador;        
    }

    @Override
    public void enviarPeticio(String peticio) {
        this.programador.executarTasques(peticio);        
    }

    


    
}
