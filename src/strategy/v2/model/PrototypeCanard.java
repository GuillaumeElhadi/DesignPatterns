package strategy.v2.model;

import strategy.v2.comportement.vol.NePasVoler;

public class PrototypeCanard extends Canard {

    public PrototypeCanard() {
        super.setComportementVol(new NePasVoler());
    }
}
