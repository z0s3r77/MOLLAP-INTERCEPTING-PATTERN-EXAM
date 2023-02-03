package edu.craptocraft.administrador;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.filtres.Filtre;
import edu.craptocraft.targets.Target;

public class Tasques {
    
    public Target target;
    public List<Filtre> filtres = new ArrayList<Filtre>();

    public List<Filtre> getTasques(){
        return this.filtres;
    }

    public Target getTarget(){
        return this.target;
    }

    public void afegirTasca(Filtre filtre){
        this.filtres.add(filtre);
    }

    public void execucio(String peticio){
        getTasques().stream()
                    .forEach(filtre -> filtre.execucio(peticio));
        getTarget().execucio(peticio);
                    
    }   

    public  void setTarget(Target target){
        this.target = target;
    }
}

