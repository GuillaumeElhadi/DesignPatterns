package adapteur.canards;

public class Colvert implements Canard {

    @Override
    public void cancaner() {
        System.out.println("Coincoin");
    }

    @Override
    public void voler() {
        System.out.println("Je vole");
    }

}
