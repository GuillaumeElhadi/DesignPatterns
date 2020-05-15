package fabrique.simple.createur.ingredient;

import fabrique.simple.produit.ingredient.fromage.Fromage;
import fabrique.simple.produit.ingredient.fruitdemer.FruitDeMer;
import fabrique.simple.produit.ingredient.legume.Legume;
import fabrique.simple.produit.ingredient.pate.Pate;
import fabrique.simple.produit.ingredient.sauce.Sauce;

public interface FabriqueIngredients {

    Pate creerPate();
    Sauce creerSauce();
    Fromage creerFromage();
    Legume[] creerLegumes();
    FruitDeMer creerFruitsDeMer();
}
