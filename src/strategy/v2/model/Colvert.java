package strategy.v2.model;

import strategy.v2.comportement.cancane.Cancan;
import strategy.v2.comportement.vol.VolerAvecDesAiles;

public class Colvert extends Canard {

    public Colvert() {
        super(new VolerAvecDesAiles(), new Cancan());
    }

}
