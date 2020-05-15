package fabrique.simple.produit.pizza.strasbourg;

import fabrique.simple.createur.ingredient.FabriqueIngredients;
import fabrique.simple.produit.pizza.Pizza;

public class PizzaFruitsDeMerStyleStrasbourg extends Pizza {

    public PizzaFruitsDeMerStyleStrasbourg(FabriqueIngredients fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
    }

    @Override
    public void preparer() {
        System.out.println("Préparation de " + nom);
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
    }

    @Override
    public void couper() {
        System.out.println("Découpage en parts carrées");
    }

}
