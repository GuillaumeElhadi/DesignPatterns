package adapteur.adapteurs;

import adapteur.canards.Canard;
import adapteur.dindons.Dindon;

public class AdapteurDindon implements Canard {

    private Dindon dindon;

    public AdapteurDindon(Dindon dindon) {
        this.dindon = dindon;
    }

    @Override
    public void cancaner() {
        dindon.glouglouter();
    }

    @Override
    public void voler() {
        for (int i = 0; i < 5; i++) {
            dindon.voler();
        }
    }

}
