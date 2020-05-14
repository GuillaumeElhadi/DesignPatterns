package decortateur.v0.supplement;

import decortateur.v0.boisson.Boisson;

public class Chantilly extends DecorateurIngredient {

    Boisson boisson;

    public Chantilly(Boisson boisson) {
        this.boisson = boisson;
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " Chantilly";
    }

    @Override
    public double count() {
        return boisson.count() + 0.10;
    }

}
