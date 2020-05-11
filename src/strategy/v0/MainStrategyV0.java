package strategy.v0;

public class MainStrategyV0 {

    public static void main(String ...args) {

        Colvert colvert = new Colvert();
        Mandarin mandarin = new Mandarin();
        CanardEnPlastique canarEnPlastique = new CanardEnPlastique();

        colvert.afficher();
        System.out.println("\n");
        mandarin.afficher();
        System.out.println("\n");
        canarEnPlastique.afficher();

    }

}
