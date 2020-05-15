package fabrique.simple.produit.pizza.marseille;

import fabrique.simple.createur.ingredient.FabriqueIngredients;
import fabrique.simple.produit.pizza.Pizza;

public class PizzaFruitsDeMerStyleMarseille extends Pizza {

    public PizzaFruitsDeMerStyleMarseille(FabriqueIngredients fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
    }

    @Override
    public void preparer() {
        System.out.println("Préparation de " + nom);
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
    }
}
