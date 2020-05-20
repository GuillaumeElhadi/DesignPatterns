package adapteur;

import adapteur.adapteurs.AdapteurDindon;
import adapteur.canards.Canard;
import adapteur.canards.Colvert;
import adapteur.dindons.Dindon;
import adapteur.dindons.DindonSauvage;

public class AdapteurMain {

    public static void main(String[] args) {
        Canard canard = new Colvert();

        Dindon dindon = new DindonSauvage();

        System.out.println("Dindon dit...");
        dindon.glouglouter();
        dindon.voler();

        System.out.println("\nCanard dit...");
        testerCanard(canard);

        System.out.println("\nAdapteurCanard dit...");
        AdapteurDindon adapteurDindon = new AdapteurDindon(dindon);
        testerCanard(adapteurDindon);

    }

    private static void testerCanard(Canard canard) {
        canard.cancaner();
        canard.voler();
    }

}
