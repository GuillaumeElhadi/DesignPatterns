package decorateur.v0;

import decorateur.v0.boisson.Boisson;
import decorateur.v0.boisson.Sumatra;
import decorateur.v0.supplement.Chantilly;
import decorateur.v0.supplement.Chocolat;

public class MainDecorateurV0 {

    public static void main(String[] args) {


        Boisson expresso = new Sumatra();
        expresso = new Chocolat(expresso);
        expresso = new Chocolat(expresso);
        expresso = new Chantilly(expresso);
        System.out.println(expresso.getDescription() + " $" + expresso.count());

    }

}
