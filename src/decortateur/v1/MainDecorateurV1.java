package decortateur.v1;

import decortateur.v1.boisson.Boisson;
import decortateur.v1.boisson.Sumatra;
import decortateur.v1.supplement.Chantilly;
import decortateur.v1.supplement.Chocolat;
import decortateur.v1.supplement.Pistache;

public class MainDecorateurV1 {

    public static void main(String[] args) {


        Boisson expresso = new Sumatra();
        expresso = new Chocolat(expresso);
        expresso = new Chocolat(expresso);
        expresso = new Chantilly(expresso);
        expresso = new Pistache(expresso);
        System.out.println(expresso.getDescription() + " $" + expresso.count());

    }

}
