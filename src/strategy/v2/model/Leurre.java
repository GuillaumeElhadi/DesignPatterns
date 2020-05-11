package strategy.v2.model;

import strategy.v2.comportement.cancane.CanardMuet;
import strategy.v2.comportement.vol.NePasVoler;

public class Leurre extends Canard{

    public Leurre() {
        super(new NePasVoler(), new CanardMuet());
    }
}