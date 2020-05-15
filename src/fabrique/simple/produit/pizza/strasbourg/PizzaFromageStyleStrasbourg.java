package fabrique.simple.produit.pizza.strasbourg;

import fabrique.simple.createur.ingredient.FabriqueIngredients;
import fabrique.simple.produit.pizza.Pizza;

public class PizzaFromageStyleStrasbourg extends Pizza {

    public PizzaFromageStyleStrasbourg(FabriqueIngredients fabriqueIngredients) {
        this.fabriqueIngredients = fabriqueIngredients;
    }

    @Override
    public void preparer() {
        System.out.println("Pr�paration de " + nom);
        pate = fabriqueIngredients.creerPate();
        sauce = fabriqueIngredients.creerSauce();
        fromage = fabriqueIngredients.creerFromage();
    }

    @Override
    public void couper() {
        System.out.println("D�coupage en parts carr�es");
    }

}
