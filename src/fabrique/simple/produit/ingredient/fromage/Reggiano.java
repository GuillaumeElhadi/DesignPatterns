package fabrique.simple.produit.ingredient.fromage;

public class Reggiano extends Fromage {


    public Reggiano() {
        nom = "reggiano";
    }

    @Override
    public void getNom() {
        System.out.println(nom);
    }
}
