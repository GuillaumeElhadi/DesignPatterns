package strategy.v2.model;

import strategy.v2.comportement.cancane.CoinCoin;
import strategy.v2.comportement.vol.NePasVoler;

public class CanardEnPlastique extends Canard{

    public CanardEnPlastique() {
        super(new NePasVoler(), new CoinCoin());
    }
}
