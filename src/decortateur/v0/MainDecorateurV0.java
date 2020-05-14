package decortateur.v0;

import decortateur.v0.boisson.Boisson;
import decortateur.v0.boisson.Sumatra;
import decortateur.v0.supplement.Chantilly;
import decortateur.v0.supplement.Chocolat;

public class MainDecorateurV0 {

    public static void main(String[] args) {


        Boisson expresso = new Sumatra();
        expresso = new Chocolat(expresso);
        expresso = new Chocolat(expresso);
        expresso = new Chantilly(expresso);
        System.out.println(expresso.getDescription() + " $" + expresso.count());

    }

}
