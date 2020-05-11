package strategy.v2.model;

import strategy.v2.comportement.cancane.Cancan;
import strategy.v2.comportement.vol.VolerAvecDesAiles;

public class Mandarin extends Canard{

    public Mandarin() {
        super(new VolerAvecDesAiles(), new Cancan());
    }
}
