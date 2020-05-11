package strategy.v2;

import strategy.v2.comportement.vol.PropulsionAReaction;
import strategy.v2.model.Canard;
import strategy.v2.model.PrototypeCanard;

public class MainStrategyV2 {

    public static void main(String ...args) {

        Canard canard = new PrototypeCanard();
        canard.effectuerVol();

        canard.setComportementVol(new PropulsionAReaction());
        canard.effectuerVol();
    }

}
