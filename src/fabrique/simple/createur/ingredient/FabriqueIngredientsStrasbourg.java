package fabrique.simple.createur.ingredient;

import fabrique.simple.produit.ingredient.fromage.Fromage;
import fabrique.simple.produit.ingredient.fruitdemer.FruitDeMer;
import fabrique.simple.produit.ingredient.legume.Legume;
import fabrique.simple.produit.ingredient.pate.Pate;
import fabrique.simple.produit.ingredient.sauce.Sauce;

public class FabriqueIngredientsStrasbourg implements FabriqueIngredients {

    @Override
    public Pate creerPate() {
        return null;
    }

    @Override
    public Sauce creerSauce() {
        return null;
    }

    @Override
    public Fromage creerFromage() {
        return null;
    }

    @Override
    public Legume[] creerLegumes() {
        return null;
    }

    @Override
    public FruitDeMer creerFruitsDeMer() {
        return null;
    }

}
