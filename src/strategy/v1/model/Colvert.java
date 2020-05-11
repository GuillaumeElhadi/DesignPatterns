package strategy.v1.model;

import strategy.v1.comportement.Cancaneur;
import strategy.v1.comportement.Volant;

public class Colvert extends Canard  implements Volant, Cancaneur {

    @Override
    public void afficher() {
        super.afficher();
        voler();
        cancaner();
    }

    @Override
    public void cancaner() {
        System.out.println("Je cancane.");
    }

    @Override
    public void voler() {
        System.out.println("Je vole.");
    }



}
