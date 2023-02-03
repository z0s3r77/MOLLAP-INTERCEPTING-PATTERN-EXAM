package edu.craptocraft.administrador;

import java.util.ArrayList;
import java.util.List;

import edu.craptocraft.filtres.Filtre;
import edu.craptocraft.targets.Target;

public class Tasques {

    private Target target;
    private List<Filtre> filtres = new ArrayList<Filtre>();
    

    public List<Filtre> getTasques(){
        return this.filtres;
    }

    public Target getTarget(){
        return this.target;
    }

    public void afegirTasca(Filtre tasca){
        getTasques().add(tasca);

    }

    public void execucio(String peticio){
        getTasques().stream().forEach(target -> target.execucio(peticio));
        getTarget().execucio(peticio);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
