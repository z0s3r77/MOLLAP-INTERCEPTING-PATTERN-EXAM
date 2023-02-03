package edu.craptocraft.administrador;

import edu.craptocraft.filtres.Filtre;
import edu.craptocraft.targets.Vehicle;

public class ProgramadorTasques {

    private Tasques tasques;



    public ProgramadorTasques(Vehicle vehicle) {
        this.tasques = new Tasques();
        this.tasques.setTarget(vehicle);
    }


    public Tasques getTasques(){
        return this.tasques;
    }

    public void setTasca(Filtre filtre){
        this.getTasques().afegirTasca(filtre);

    }

    public void executarTasques(String peticio){
        this.getTasques().execucio(peticio);
    }

}
