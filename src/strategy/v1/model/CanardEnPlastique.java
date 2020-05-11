package strategy.v1.model;

import strategy.v1.comportement.Cancaneur;

public class CanardEnPlastique extends Canard implements Cancaneur{


    @Override
    public void afficher() {
        super.afficher();
        cancaner();
    }

    @Override
    public void cancaner() {
        System.out.println("Je couine.");
    }
}
