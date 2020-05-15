package fabrique.simple.produit.ingredient.fromage;

public class FromageDeChevre extends Fromage {

    public FromageDeChevre() {
        nom = "fromage de chèvre";
    }

    @Override
    public void getNom() {
        System.out.println(nom);
    }
}
