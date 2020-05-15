package fabrique.simple.createur.pizzeria;

import fabrique.simple.createur.ingredient.FabriqueIngredientsBrest;
import fabrique.simple.produit.pizza.Pizza;
import fabrique.simple.produit.pizza.brest.PizzaFromageStyleBrest;
import fabrique.simple.produit.pizza.brest.PizzaFruitsDeMerStyleBrest;
import fabrique.simple.produit.pizza.brest.PizzaJambonFromageStyleBrest;

public class PizzeriaBrest extends Pizzeria {

    @Override
    public Pizza commanderPizza(String typePizza) {

        Pizza maPizza = creerPizza(typePizza);

        maPizza.preparer();
        maPizza.cuire();
        maPizza.couper();
        maPizza.emballer();

        return maPizza;
    }

    @Override
    public Pizza creerPizza(String typePizza) {

        Pizza pizza;
        FabriqueIngredientsBrest fabriqueIngredient = new FabriqueIngredientsBrest();

        switch (typePizza) {
        case "FROMAGE":
            pizza = new PizzaFromageStyleBrest(fabriqueIngredient);
            break;
        case "JAMBON_FROMAGE":
            pizza = new PizzaJambonFromageStyleBrest(fabriqueIngredient);
            break;
        case "FRUITS_DE_MER":
            pizza = new PizzaFruitsDeMerStyleBrest(fabriqueIngredient);
            break;
        default:
            pizza = null;
        }

        return pizza;
    }

}
