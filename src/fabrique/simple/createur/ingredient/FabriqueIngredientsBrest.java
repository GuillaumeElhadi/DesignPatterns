package fabrique.simple.createur.ingredient;

import fabrique.simple.produit.ingredient.fromage.Fromage;
import fabrique.simple.produit.ingredient.fromage.Reggiano;
import fabrique.simple.produit.ingredient.fruitdemer.FruitDeMer;
import fabrique.simple.produit.ingredient.fruitdemer.MouleFraiche;
import fabrique.simple.produit.ingredient.legume.Ail;
import fabrique.simple.produit.ingredient.legume.Champignon;
import fabrique.simple.produit.ingredient.legume.Legume;
import fabrique.simple.produit.ingredient.legume.Oignon;
import fabrique.simple.produit.ingredient.legume.Poivron;
import fabrique.simple.produit.ingredient.pate.Pate;
import fabrique.simple.produit.ingredient.pate.PateFine;
import fabrique.simple.produit.ingredient.sauce.Sauce;
import fabrique.simple.produit.ingredient.sauce.SauceMarinara;

public class FabriqueIngredientsBrest implements FabriqueIngredients {

    @Override
    public Pate creerPate() {
        return new PateFine();
    }

    @Override
    public Sauce creerSauce() {
        return new SauceMarinara();
    }

    @Override
    public Fromage creerFromage() {
        return new Reggiano();
    }

    @Override
    public Legume[] creerLegumes() {
        Legume [] legumes = {new Ail(), new Oignon(), new Champignon(), new Poivron()};
        return legumes;
    }

    @Override
    public FruitDeMer creerFruitsDeMer() {
        return new MouleFraiche();
    }

}
