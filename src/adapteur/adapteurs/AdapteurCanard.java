package adapteur.adapteurs;

import adapteur.canards.Canard;
import adapteur.dindons.Dindon;

public class AdapteurCanard implements Dindon {

    private Canard canard;

    public AdapteurCanard(Canard canard) {
        this.canard = canard;
    }

    @Override
    public void glouglouter() {
        canard.cancaner();
    }

    @Override
    public void voler() {
        canard.voler();
    }

}
