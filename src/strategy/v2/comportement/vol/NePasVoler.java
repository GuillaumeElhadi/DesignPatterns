package strategy.v2.comportement.vol;

import strategy.v2.comportement.ComportementVol;

public class NePasVoler implements ComportementVol {

    @Override
    public void voler() {
        System.out.println("Je ne vole pas.");

    }

}
