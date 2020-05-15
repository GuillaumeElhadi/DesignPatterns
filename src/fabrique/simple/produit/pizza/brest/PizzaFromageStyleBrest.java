package fabrique.simple.produit.pizza.brest;

import fabrique.simple.createur.ingredient.FabriqueIngredients;
import fabrique.simple.produit.pizza.Pizza;

public class PizzaFromageStyleBrest extends Pizza {

    public PizzaFromageStyleBrest(FabriqueIngredients fabriqueIngredients) {
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
