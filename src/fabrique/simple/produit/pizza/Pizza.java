package fabrique.simple.produit.pizza;

import fabrique.simple.createur.ingredient.FabriqueIngredients;
import fabrique.simple.produit.ingredient.fromage.Fromage;
import fabrique.simple.produit.ingredient.fruitdemer.FruitDeMer;
import fabrique.simple.produit.ingredient.legume.Legume;
import fabrique.simple.produit.ingredient.pate.Pate;
import fabrique.simple.produit.ingredient.sauce.Sauce;

public abstract class Pizza {

    protected FabriqueIngredients fabriqueIngredients;

    protected String nom;
    protected Pate pate;
    protected Sauce sauce;
    protected Fromage fromage;
    protected Legume[] legumes;
    protected FruitDeMer fruitsDeMer;

    public abstract void preparer();

    public void cuire() {
        System.out.println("Cuisson 25 minutes à 180°");
    }
    public void couper() {
        System.out.println("Découpage en parts triangulaires");
    }
    public void emballer() {
        System.out.println("Emballage dans une boîte officielle");
    }
    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

}
