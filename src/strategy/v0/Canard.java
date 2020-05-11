package strategy.v0;

public class Canard {

    public void cancaner() {
        System.out.println("Je cancane.");
    }

    public void nager() {
        System.out.println("Je nage.");
    }

    public void voler() {
        System.out.println("Je vole.");
    }

    public void afficher() {
        System.out.println("Je suis " + this.getClass().getSimpleName() + ".");
    }
}
