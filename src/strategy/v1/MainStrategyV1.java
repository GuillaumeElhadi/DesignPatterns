package strategy.v1;

import strategy.v1.model.CanardEnPlastique;
import strategy.v1.model.Colvert;
import strategy.v1.model.Leurre;
import strategy.v1.model.Mandarin;

public class MainStrategyV1 {

    public static void main(String ...args) {

        Colvert colvert = new Colvert();
        Mandarin mandarin = new Mandarin();
        CanardEnPlastique canarEnPlastique = new CanardEnPlastique();
        Leurre leurre = new Leurre();

        colvert.afficher();
        System.out.println("\n");
        mandarin.afficher();
        System.out.println("\n");
        canarEnPlastique.afficher();
        System.out.println("\n");
        leurre.afficher();

    }

}
