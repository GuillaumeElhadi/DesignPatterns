package strategy.v2.comportement.vol;

import strategy.v2.comportement.ComportementVol;

public class PropulsionAReaction implements ComportementVol {

    @Override
    public void voler() {
        System.out.println("Je vole avec un réacteur");
    }

}
