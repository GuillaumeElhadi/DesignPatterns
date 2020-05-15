package fabrique.simple.createur.pizzeria;

import fabrique.simple.createur.ingredient.FabriqueIngredientsMarseille;
import fabrique.simple.produit.pizza.Pizza;
import fabrique.simple.produit.pizza.brest.PizzaFromageStyleBrest;

public class PizzeriaMarseille extends Pizzeria {

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
        FabriqueIngredientsMarseille fabriqueIngredient = new FabriqueIngredientsMarseille();
        switch (typePizza) {
        case "FROMAGE":
            pizza = new PizzaFromageStyleBrest(fabriqueIngredient);
            break;
        case "JAMBON_FROMAGE":
            pizza = new PizzaFromageStyleBrest(fabriqueIngredient);
            break;
        case "FRUITS_DE_MER":
            pizza = new PizzaFromageStyleBrest(fabriqueIngredient);
            break;
        default:
            pizza = null;
        }

        return pizza;
    }

}
