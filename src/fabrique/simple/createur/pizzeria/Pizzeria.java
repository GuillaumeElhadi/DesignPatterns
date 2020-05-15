package fabrique.simple.createur.pizzeria;

import fabrique.simple.produit.pizza.Pizza;

public abstract class Pizzeria {


    public Pizza commanderPizza(String typePizza) {

        Pizza maPizza = creerPizza(typePizza);

        maPizza.preparer();
        maPizza.cuire();
        maPizza.couper();
        maPizza.emballer();

        return maPizza;
    }

    public abstract Pizza creerPizza(String typePizza);

}
