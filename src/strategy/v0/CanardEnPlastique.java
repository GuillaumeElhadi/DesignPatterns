package strategy.v0;

public class CanardEnPlastique extends Canard {


    @Override
    public void afficher() {
        super.afficher();
        cancaner();
        voler();

    }

    @Override
    public void cancaner() {
        System.out.println("Je couine.");
    }

    @Override
    public void voler() {

    }



}
