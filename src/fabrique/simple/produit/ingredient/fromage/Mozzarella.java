package fabrique.simple.produit.ingredient.fromage;

public class Mozzarella extends Fromage {


    public Mozzarella() {
        nom = "Mozzarella";
    }

    @Override
    public void getNom() {
        System.out.println(nom);
    }
}
