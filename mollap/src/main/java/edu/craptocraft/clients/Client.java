package edu.craptocraft.clients;

import edu.craptocraft.administrador.ProgramadorTasques;

public interface Client {
    public void setProgramadorTasques(ProgramadorTasques programadorTasques);
    public void enviarPeticio(String peticio);
}
