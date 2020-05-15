package fabrique.simple;

import fabrique.simple.createur.pizzeria.Pizzeria;
import fabrique.simple.createur.pizzeria.PizzeriaBrest;
import fabrique.simple.createur.pizzeria.PizzeriaStrasbourg;
import fabrique.simple.produit.pizza.Pizza;

public class FabriqueMainV0 {

    public static void main(String[] args) {
        Pizzeria pizzeriaBrest = new PizzeriaBrest();

        Pizzeria pizzeriaStrasbourg = new PizzeriaStrasbourg();

        Pizza pizza = pizzeriaBrest.commanderPizza("FROMAGE");
        System.out.println("Luc a commandé une " + pizza.getNom() + "\n");

        pizza = pizzeriaStrasbourg.commanderPizza("FROMAGE");
        System.out.println("Michel a commandé une " + pizza.getNom() + "\n");
    }

}
