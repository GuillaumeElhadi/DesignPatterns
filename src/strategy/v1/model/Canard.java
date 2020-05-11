package strategy.v1.model;

public class Canard {

    public void nager() {
        System.out.println("Je nage.");
    }

    public void afficher() {
        System.out.println("Je suis un " + this.getClass().getSimpleName() + ".");
    }
}
